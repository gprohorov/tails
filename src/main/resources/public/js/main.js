
var app = angular.module("tails", []);

app.controller("AppCtrl", function($scope, $http){

    /*

   $scope.students = [{
       id: 1,
       firstName: "paul",
       lastName: "mccartney",
       group: 235
   }];

     */
    $scope.students = [];
     $http.get('/api/students').then(function (response){
  //  $http.get('http://localhost:8080/api/students').then(function (response){
        $scope.students=response.data;
        console.log(response);
    });





    });

