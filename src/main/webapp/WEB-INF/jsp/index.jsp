<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
   
    <!-- <link rel="shortcut icon" href="../../assets/ico/favicon.ico"> -->

    <title>Physician Finder</title>

    <!-- Bootstrap core CSS -->
    
    <link href="${pageContext.request.contextPath}/resources/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/bower_components/bootstrap/dist/css/font-awesome.min.css" rel="stylesheet">
	
    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/resources/bower_components/ng-table/ng-table.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/bower_components/AngularJS-Toaster/toaster.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/bower_components/select2/select2.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/bower_components/select2/select2-bootstrap3.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/bower_components/angular-motion/dist/angular-motion.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/bower_components/angular-loading-bar/build/loading-bar.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body ng-app="PF">

	<!-- Fixed navbar -->
    <div class="navbar navbar-default navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#/"><i class="fa fa-fw fa-user-md"></i> <b>Physician Finder</b></a>
        </div>
        <div class="navbar-collapse collapse">
		
        </div><!--/.nav-collapse -->
      </div>
    </div>
	
    <div class="container">
    	
      	<div ng-view></div>

    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="${pageContext.request.contextPath}/resources/bower_components/jquery/dist/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/bower_components/jquery-cookie/jquery.cookie.js"></script>
    <script src="${pageContext.request.contextPath}/resources/bower_components/momentjs/min/moment-with-langs.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/bower_components/ng-file-upload/angular-file-upload-shim.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/bower_components/angular/angular.js"></script>
    <script src="${pageContext.request.contextPath}/resources/bower_components/angular-resource/angular-resource.js"></script>
    <script src="${pageContext.request.contextPath}/resources/bower_components/angular-route/angular-route.js"></script>
    <script src="${pageContext.request.contextPath}/resources/bower_components/angular-animate/angular-animate.js"></script>
    <script src="${pageContext.request.contextPath}/resources/bower_components/angular-sanitize/angular-sanitize.js"></script>
     <script src="${pageContext.request.contextPath}/resources/bower_components/angular-cookies/angular-cookies.js"></script>
    <script src="${pageContext.request.contextPath}/resources/bower_components/ng-file-upload/angular-file-upload.js"></script>
  	<script src="${pageContext.request.contextPath}/resources/bower_components/ng-table/ng-table.js"></script>
  	<script src="${pageContext.request.contextPath}/resources/bower_components/angular-bootstrap/ui-bootstrap-tpls.min.js"></script>
  	<script src="${pageContext.request.contextPath}/resources/bower_components/angular-strap/dist/angular-strap.min.js"></script>
  	<script src="${pageContext.request.contextPath}/resources/bower_components/angular-strap/dist/angular-strap.tpl.min.js"></script>
  	<script src="${pageContext.request.contextPath}/resources/bower_components/AngularJS-Toaster/toaster.js"></script>
  	
  	<script src="${pageContext.request.contextPath}/resources/bower_components/select2/select2.min.js"></script>
  	<script src="${pageContext.request.contextPath}/resources/bower_components/angular-ui-select2/src/select2.js"></script>
  	<script src="${pageContext.request.contextPath}/resources/bower_components/angular-loading-bar/build/loading-bar.min.js"></script>  	
    
    
  	<script src="${pageContext.request.contextPath}/resources/js/app.js"></script>
  	<script src="${pageContext.request.contextPath}/resources/js/util.js"></script>
  	<script src="${pageContext.request.contextPath}/resources/js/router.js"></script>
  	<script src="${pageContext.request.contextPath}/resources/js/services.js"></script>
  	<script src="${pageContext.request.contextPath}/resources/js/directives.js"></script>
  	<script src="${pageContext.request.contextPath}/resources/js/dependencies.js"></script>
  	<script src="${pageContext.request.contextPath}/resources/js/controllers.js"></script>
  	
  	
  	
  	<toaster-container toaster-options="{'time-out': 2000}"></toaster-container>
  </body>
</html>
