'use strict';

/**
 * Performs the navigation of the application
 */

PF.config(['$routeProvider', '$locationProvider',
    function($routeProvider, $locationProvider) {
      $routeProvider.when('/', {
        templateUrl: 'views/search.html',
        controller: 'SearchController'
      });
    }]);
