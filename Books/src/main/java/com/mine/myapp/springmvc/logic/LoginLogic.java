package com.mine.myapp.springmvc.logic;

import java.sql.SQLException;

import javax.security.auth.login.LoginException;

import com.mine.myapp.springmvc.controller.dao.UserDao;
import com.mine.myapp.springmvc.form.LoginForm;

public class LoginLogic {

	UserDao ud = new UserDao();
	private LoginInfo loginInfo = null;
	LoginForm loginForm = new LoginForm();
	
	public void login(String email, String pass)throws LoginException, SQLException{
		loginInfo = ud.select(email, pass);
		if(loginInfo != null) {
			loginInfo = new LoginInfo();
			loginInfo.setEmail(email);
			loginInfo.setPassword(pass);
		}else {
			throw new LoginException("ユーザ名またはパスワードが違います");
		}
	}
	
	public boolean isLive() {
		if(loginInfo != null) {
			return true;
		}else {
			return false;
		}
	}
}
