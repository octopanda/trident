package com.octopanda.trident.custom;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.octopanda.trident.custom.model.User;
import com.octopanda.trident.custom.service.PassportService;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={"classpath:spring/trident-custom-context.xml"}) 
public class PassportTest {
	@Autowired
	private PassportService passportService;
	
	@Test
	public void testSignIn() {
		User condition = new User("william_k_han", "Fay860529");
		User user = passportService.signIn(condition);
		System.out.println(user.getNickname());
		org.junit.Assert.assertNotNull(user);
	}
}
