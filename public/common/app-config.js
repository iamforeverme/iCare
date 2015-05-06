/*config and start app*/
require.config({

    paths : {
    	app: '../common/icare'
        
    },

    shim : {
        //
       
    },

    packages : [ {
        //name : "controllers",
        //location : "../scripts/controllers/opsis-controllers",
        ///main : "main"
    }]

});

require([ "directives","services" ])
{
	//inject app components here
    define(["angular"], function(ng) {

        var startICare = function() {
            require([ "app" ])
            {
                console.log("Starting ICare");
            }
        };
        
        var startApp = function(){
        	//config app components
        	startICare();
        }
        //configuration functions for app components
        
        /**
         * @ngdoc service
         * @requires controllers
         * @requires directives
         * @requires services
         * @requires angular
         * @name configuration.app-config
         * 
         * @description These methods are the iCare application configuration support methods. They are used to
         *              configure and run the iCare Application.
         */
        return {

            /**
             * @ngdoc method
             * @name configuration.app-config#startICare
             * @methodOf configuration.app-config
             * 
             * @description This method starts the iCare Application. This method should be called only after all
             *              configurations are performed.
             */
            'startICare' : startICare,
            
            /**
             * @ngdoc method
             * @name configuration.app-config#startApp
             * @methodOf configuration.app-config
             * 
             * @description configure all the app component modules and start iCare
             */
            'startApp' : startApp
        };

    });
}