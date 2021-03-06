package jp_co.good_works.lesson.springmvc.logic;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginInfo {

	@NotEmpty
	private String userID;
	
	@NotEmpty
	private String password;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
