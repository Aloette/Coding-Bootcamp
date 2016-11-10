<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
   <%@ page import="org.afdemp.bootcamp.sofos.dao.*"%>
   <%@ page import="org.afdemp.bootcamp.sofos.domain.*"%>
   <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="Student registration page">
    <meta name="author" content="sofos@aueb.gr">    
    <title>Find Student</title>
    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">   
    <!-- Custom styles for this template -->
    <link href="css/mystyle.css" rel="stylesheet">  

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
  
   <!-- Fixed navbar -->
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="register.jsp">LESSON 2</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li><a href="register.jsp">Register</a></li>
            <li><a href="viewstudents.jsp">View</a></li>
            <li class="active"><a href="findstudent.jsp">Find</a></li>                      
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container theme-showcase" role="main">

		<!-- Main jumbotron for a primary marketing message or call to action -->
		<div class="jumbotron">
			<h1>LESSON 2</h1>			
		</div>
  
  
  
  
  
  
<% StudentDAO foititis = new StudentDAO(); 
foititis.open();
List<Student> lista = foititis.getStudents();
if (lista.size()==0){	
%>
<table class="table table-bordered">
			<thead>
				<tr>
					<th>Αρ. Μητρώου</th>
					<th>Όνομα</th>
					<th>Επώνυμο</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td align="center" colspan="3">Δεν βρέθηκαν καταχωρημένοι φοιτητές</td>
				</tr>
			</tbody>
</table>
<% } else { %>
<table class="table table-bordered">
			<thead>
				<tr>
					<th>Αρ. Μητρώου</th>
					<th>Όνομα</th>
					<th>Επώνυμο</th>
				</tr>
			</thead>
			<tbody>
			<% for (int i=0;i<lista.size();i++) { %>
				<tr>
					<td><%= lista.get(i).getAm()%></td>
					<td><%= lista.get(i).getName()%></td>
					<td><%= lista.get(i).getSurname()%></td>
				</tr>
				<% } %>
			</tbody>
</table>
<% } %>
<%foititis.close();%>








<!-- footer -->
	<footer class="navbar-inverse">
		<div class="container">
			<div class="row">             
				<div class="col-xs-12">
					<p class="text-center">&copy; Copyright 2016 by "το Ονοματεπώνυμο σας"</p>
				</div>
			</div>
		</div>
	</footer>
	<!-- End footer -->

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>    
  </body>
</html>    