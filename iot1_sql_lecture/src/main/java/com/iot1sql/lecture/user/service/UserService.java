package com.iot1sql.lecture.user.service;

import java.util.List;

import com.iot1sql.lecture.user.dao.dto.UserInfo;

public interface UserService {

	public UserInfo login(UserInfo user);

	public UserInfo selectUser(UserInfo user);

	public List<UserInfo> selectUserList(UserInfo user);

	public int insertUser(UserInfo user);
	
	public int insertUserList(UserInfo[] userList);
	
	public int updatetUser(UserInfo user);
	
	public int deleteUser(UserInfo user);

}
