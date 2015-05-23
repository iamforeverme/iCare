/* global define */

'use strict';

define([ 'angular','datatables','datatables-bootstrap'], function(ng) {
    ng.module('controllers').controller('patientController', [
        '$scope',
        function($scope){
        	    $('#example').dataTable( {
        	    	
        	        "ajax": "/libs/datagrids.json",
        	        "columns": [
        	            { "data": "name", "name":"姓名"},
        	            { "data": "position", "name":"姓名" },
        	            { "data": "office", "name":"姓名" },
        	            { "data": "extn" , "name":"姓名"},
        	            { "data": "start_date", "name":"姓名" },
        	            { "data": "salary" , "name":"姓名"}
        	        ]
        	    } );
        	    
        }
    ]);
});


