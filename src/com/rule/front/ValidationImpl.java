package com.rule.front;
 
import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "com.rule.front.Validation")
public class ValidationImpl implements Validation{
 
	public String getValidation(int age, int salary, int work_exp_months) {
		// 18-65, <10000, <6
		if((age < 18) || (age > 65) || (salary < 10000) || (work_exp_months < 6)) {
			return "rejected";
		} else {
			return "accepted";
		}
	}
 
}