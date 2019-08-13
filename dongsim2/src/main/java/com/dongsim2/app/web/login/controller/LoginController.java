package com.dongsim2.app.web.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	
	// 로그인 화면
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
    	
    	logger.info("#### 로그인 화면입니다. ####");
    	
        return "login/login";
    }
    
    
    
    // 로그인 처리
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginProcess(
    			@RequestParam String user_id,
    			@RequestParam String user_password,
    			HttpServletRequest request
    		) {
    	
    	logger.info("#### 로그인 처리 입니다. ####");
    	
    	logger.info(" - user_id : " + user_id);
    	logger.info(" - user_password : " + user_password);
    	
    	
    	HttpSession session = request.getSession();
    	
    	session.setAttribute("user_id", user_id);
    	session.setAttribute("user_name", "홍길동");
   
    	logger.info(" ** session.getId() : " + session.getId());
    	
        return "login/login";
    }
    
    
    // 비밀번호 변경 화면
    @RequestMapping(value = "/sc/change-password", method = RequestMethod.GET)
    public String changePassword(
    			HttpSession session
    		) {
    	
    	logger.info("#### 비밀번호 변경 화면입니다. ####");
    	
    	logger.info(" ** session.getId() : " + session.getId());
    	
    	if(session.getAttribute("user_id") == null) {
    		logger.info("세션이 존재하지 않습니다. 로그인 화면으로 이동합니다.");
    		return "redirect:/login";
    	}
    	
        return "login/change_password";
    }
 
}

