package com.dongsim2.app.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TilesController {
	
    @RequestMapping(value = "/depth1", method = RequestMethod.GET)
    public String depth1(Model model) {
    	
    	model.addAttribute("server_info", "local");
    	
        return "tiles/index";
    }
    
    @RequestMapping(value = "/depth2", method = RequestMethod.GET)
    public String depth2(Model model) {
    	
    	model.addAttribute("server_info", "local");
    	model.addAttribute("menu_name", "조회");
    	
        return "tiles/sub/menu1";
    }
    
    @RequestMapping(value = "/depth3", method = RequestMethod.GET)
    public String depth3(Model model) {
    	
    	model.addAttribute("server_info", "local");
    	model.addAttribute("menu_name", "삭");
    	
        return "tiles/sub/menu/depth3";
    }
 
}

