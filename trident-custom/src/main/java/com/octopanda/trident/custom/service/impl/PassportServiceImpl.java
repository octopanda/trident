package com.octopanda.trident.custom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.octopanda.trident.custom.dao.OrganizationDao;
import com.octopanda.trident.custom.dao.UserDao;
import com.octopanda.trident.custom.model.Organization;
import com.octopanda.trident.custom.model.User;
import com.octopanda.trident.custom.service.PassportService;

@Service("passportService")
public class PassportServiceImpl implements PassportService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private OrganizationDao organizationDao;
	
	public User signIn(User user) {
		User dataUser = userDao.getUserByCondition(user);
		Organization organization = organizationDao.getOrganizationById(1L);
		System.out.println(organization.getName() + " comments:" + organization.getComments());
		return dataUser;
	}
}
