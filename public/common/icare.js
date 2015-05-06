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
         "services",
         "routes"], 
         function(require, angular,directives,services,routes) {

    /**
     * Application definition This is where the AngularJS application is defined and all application dependencies
     * declared.
     * 
     * @type {module}
     */
    var icareApp = angular.module('icareApp', [
                        'directives', 
                        'services', 
                        'routes']);

	

    /**
     * Main Controller This controller is the top most level controller that allows for all child controllers to access
     * properties defined on the $rootScope.
     */
	icareApp.controller('MainCtrl', [
            '$scope',
            '$rootScope',
            '$routeParams',
            '$location',
            function($scope, $rootScope, $routeParams, $location) {
                $rootScope.App = {
                    version : '1.0',
                    name : 'iCare'
                };

            } ]);

    /**
     * Tabs controller
     * 
     * @param $scope
     * @param $location
     * @constructor
     */
	icareApp.controller('TabsCtrl', [ '$scope', '$rootScope', '$location', function($scope, $rootScope, $location) {
    } ]);

    // Bootstrap the application
    angular.bootstrap(document, [ 'icareApp' ]);

    // Set on window for debugging
    window.icareApp = icareApp;
});