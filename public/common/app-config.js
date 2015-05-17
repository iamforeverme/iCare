/*config and start app*/
require.config({

    paths : {
    	app: '../common/icare'
        
    },

    shim : {
        //
       
    },

    packages : [  {
        name : "directives",
        location : "../common/directives",
        main : "main"
    }, {
        name : "services",
        location : "../common/services",
        main : "main"
    },{
    	name : "libs",
    	location : "../common/libs",
    	main : "main"
    }
    	//monitor
    	//patient
    	//nurse
    	//device
    	//data
    	//system
    ]
});

require([ "directives","services","libs" ])
{
	//inject app components here
    define(["angular"], function(ng) {

        var startApp = function() {
        	//Load the main module of application
            ng.module('services').config([ '$appConfigProvider', function($appConfigProvider) {
                $appConfigProvider.configureAllAppModules();
            } ]);
            
            require([ "app" ])
            {
                console.log("Starting ICare");
            }
        };
        
        //configuration functions for app components
        
        
        return {

            /**
             * @ngdoc method
             * @name configuration.app-config#startICare
             * @methodOf configuration.app-config
             * 
             * @description This method starts the iCare Application. This method should be called only after all
             *              configurations are performed.
             */
            'startApp' : startApp,
            
        };

    });
}