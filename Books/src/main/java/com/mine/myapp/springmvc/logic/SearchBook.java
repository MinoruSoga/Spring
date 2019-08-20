package com.mine.myapp.springmvc.logic;

import org.hibernate.validator.constraints.NotEmpty;

public class SearchBook {

	@NotEmpty
	private String b_name;

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	
}
