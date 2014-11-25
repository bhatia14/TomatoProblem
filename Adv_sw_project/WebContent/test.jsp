<%@page import="java.io.PrintWriter"%>
<%@page import="main.WeightCall"%>
<html>
<body>
<% PrintWriter printWriter=response.getWriter(); 

	WeightCall weightCall=new WeightCall();
	printWriter.print(weightCall.clusterWeight());

%>

</body>
</html>