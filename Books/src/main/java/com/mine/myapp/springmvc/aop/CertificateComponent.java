package com.mine.myapp.springmvc.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.WebContentGenerator;

import com.mine.myapp.springmvc.controller.no_cert.LoginController;

@Aspect
@Component
public class CertificateComponent extends WebContentGenerator{
	@Around("execution(* com.mine.myapp.springmvc.controller.HomeController.*(..))")
	public String checkAuthenticated(ProceedingJoinPoint joinPoint)throws Throwable{
        LoginController loginController = getApplicationContext().getBean(LoginController.class);
        if(loginController.isLive()){        	
            return (String) joinPoint.proceed();
        }
        return "redirect:/login";
    }
}
