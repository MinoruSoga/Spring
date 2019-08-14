package jp_co.good_works.lesson.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp_co.good_works.lesson.springmvc.form.UserInfoForm;

@Controller
@Scope("session")
public class UserInfoController {
	List<UserInfoForm> userInfoFormList = new ArrayList<UserInfoForm>();
	@RequestMapping(value = "/userinfo", method = RequestMethod.GET)
	public String userinfo(Model model) {

		UserInfoForm form = new UserInfoForm();
		List<String> genders = new ArrayList<String>();
		List<String> birthplace = new ArrayList<String>();
		List<String> favoriteLangs = new ArrayList<String>();
//		属性名を明示的に指定
		model.addAttribute("userInfoFormList", userInfoFormList);

		genders.add("男");
		genders.add("女");
		model.addAttribute("genders", genders);

		favoriteLangs.add("Java");
		favoriteLangs.add("C#");
		favoriteLangs.add("C/C++");
		favoriteLangs.add("PHP");
		favoriteLangs.add("Perl");
		favoriteLangs.add("Ruby");
		favoriteLangs.add("Python");
		model.addAttribute("favoriteLang", favoriteLangs);

		birthplace.add("");
		birthplace.add("北海道");
		birthplace.add("東北");
		birthplace.add("関東");
		birthplace.add("中部");
		birthplace.add("近畿");
		birthplace.add("中国");
		birthplace.add("四国");
		birthplace.add("九州");
		model.addAttribute("birthplace", birthplace);

		model.addAttribute("message", "入力してください");
//		UserInfoFormのクラスのインスタンスであるformをuserInfoFormに格納
		model.addAttribute("userInfoForm", form);
		return "userinfo";
	}

	@RequestMapping(value = "/userinfo", method = RequestMethod.POST)
	public String userInfo(Model model, @ModelAttribute UserInfoForm form, BindingResult result) {
		List<String> genders = new ArrayList<String>();
		List<String> birthplace = new ArrayList<String>();
		List<String> favoriteLangs = new ArrayList<String>();
		genders.add("男");
		genders.add("女");
		model.addAttribute("genders", genders);

		favoriteLangs.add("Java");
		favoriteLangs.add("C#");
		favoriteLangs.add("C/C++");
		favoriteLangs.add("PHP");
		favoriteLangs.add("Perl");
		favoriteLangs.add("Ruby");
		favoriteLangs.add("Python");
		model.addAttribute("favoriteLang", favoriteLangs);

		birthplace.add("");
		birthplace.add("北海道");
		birthplace.add("東北");
		birthplace.add("関東");
		birthplace.add("中部");
		birthplace.add("近畿");
		birthplace.add("中国");
		birthplace.add("四国");
		birthplace.add("九州");
		model.addAttribute("birthplace", birthplace);
		if (result.hasErrors()) {
			System.out.println("----------------");
			System.out.println(result.getObjectName());
			System.out.println("----------------");

		}else {
			model.addAttribute("message", "入力されました");
			userInfoFormList.add(form);
		}
//		formをuserinfo〜に格納
		model.addAttribute("userInfoFormList", userInfoFormList);
		model.addAttribute("userInfoForm", form);
		return "userinfo";

	}
}
