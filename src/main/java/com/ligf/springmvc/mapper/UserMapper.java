package com.ligf.springmvc.mapper;

import java.util.List;

import com.ligf.springmvc.domain.User;

public interface UserMapper {
	
	List<User> selectAllUser();

}
