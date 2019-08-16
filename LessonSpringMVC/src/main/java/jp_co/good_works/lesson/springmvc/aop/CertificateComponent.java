package jp_co.good_works.lesson.springmvc.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.WebContentGenerator;

import jp_co.good_works.lesson.springmvc.controller.no_cert.LoginController;

@Aspect 
@Component
public class CertificateComponent extends WebContentGenerator{
//	指定したディレクトリ配下のコントローラーにAOPを適用させる
    @Around("execution(* jp_co.good_works.lesson.springmvc.controller.HelloController.*(..))")
    //　↑　メソッド実行前に呼ばれ、この中でメソッドを実行する/メソッド実行の代わりに呼び出す
    
    public String checkAuthenticated(ProceedingJoinPoint joinPoint)throws Throwable{
    	//ログインコントローラーをAOPとして指定している（クラスファイルを指定しなければならない）
    	//インスタンス化と同等な扱いができます
        LoginController loginController = getApplicationContext().getBean(LoginController.class);
        if(loginController.isLive()){
//        	指定したcontrollerに遷移する
            return (String) joinPoint.proceed();
            // JoinPoint アドバイス（Advice:抽出した共通処理）を入れる場所
        }
        return "redirect:/login";
    }
}
