/* global requirejs, define */
'use strict';
/**
 * This file sets up the basic module libraries you'll need for your application.
 */
requirejs.onError = function(err) {
    // console.log(err.requireType);
    if (err.requireType === 'timeout') {
        // console.error('modules: ' + err.requireModules);
    }
    throw err;
};



/**
 * RequireJS Config This is configuration for the entire application.
 */
require.config({
    enforceDefine : false,
    xhtml : false,
    // urlArgs : '_=' + Date.now(),
    waitSeconds : 15,
    packages : ["controllers", "directives", "filters", "services"],
    paths : {
        // NAMED REFERENCES
        config : 'config',
        app : 'app',
        

        // Bootstrap
        
        // jquery: '../bower_components/iids/components/jquery/jquery.min',
        jquery : '../bower_components/jquery/jquery',
        requirejs : '../bower_components/requirejs/require',

        // angularjs + modules
        angular : '../bower_components/angular/angular.min',

    },
    
    priority : [ "angular" ],
    shim : {
        angular : {
            deps : [ 'jquery' ],
            exports : 'angular'
        },
        bootstrap : {
            deps : [ 'jquery' ],
            exports : '$.fn.modal'
        },
    },
    config : {
        
    }
});

//Load the first app module and start app
/*require([], function(){
    
});*/


