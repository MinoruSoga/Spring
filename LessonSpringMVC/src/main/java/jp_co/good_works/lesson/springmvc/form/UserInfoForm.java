package jp_co.good_works.lesson.springmvc.form;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class UserInfoForm {
	@NotEmpty
	private String name;
	@Min(value = 20)
	private Integer age;
	private String gender;
	@Email
	private String email;
	private String birthplace;
	@NotNull
	private List<String> favoriteLangs;
	private String remarks;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthplace() {
		return birthplace;
	}
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	public List<String> getFavoriteLangs() {
		return favoriteLangs;
	}
	public void setFavoriteLangs(List<String> favoriteLangs) {
		this.favoriteLangs = favoriteLangs;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
