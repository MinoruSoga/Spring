package com.mine.myapp.springmvc.controller.no_cert;

import java.sql.SQLException;

import javax.security.auth.login.LoginException;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mine.myapp.springmvc.form.LoginForm;
import com.mine.myapp.springmvc.logic.LoginLogic;

@Controller
@Scope("session")
public class LoginController {
	private LoginLogic loginLogic = new LoginLogic();
	
	public boolean isLive() {
		return loginLogic.isLive();
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String initialzeLogin(Model model) {
		LoginForm form = new LoginForm();
		model.addAttribute("message", "入力してください");
		model.addAttribute("loginForm", form);
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String executeLogin(Model model, @Validated @ModelAttribute LoginForm form, BindingResult result, RedirectAttributes redirectAttrr)throws SQLException {
		if(!result.hasErrors()){
			try {
				loginLogic.login(form.getEmail(), form.getPassword());
				return "redirect:/";
			}catch(LoginException ex) {
				model.addAttribute("message", ex.getLocalizedMessage());
			}
		}else {
			model.addAttribute("message", "ユーザネーム、パスワードを入力してください");
			
		}
		return "login";
	}
}
