<%@ page import="com.javabeans.BeanFactory" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User data</title>
</head>
<body>
<form name="userForm" action="showapp.jsp" >
<div>
	<h2>View application</h2>
	</div>
	<div style="float: left; ">		
		First name <input type="text" name="firstname" value=<% out.print(BeanFactory.getInstance().getfirstname()); %>
 readonly ><br>
 
		Middle name <input type="text" name="middlename" value="<% out.print(BeanFactory.getInstance().getmiddlename()); %>
" readonly ><br>
		Last name <input type="text" name="lastname" value="<% out.print(BeanFactory.getInstance().getlastname()); %>
" readonly ><br>
		Date of Birth <input type="text" name="date" value="<% out.print(BeanFactory.getInstance().getdate()); %>
" readonly ><br>  
		Marital Status <input type="text" name="martialstatus" value="<% out.print(BeanFactory.getInstance().getmartialstatus()); %>
" readonly><br>
		SSN text <input type="text" name="ssn" value="<% out.print(BeanFactory.getInstance().getssn()); %>
" readonly><br>
		Loan Amount <input type="text" name="loanammount" value="<% out.print(BeanFactory.getInstance().getloanammount()); %>
" readonly><br>
		Loan Purpose <input type="text" name="loan_purpose" value="<% out.print(BeanFactory.getInstance().getloan_purpose()); %>
" readonly>  <br>
	</div>
	<div align="right">
		Address<br>
		Address Line 1<input type="text" name="address_line1" value="<% out.print(BeanFactory.getInstance().getaddress_line1()); %>
" readonly><br>
		Address Line 2<input type="text" name="address_line2" value="<% out.print(BeanFactory.getInstance().getaddress_line2()); %>
" readonly><br>
		City<input type="text" name="city" value="<% out.print(BeanFactory.getInstance().getcity()); %>
" readonly><br>
		State<input type="text" name="state" value="<% out.print(BeanFactory.getInstance().getstate()); %>
" readonly><br>
		Postal Code<input type="text" name="postal_code" value="<% out.print(BeanFactory.getInstance().getpostal_code()); %>
" readonly><br>		
	</div >	
	<div align="right">
			<br>
			Contact Information<br>
			Home Phone<input type="text" name="home_phone" value="<% out.print(BeanFactory.getInstance().gethome_phone()); %>
" readonly><br>		
			Office Phone<input type="text" name="office_phone" value="<% out.print(BeanFactory.getInstance().getoffice_phone()); %>
" readonly><br>		
			Phone<input type="text" name="<% out.print(BeanFactory.getInstance().getphone()); %>
"><br>		
			Email Address<input type="text" name="email_address" value="<% out.print(BeanFactory.getInstance().getemail_address()); %>
" readonly><br>
	</div>
	
	<div>
	Description<br> <input type="text" name="description" value="<% out.print(BeanFactory.getInstance().getdescription()); %>
" readonly><br>
	</div>
	<div>
		Employment Details<br>
		<div style="float: left; ">
			Employer name <input type="text" name="employer_name" value="<% out.print(BeanFactory.getInstance().getemployee_name()); %>
" readonly><br>
			Annual Salary <input type="text" name="annual_salary" value="<% out.print(BeanFactory.getInstance().getannual_salary()); %>
" readonly><br>			
		</div>
		<div align="right">
			Work Experience in months <input type="text" name="exp" value="<% out.print(BeanFactory.getInstance().getexp()); %>
" readonly><br>
			Designation<input type="text" ><br>
		</div>
	</div>
	
	<div>
		<br>Address<br>
		Address Line 1<input type="text" name="emp_address_line1" value="<% out.print(BeanFactory.getInstance().getemp_address_line1()); %>
" readonly><br>
		Address Line 2<input type="text" name="emp_address_line2" value="<% out.print(BeanFactory.getInstance().getemp_address_line2()); %>
" readonly><br>
		City<input type="text" name="emp_city" value="<% out.print(BeanFactory.getInstance().getemp_city()); %>
" readonly><br>
		State<input type="text" name="emp_state" value=<% out.print(BeanFactory.getInstance().getemp_state()); %>
 readonly><br>
		Postal Code<input type="text" name="emp_pincode" value="<% out.print(BeanFactory.getInstance().getpostal_code()); %>
" readonly><br>		
	</div>
<div style="float: left; ">
<input type="submit" value="Back"/>
</div>
</form>
</body>
</html>