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

    @Around("execution(* jp_co.good_works.lesson.springmvc.controller.HelloController.*(..))")
    public String checkAuthenticated(ProceedingJoinPoint joinPoint)throws Throwable{
        LoginController loginController = getApplicationContext().getBean(LoginController.class);
        if(loginController.isLive()){
            return (String) joinPoint.proceed();
        }
        return "redirect:/login";
    }
}
