package com.sprhib.controller;

import java.net.MalformedURLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sprhib.dao.UserDAO;
import com.sprhib.domain.User;
import com.sprhib.service.IUserService;

@Controller
public class UserController {

	@Autowired
	private IUserService userService;
	@Autowired
	private UserDAO userdao;

	@RequestMapping(value = "/add.do", method = RequestMethod.POST)
	public String addContact(@ModelAttribute User app, Model model) {
		model.addAttribute("app", app);
		// System.out.println("Name:"+app.getfirstname());
		userService.addUser(app);
		// userService.addUser(firstname,
		// middlename,lastname,date,martialstatus,ssn,loanammount,loan_purpose,address_line1,address_line2,city,state,postal_code,home_phone,office_phone,phone,email_address,description);
		String redirectView = "redirect:/Success.jsp";
		return redirectView;
	}

	@RequestMapping(value = "/showapp.do", method = RequestMethod.GET)
	public String showapp() throws MalformedURLException {
		System.out.println("INSIDE SHOW APP");
		// bean.setRes(userdao.getapps());
		userdao.getapps();
		// bean.setA(10);

		String redirectView = "redirect:/showapp.jsp";
		return redirectView;

	}

	@RequestMapping(value = "/show.do", method = RequestMethod.GET)
	public String showPage() {
		String redirectView = "redirect:/welcome.jsp";
		return redirectView;
	}

	@RequestMapping(value = "/appInfo.do", method = RequestMethod.GET, params = { "id" })
	public String showApp(@RequestParam(value = "id") String id) {
		System.out.print(id);
		userdao.getInfo(id);

		String redirectView = "redirect:/appInfo.jsp";
		System.out.println("returning from showapp");
		return redirectView;
	}

}