'use strict';

/**
 * The services map method to the adequate RestController
 */

angular.module('PF.services', []);

PF.factory('Search', [ '$resource', function($resource) {
	return $resource(PFUtil.ctx('/data/rest/search/:id'), {}, {
		'search' : {
			method : 'GET',
			url : PFUtil.ctx('/data/rest/search/:keywords')
		},
		'specificSearch' : {
			method : 'GET',
			url : PFUtil.ctx('/data/rest/specificSearch/:keywords')
		}
	});
} ]);

PF.factory('Symptom', [ '$resource', function($resource) {
	return $resource(PFUtil.ctx('/data/rest/symptom/:id'), {}, {});
} ]);

PF.filter('years', function() {
	return function(date) {
		date = new Date(date);
		var currDate = new Date();
		var year = currDate.getFullYear();
		return (year - date.getFullYear()) + " years";
	};
});