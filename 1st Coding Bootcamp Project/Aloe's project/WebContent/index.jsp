<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Aloe | Personal Website</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" type="text/css" href="/Aloe_project/CSS/main.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="icon" type="image/ico" href="/Aloe_project/img/alfa_icon.png" sizes="32x32">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
  <link href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet"> <!--gia ta social icons-->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>

<body data-spy="scroll" data-target=".navbar" data-offset="50">

<!-- Navbar -->
<nav class="navbar navbar-default">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Me</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#who section">WHO</a></li>
        <li><a href="#what section">WHAT</a></li>
        <li><a href="#where section">WHERE</a></li>
      </ul>
    </div>
  </div>
</nav>

<!-- First Container -->
<div id="who section" class="container-fluid bg-1 text-center">
  <h3 class="margin">Who Am I?</h3>
  <img src="/Aloe_project/img/IMG_9698-001.jpg" class="img-responsive img-circle margin" style="display:inline" alt="photo" width="300" height="300">
  <h3>I am Aloe Antoniou</h3>
</div>

<!-- Second Container -->
<div id="what section" class="container-fluid bg-2 text-center">
  <h3 class="margin">What Am I?</h3>
  <p>I am an Electrical & Computer Engineering graduate, aspiring to become a Developer.</p>
  <p>I live in Athens.</p>
  <p>I like travelling and photography (and eating).</p>
</div>

<!-- Third Container (Grid) -->
<div id="where section" class="container-fluid bg-3 text-center">
  <h3 class="margin">Where To Find Me?</h3><br>
  <div class="row">
  <div class="col-sm-3">
      <!-- to afino keno -->
    </div>
    <div class="col-sm-1">
      <a href="https://www.facebook.com/aloe.antoniou" target="_blank"><button class="btn btn-facebook"><i class="fa fa-facebook fa-3x" aria-hidden="true"></i></button></a>
    </div>
    <div class="col-sm-4">
      <a href="https://www.linkedin.com/in/aloeantoniou" target="_blank"><button class="btn btn-linkedin"><i class="fa fa-linkedin fa-3x"></i></button></a>
    </div>
    <div class="col-sm-1">
      <a href="https://github.com/Aloette" target="_blank"><button class="btn btn-github"><i class="fa fa-github fa-3x" aria-hidden="true"></i></button></a>
    </div>
       <div class="col-sm-3">
      <!-- to afino keno -->
    </div>
    
  </div>
</div>

<div id="contact" class="container-fluid bg-grey">
  <h2 class="text-center font">Contact</h2>
  <div class="row">
    <div class="col-sm-5 leftpadding">
      <p>Contact me and I'll get back to you ASAP</p>
      <p><span class="glyphicon glyphicon-map-marker"></span> Athens, GR</p>
      <p><span class="glyphicon glyphicon-phone"></span> +30 6976051866</p>
      <p><span class="glyphicon glyphicon-envelope"></span> aloeanto@gmail.com</p>
    </div>
    <form action="contactServlet" method="post">
    <div class="col-sm-7 rightpadding">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="message" placeholder="Comment" rows="5" required></textarea><br>
      <div class="row">
        <div class="col-sm-12 form-group">
          <button class="btn btn-default pull-right" type="submit">Send</button>
        </div>
      </div>
    </div>
    </form>
  </div>
</div>

<!-- Footer -->
<footer class="container-fluid bg-4 text-center">
  <a href="#">^BACK TO TOP</a>
</footer>

<script type="text/javascript">
window.onload = alertE();
function alertE(){
	var Msg = '<%=session.getAttribute("emailsend")%>';
	if (Msg == "true") {
		alert("Thank you for contacting me!");
		<% session.setAttribute("emailsend", "false"); %>
	}

}
</script>

</body>
</html>
    