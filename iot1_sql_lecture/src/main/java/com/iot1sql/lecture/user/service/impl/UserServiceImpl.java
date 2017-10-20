package com.iot1sql.lecture.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot1sql.lecture.user.dao.UserDAO;
import com.iot1sql.lecture.user.dao.dto.UserInfo;
import com.iot1sql.lecture.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO ud;
	
	@Override
	public UserInfo login(UserInfo user) {
		UserInfo rUser = ud.selectUser(user);
		if(rUser!=null && rUser.getUserPwd().equals(user.getUserPwd())){
			return rUser;
		}
		return null;
	}

	@Override
	public UserInfo selectUser(UserInfo user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserInfo> selectUserList(UserInfo user) {
		return ud.selectUserList(user);
	}

	@Override
	public int insertUser(UserInfo user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatetUser(UserInfo user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(UserInfo user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertUserList(UserInfo[] userList) {
		int rCnt = 0;
		for(UserInfo user : userList){
			rCnt += ud.insertUser(user);
		}
		return rCnt;
	}

}
