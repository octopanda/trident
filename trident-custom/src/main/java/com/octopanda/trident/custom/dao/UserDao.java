package com.octopanda.trident.custom.dao;

import com.octopanda.trident.custom.model.User;

public interface UserDao {
	public User getUserByCondition(User condition);
}
