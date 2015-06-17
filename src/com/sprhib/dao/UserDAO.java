/**
 * 
 */
package com.sprhib.dao;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.List;
import java.util.Iterator;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javabeans.BeanFactory;
import com.rule.front.Validation;
import com.sprhib.domain.Bureaudata;
import com.sprhib.domain.User;

/**
 * @author Pardeep Kumar
 * 
 */
@Repository("userDAO")
public class UserDAO implements IUserDAO {

	@Autowired
	public SessionFactory factory;

	public boolean addUser(User app) {
		factory.getCurrentSession().beginTransaction();
		factory.getCurrentSession().save(app);
		factory.getCurrentSession().getTransaction().commit();
		return true;
	}

	public void getapps() throws MalformedURLException {
		factory.getCurrentSession().beginTransaction();
		List<?> users = factory.getCurrentSession().createQuery("FROM User")
				.list();
		BeanFactory.getInstance().flushKeyVal();
		for (Iterator<?> iterator = users.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			// System.out.print("First Name: " + user.getmartialstatus());
			// System.out.print("  Last Name: " + user.getlastname());
			// System.out.println("  Salary: " + user.getmiddlename());

			URL url = new URL("http://localhost:9999/ws/hello?wsdl");

			// 1st argument service URI, refer to wsdl document above
			// 2nd argument is service name, refer to wsdl document above
			QName qname = new QName("http://front.rule.com/",
					"ValidationImplService");

			Service service = Service.create(url, qname);

			Validation val = service.getPort(Validation.class);
			String fullDate = user.getdate();
			// String fullDate="12121995";
			// user.setannual_salary("20000");
			// user.setexp("13");
			Calendar now = Calendar.getInstance(); // This gets the current date
													// and time.
			int year = now.get(Calendar.YEAR)
					- Integer.parseInt(fullDate.substring(4));
			int month = now.get(Calendar.MONTH)
					- Integer.parseInt(fullDate.substring(2, 4));
			int date = now.get(Calendar.DAY_OF_MONTH)
					- Integer.parseInt(fullDate.substring(0, 2));

			if (date < 0)
				month--;
			if (month < 0)
				year--;
			System.out.println(year + " " + month + " " + date);
			// bean.put(user.getssn(),
			// val.getValidation(year,Integer.parseInt(user.getannual_salary()),Integer.parseInt(user.getexp())));
			String value = val.getValidation(year,
					Integer.parseInt(user.getannual_salary()),
					Integer.parseInt(user.getexp()));
			double threshold = 0.372400865;
			if (value.equals("accepted")) {
				List<?> bureau = factory
						.getCurrentSession()
						.createQuery(
								"FROM Bureaudata where ssn=" + user.getssn())
						.list();
				Bureaudata bureaudata = (Bureaudata) bureau.get(0);
				double loan_amnt = Double.parseDouble(user.getloanammount());
				double exp = Double.parseDouble(user.getexp()) / 12;
				double sal = Double.parseDouble(user.getannual_salary());
				double del_2 = Double.parseDouble(bureaudata.getdelinq_2yrs());
				double inq_6_mnths = Double.parseDouble(bureaudata
						.getinq_last_6mths());
				double mnths_del = Double.parseDouble(bureaudata
						.getmths_since_last_delinq());
				double mnths_rec = Double.parseDouble(bureaudata
						.getmths_since_last_record());
				double open_acnt = Double.parseDouble(bureaudata.getopen_acc());
				double pub_rec = Double.parseDouble(bureaudata.getpub_rec());
				double rev_bal = Double.parseDouble(bureaudata.getrevol_bal());
				double rev_util = Double
						.parseDouble(bureaudata.getrevol_util());
				double total_acnt = Double.parseDouble(bureaudata
						.gettotal_acc());
				double model_score = loan_amnt * 0.0000101441424682366 + exp
						* 0.008576562 + sal * (-5.20538432494094) * .0000001
						+ del_2 * 0.012911943 + inq_6_mnths * 0.012454784
						+ mnths_del * -0.000169455 + mnths_rec * 0.001380408
						+ open_acnt * 0.007837243 + pub_rec * 0.070576531
						+ rev_bal * -1.95408226224437 * .000001 + rev_util
						* 0.21479371 + total_acnt * -0.003416354;
				if (model_score > threshold)
					value = "rejected";
				System.out.print(model_score);
			}
			BeanFactory.getInstance().insertToKey(user.getssn());
			BeanFactory.getInstance().insertToValue(value);
		}
		factory.getCurrentSession().getTransaction().commit();
		// BeanFactory.getInstance().setMyMap(returnMap);
	}

	public void getInfo(String id1) {
		System.out.println(id1);
		// getbureaudata();
		factory.getCurrentSession().beginTransaction();
		List<?> users = factory.getCurrentSession()
				.createQuery("FROM User where ssn=" + id1).list();
		User user = (User) users.get(0);
		System.out.println("putting user data to bean");
		factory.getCurrentSession().getTransaction().commit();

		BeanFactory.getInstance().setfirstname(user.getfirstname());
		BeanFactory.getInstance().setmiddlename(user.getmiddlename());
		BeanFactory.getInstance().setlastname(user.getlastname());
		BeanFactory.getInstance().setdate(user.getdate());
		BeanFactory.getInstance().setmartial_status(user.getmartialstatus());
		BeanFactory.getInstance().setssn(user.getssn());
		BeanFactory.getInstance().setloanammount(user.getloanammount());
		BeanFactory.getInstance().setloan_purpose(user.getloan_purpose());
		BeanFactory.getInstance().setdescription(user.getdescription());
		BeanFactory.getInstance().setaddress_line1(user.getaddress_line1());
		BeanFactory.getInstance().setaddress_line2(user.getaddress_line2());
		BeanFactory.getInstance().setcity(user.getcity());
		BeanFactory.getInstance().setstate(user.getstate());
		BeanFactory.getInstance().setpostal_code(user.getpostal_code());
		BeanFactory.getInstance().setoffice_phone(user.getoffice_phone());
		BeanFactory.getInstance().sethome_phone(user.getoffice_phone());
		BeanFactory.getInstance().setphone(user.getphone());
		BeanFactory.getInstance().setemail_address(user.getemail_address());
		BeanFactory.getInstance().setemployee_name(user.getemployee_name());
		BeanFactory.getInstance().setannual_salary(user.getannual_salary());
		BeanFactory.getInstance().setexp(user.getexp());
		BeanFactory.getInstance().setemp_address_line1(
				user.getemp_address_line1());
		BeanFactory.getInstance().setemp_address_line2(user.getaddress_line2());
		BeanFactory.getInstance().setemp_city(user.getemp_city());
		BeanFactory.getInstance().setemp_state(user.getemp_state());
		BeanFactory.getInstance().setemp_pincode(user.getemp_pincode());
		System.out.println("finished");
	}
}
