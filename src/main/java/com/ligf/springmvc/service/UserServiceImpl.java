package com.ligf.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ligf.springmvc.domain.User;
import com.ligf.springmvc.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper userMapper;

	public List<User> selectAllUser() {
		// TODO Auto-generated method stub
		return userMapper.selectAllUser();
	}

}
