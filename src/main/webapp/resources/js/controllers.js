'use strict';

/**
 * Controllers
 */

PF.controller('SearchController', [
		'$scope',
		'Search',
		'Symptom',
		function($scope, Search, Symptom) {
			$scope.search = function() {
				var query = "";
				$.each($scope.keywords, function() {
					query = query + this.id + ",";
				});
				query = query.substring(0, query.length - 1);
				if($scope.specific) {
					$scope.results = Search.specificSearch({
						keywords : query
					});
				} else {
					$scope.results = Search.search({
						keywords : query
					});
				}
			};
			
			var symptoms = Symptom.query();

			
			$scope.options = {
				query : function(query) {
					var data = {
						results : []
					};

					$.each(symptoms, function() {
						if (query.term.length == 0
								|| this.name.toUpperCase().indexOf(
										query.term.toUpperCase()) >= 0) {
							data.results.push({
								id : this.id,
								text : this.name
							});
						}
					});
					query.callback(data);
				},
				multiple : true
			};
			
			$scope.clearGender = function() {
				delete $scope.gender;
			};
			

		} ]);
