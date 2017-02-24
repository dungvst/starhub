package com.starhub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author DungNV
 *
 */

@Controller
@RequestMapping("/")
public class AppController {
    // @Autowired
    // private BannerService bannerService;

    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        // Banner ban = bannerService.findById(1);
        // if (ban != null) {
        // System.out.println(ban.getTitle());
        // }
        return "home";
    }

    @RequestMapping(value = { "/admin" }, method = RequestMethod.GET)
    public String adminPage(ModelMap model) {
        return "admin";
    }
}