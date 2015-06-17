package com.sprhib.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author pk
 * 
 */
@Entity
@Table(name = "User")
public class User {
	@Id
	@Column(name = "id")
	@GeneratedValue
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "firstname")
	private String firstname;

	public String getfirstname() {
		return firstname;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "lastname")
	private String lastname;

	public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	@Column(name = "middlename")
	private String middlename;

	public String getmiddlename() {
		return middlename;
	}

	public void setmiddlename(String middlename) {
		this.middlename = middlename;
	}

	@Column(name = "date")
	private String date;

	public String getdate() {
		return date;
	}

	public void setdate(String date) {
		this.date = date;
	}

	@Column(name = "martialstatus")
	private String martialstatus;

	public String getmartialstatus() {
		return martialstatus;
	}

	public void setmartial_status(String martialstatus) {
		this.martialstatus = martialstatus;
	}

	@Column(name = "ssn")
	private String ssn;

	public String getssn() {
		return ssn;
	}

	public void setssn(String ssn) {
		this.ssn = ssn;
	}

	@Column(name = "loanammount")
	private String loanammount;

	public String getloanammount() {
		return loanammount;
	}

	public void setloanammount(String loanammount) {
		this.loanammount = loanammount;
	}

	@Column(name = "loan_purpose")
	private String loan_purpose;

	public String getloan_purpose() {
		return loan_purpose;
	}

	public void setloan_purpose(String loan_purpose) {
		this.loan_purpose = loan_purpose;
	}

	@Column(name = "address_line1")
	private String address_line1;

	public String getaddress_line1() {
		return address_line1;
	}

	public void setaddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	@Column(name = "address_line2")
	private String address_line2;

	public String getaddress_line2() {
		return address_line2;
	}

	public void setaddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	@Column(name = "city")
	private String city;

	public String getcity() {
		return city;
	}

	public void setcity(String city) {
		this.city = city;
	}

	@Column(name = "state")
	private String state;

	public String getstate() {
		return state;
	}

	public void setstate(String state) {
		this.state = state;
	}

	@Column(name = "postal_code")
	private String postal_code;

	public String getpostal_code() {
		return postal_code;
	}

	public void setpostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	@Column(name = "home_phone")
	private String home_phone;

	public String gethome_phone() {
		return home_phone;
	}

	public void sethome_phone(String home_phone) {
		this.home_phone = home_phone;
	}

	@Column(name = "office_phone")
	private String office_phone;

	public String getoffice_phone() {
		return office_phone;
	}

	public void setoffice_phone(String office_phone) {
		this.office_phone = office_phone;
	}

	@Column(name = "phone")
	private String phone;

	public String getphone() {
		return phone;
	}

	public void setphone(String phone) {
		this.phone = phone;
	}

	@Column(name = "email_address")
	private String email_address;

	public String getemail_address() {
		return email_address;
	}

	public void setemail_address(String email_address) {
		this.email_address = email_address;
	}

	@Column(name = "description")
	private String description;

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	@Column(name = "employee_name")
	private String employee_name;

	public String getemployee_name() {
		return employee_name;
	}

	public void setemployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	@Column(name = "annual_salary")
	private String annual_salary;

	public String getannual_salary() {
		return annual_salary;
	}

	public void setannual_salary(String annual_salary) {
		this.annual_salary = annual_salary;
	}

	@Column(name = "exp")
	private String exp;

	public String getexp() {
		return exp;
	}

	public void setexp(String exp) {
		this.exp = exp;
	}

	@Column(name = "emp_address_line1")
	private String emp_address_line1;

	public String getemp_address_line1() {
		return emp_address_line1;
	}

	public void setemp_address_line1(String emp_address_line1) {
		this.emp_address_line1 = emp_address_line1;
	}

	@Column(name = "emp_address_line2")
	private String emp_address_line2;

	public String getemp_address_line2() {
		return emp_address_line2;
	}

	public void setemp_address_line2(String emp_address_line2) {
		this.emp_address_line2 = emp_address_line2;
	}

	@Column(name = "emp_city")
	private String emp_city;

	public String getemp_city() {
		return emp_city;
	}

	public void setemp_city(String emp_city) {
		this.emp_city = emp_city;
	}

	@Column(name = "emp_state")
	private String emp_state;

	public String getemp_state() {
		return emp_state;
	}

	public void setemp_state(String emp_state) {
		this.emp_state = emp_state;
	}

	@Column(name = "emp_pincode")
	private String emp_pincode;

	public String getemp_pincode() {
		return emp_pincode;
	}

	public void setemp_pincode(String emp_pincode) {
		this.emp_pincode = emp_pincode;
	}
}
