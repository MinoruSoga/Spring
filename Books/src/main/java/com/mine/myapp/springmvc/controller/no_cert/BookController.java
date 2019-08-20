package com.mine.myapp.springmvc.controller.no_cert;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

	@RequestMapping(value="/contact_search")
	public String contactSearch(Model m, HttpSession session) {
//		Integer userId = (Integer) session.getAttribute("userId);
		m.addAttribute("contactList", contactService.findUserContact(userId));
		return "clist";
	}
}
