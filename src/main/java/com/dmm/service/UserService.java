package com.dmm.service;

import java.util.List;

import com.dmm.model.User;

public interface UserService {
	User getUserById(Integer userid);
	List<User> findAll();
}
