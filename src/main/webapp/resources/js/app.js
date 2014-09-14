'use strict';

/**
 * Declare app level module which depends on filters and services
 */
var PF = angular.module('PF', ['PF.services', 'PF.directives',
    'PF.dependencies']);

PF.config(['$routeProvider', '$httpProvider', '$locationProvider',
    function($routeProvider, $httpProvider, $locationProvider) {
    }]);

/**
 * Function that is executed on every loading on a page.
 */
PF.run(function($rootScope, $location, toaster) {

});
