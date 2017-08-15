package com.dmm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmm.base.model.QueryVo;
import com.dmm.dao.UserMapper;
import com.dmm.model.User;
import com.dmm.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private QueryVo queryVo;
	@Override
	public User getUserById(Integer userid) {
		return userMapper.selectByPrimaryKey(userid);
	}
	@Override
	public List<User> findAll() {
		return userMapper.selectByWhere(queryVo);
	}

}
