<%@ page import="com.javabeans.BeanFactory" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>showapps</title>
</head>
<body>
<jsp:useBean id="beanfactory" class="com.javabeans.BeanFactory" />
<div>
		<h1>View Applications</h1>
		
		
			<table align="left" border="1">
				<tr>
					<th>serial</th>
					<th>ID</th>
					<th>Status</th>
				</tr>
		
				<% String len;%>
				<%  len =BeanFactory.getInstance().getLength(); %>
				<% for(int i = 0; i < Integer.parseInt(len); i++ ){ %>  
		 			<jsp:setProperty name="beanfactory" property="index" value="<%= i %>" />
					<tr>
						<th><a href="appInfo.do?id=<%=BeanFactory.getInstance().getKey()%>"><%= i %></a>
						<th><jsp:getProperty name="beanfactory" property="key"/></th>
						<th><jsp:getProperty name="beanfactory" property="val"/></th>
						
					</tr>
		       
		
		       <%} %> 
			</table>
</div>
<a href="welcome.jsp" align="left">Back</a>
</body>
</html>