package jp_co.good_works.lesson.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//このファイルはコントローラーです。という宣言　MVCモデルで今回作成しているので記載は必須。
/**
 * Handles requests for the application home page.
 */
@Controller
public class HelloController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	//helloとアクセスされたら　下記helloメソッドが実行される
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	//modelという箱にmessageという名の名前でHelloSpringという文字列を格納している
	public String hello(Model model) {
		
		model.addAttribute("message", "<script>alert()</script>");
		//hello.jspへ遷移する。
		return "home";
	}
	
}
