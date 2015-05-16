inputStr = """
	@Id
	Integer id;
	  
	@Constraints.Required
	String mac;
	  
	String version;
	  
	String type;
"""

for line in inputStr.splitlines():
	if("Integer" in line or
	   "String" in line):
		type = line.split()[0]
		value = line.split()[-1].strip(";")
		outputLine =" 	public " + type + " get" +value[0].upper() + value[1:] + "(){\n	    return "+value+";\n	}"
		outputLine =outputLine +	"\n 	public void set" +value[0].upper() + value[1:] + "("+type+" "+value+"){\n	    this."+value+" = "+value+";\n	}"
		print(outputLine)


