inputStr = """
	@Id
	Integer id;
	  
	@ManyToOne
	Protege protege;
	
	@ManyToOne
	SignalType signalType;
	
	@Constraints.Required
	Timestamp rec_time;
"""
strValue = ""
valueList = []
for line in inputStr.splitlines():
	if(";" in line):
		type = line.split()[0]
		value = line.split()[-1].strip(";")
		outputLine =" 	public " + type + " get" +value[0].upper() + value[1:] + "(){\n	    return "+value+";\n	}"
		outputLine =outputLine +	"\n 	public void set" +value[0].upper() + value[1:] + "("+type+" "+value+"){\n	    this."+value+" = "+value+";\n	}"
		print(outputLine)
		valueList.append(value)
		if(value!="id"):
			strValue = strValue+"+\"',"+value + ":'\"+"+value+".toString()\n"

strValue = strValue[4:]
outputLIst ="""
    public String toJSONString() {
	
    return "{ %s
    		+"' }";
}
"""%(strValue)

print(outputLIst)
print(",".join(valueList))
