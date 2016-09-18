var app = angular.module('app', ['ngAnimate', 'ngTouch']);

app.controller('MainCtrl', ['$scope', '$http',
    function ($scope, $http) {

    $http.get('http://localhost:8090/endpoint1')
    .success(function(data) {
        $scope.value1 = data;
    });

    $http.get('http://localhost:8090/endpoint2')
    .success(function(data) {
        $scope.value2 = data;
    });

    $http.get('http://localhost:8090/endpoint3')
    .success(function(data) {
        $scope.value3 = data;
    });

}]);
