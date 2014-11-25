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
  <link rel="stylesheet" href="css/style2.css">
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
  <script src="js/myjs.js"></script>
    <script src="js/myjs2.js"></script>
        <script src="js/myjs2.js"></script>

</head>
<body>
<script>

	var clusterSize=<%=(String)request.getAttribute("clusterSize")%>;
	var looseSize=<%=(String)request.getAttribute("looseSize")%>;

	var clusterTrayMax=new Array();
	<%
	String[] var=(String[])request.getAttribute("clusterTrayMax");
	for(int i=0;i<var.length;i++){
	
	%>

	clusterTrayMax[<%=i%>]='<%=var[i]%>';
	<% } %>
	
	
	var looseTrayMax=new Array();
	<%
	String[] var2=(String[])request.getAttribute("looseTrayMax");
	for(int i=0;i<var2.length;i++){
		
	%>

		looseTrayMax[<%=i%>]='<%=var2[i]%>';
		<%} %>


		
		
	</script>






  <section class="container">
 
  <form method="post" action="" id="mainform">
  
  <input type="hidden" id="clusterval1" name="clusterval1" value=""></input>
  <input type="hidden" id="clusterval2" name="clusterval2" value=""></input>
  <input type="hidden" id="clusterval3" name="clusterval3" value=""></input>
  <input type="hidden" id="clusterval4" name="clusterval4" value=""></input>
  <input type="hidden" id="clusterval5" name="clusterval5" value=""></input>
  <input type="hidden" id="clusterval6" name="clusterval6" value=""></input>
  
  <input type="hidden" id="looseval1" name="looseval1" value=""></input>
  <input type="hidden" id="looseval2" name="looseval2" value=""></input>
  <input type="hidden" id="looseval3" name="looseval3" value=""></input>
  <input type="hidden" id="looseval4" name="looseval4" value=""></input>
  <input type="hidden" id="looseval5" name="looseval5" value=""></input>
  <input type="hidden" id="looseval6" name="looseval6" value=""></input>
  <input type="hidden" id="looseval7" name="looseval7" value=""></input>
  
  
    <div>
      <div class="tableValue" id="form1">
      <h1>Please Insert the value</h1>
        <table style="width:100%;">
            <tr>
                <td id="clusterMain">
				
				
                    <!--<asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>-->
                </td>
                <td id="looseMain">
                    &nbsp;</td>
                <td>
				
                   <!-- <asp:TextBox ID="TextBox5" runat="server"></asp:TextBox>-->
                </td>
            </tr>
    
        </table>
 
 </br>
        <table style="width:100%;">
            <tr>
                <td>
			<p><h2 id="clusterGenerate"> 0.0</h2></p>
                    <!--<asp:Button ID="Button1" runat="server" Text="Button" />-->
                </td>
                <td>
                    &nbsp;</td>
                <td>
			<p><h3 id="looseGenerate"> 0.0</h3></p>
                    <!--<asp:Button ID="Button2" runat="server" Text="Button" />-->
                </td>
            </tr>
            <tr>
                <td>
                    &nbsp;</td>
                <td>
                    &nbsp;</td>
                <td>
                    &nbsp;</td>
            </tr>
            <tr>
                <td>
			<p class="submit"><input type="button" name="commit" onClick="makeGetRequest(1);" value="Generate Cluster!!"></p>
			
                    <!--<asp:TextBox ID="TextBox14" runat="server"></asp:TextBox>-->
                </td>
                <td>
                    &nbsp;</td>
                <td>
			<p class="submit"><input type="button" onClick="makeGetRequest(2);" value="Generate Loose!!"></p>

                    <!--<asp:TextBox ID="TextBox15" runat="server"></asp:TextBox>-->
                </td>
            </tr>
        </table>
		</br>
        <table style="width:100%;">
            <tr>
                <td class="style1">
                    &nbsp;</td>
                <td style="font-weight: 700">
				<p class="submit"><input type="button" id="commit"  value="Lets Pack!!"></p>
                    <!--<asp:Button ID="Button3" runat="server" Text="Button" />-->
                </td>
                <td>
                    &nbsp;</td>
            </tr>
        </table>
    </div>
    </div>
    <div></div>>
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

