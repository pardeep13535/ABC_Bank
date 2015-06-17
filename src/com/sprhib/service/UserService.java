/**
 * 
 */
package com.sprhib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sprhib.dao.IUserDAO;
import com.sprhib.domain.User;

/**
 * @author SushantKunal
 * 
 */
@Service("userService")
public class UserService implements IUserService {

	@Autowired
	private IUserDAO userDAO;

	@Override
	@Transactional
	public void addUser(User app) {
		userDAO.addUser(app);
		// TODO Auto-generated method stub

	}

}
