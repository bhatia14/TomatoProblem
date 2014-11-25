<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Tomato Problem</title>
  <link rel="stylesheet" href="css/style.css">
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
  <script src="js/myjs.js"></script>
  
  
</head>
<body>
  <section class="container">
  <form method="post" action="FirstController">
    <div class="login" id="form1">
      <h1>Enter the number of the Tray</h1>
      
     <p><input id="cluster" type="text" name="cluster" placeholder="Number of trays for clusters tomatos"></p>
        <p><input id="loose" type="text" name="loose"  placeholder="Number of trays for loose tomatos"></p>
		
        <!--<p class="remember_me">
          <label>
            <input type="checkbox" name="remember_me" id="remember_me">
            Remember me on this computer
          </label>
        </p>-->
        <p class="submit"><input type="button" name="commit" id="button" value="Done!!"></p>
    
	</div>
	

	<div id="weightEnter">
	<div class="login"  >	  
	
		<h1>Enter the size of cluster</h1>  
	  	<div id="textField">
	
		
		</div>
	
<!--        <p><input type="text" name="cluster" value="" placeholder="Number of trays for clusters tomatos"></p>
        <p><input type="text" name="loose" value="" placeholder="Number of trays for loose tomatos"></p>-->
        <!--<p class="remember_me">
          <label>
            <input type="checkbox" name="remember_me" id="remember_me">
            Remember me on this computer
          </label>
        </p>-->
        <p class="submit"><input type="button" id="clusterButton" name="commit" value="Done!!"></p>
		
		
    
	  </div>
	</div>
	
	
	
	<div id="weightEnter2">
	<div class="login"  >	  
	  
	  <h1>Enter the size of trays of loose tomatos</h1>
	  	<div id="textField2">
		
		
		</div>
	
<!--        <p><input type="text" name="cluster" value="" placeholder="Number of trays for clusters tomatos"></p>
        <p><input type="text" name="loose" value="" placeholder="Number of trays for loose tomatos"></p>-->
        <!--<p class="remember_me">
          <label>
            <input type="checkbox" name="remember_me" id="remember_me">
            Remember me on this computer
          </label>
        </p>-->
        <p class="submit"><input type="submit" name="commit" value="Done!!"></p>
		
		
      
	  </div>
	</div>
	</form>
	
	
<!--    <div class="login-help">
      <p>Forgot your password? <a href="index.html">Click here to reset it</a>.</p>
    </div>-->
  </section>

  <!--<section class="about">
    <p class="about-links">
      <a href="http://www.cssflow.com/snippets/login-form" target="_parent">View Article</a>
      <a href="http://www.cssflow.com/snippets/login-form.zip" target="_parent">Download</a>
    </p>
    <p class="about-author">
      &copy; 2012&ndash;2013 <a href="http://thibaut.me" target="_blank">Thibaut Courouble</a> -
      <a href="http://www.cssflow.com/mit-license" target="_blank">MIT License</a><br>
      Original PSD by <a href="http://www.premiumpixels.com/freebies/clean-simple-login-form-psd/" target="_blank">Orman Clark</a>
  </section>-->
</body>
</html>
