/*This is the main angular module of the application*/
/** global angular, require */
'use strict';

/**
 * Load controllers, directives, filters, services before bootstrapping the application. NOTE: These are named
 * references that are defined inside of the config.js RequireJS configuration file.
 */
define([ "require",
         "angular", 
         "directives", 
         "services"], 
         function(require, angular,directives,services) {

    /**
     * Application definition This is where the AngularJS application is defined and all application dependencies
     * declared.
     * 
     * @type {module}
     */
    var mainApp = angular.module('mainApp', [
                        'ngRoute',                    
                        'directives', 
                        'services']);

    mainApp.config([ '$appConfigProvider',  function($appConfigProvider) {
        $appConfigProvider.configAppCB(mainApp);

    } ]);
    
    /**
     * Router Config This is the router definition that defines all application routes.
     */
    mainApp.config([ '$routeProvider', '$locationProvider', '$appConfigProvider', function ($routeProvider, $locationProvider, $appConfigProvider){
        $appConfigProvider.configRoutesCB($routeProvider, $locationProvider);
    } ]).run([ '$location', '$rootScope', function($location, $rootScope) {

    } ]);


    /**
     * Main Controller This controller is the top most level controller that allows for all child controllers to access
     * properties defined on the $rootScope.
     */
	mainApp.controller('MainCtrl', [
            '$scope',
            '$rootScope',
            '$routeParams',
            '$location',
            function($scope, $rootScope, $routeParams, $location) {
                $rootScope.App = {
                    version : '1.0',
                    name : 'iCare'
                };
                
                $appConfig.configMainCtrlCB(mainApp, $scope, $rootScope, $routeParams, $location, $icare);

            } ]);

	 mainApp.controller('TabsCtrl', [ '$scope', '$rootScope', '$location', '$icare', '$appConfig', function($scope, $rootScope, $location, $icare, $appConfig) {
	        $appConfig.configTabsCB($scope, $rootScope, $location, $icare);
	    } ]);

    // Bootstrap the application
    angular.bootstrap(document, [ 'mainApp' ]);

    // Set on window for debugging
    window.mainApp = mainApp;
});