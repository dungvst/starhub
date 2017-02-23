package com.starhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.starhub.model.Banner;
import com.starhub.service.BannerService;

/**
 * 
 * @author DungNV
 *
 */

@Controller
@RequestMapping("/")
public class AppController {
    @Autowired
    private BannerService bannerService;

    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        Banner ban = bannerService.findById(1);
        if (ban != null) {
            System.out.println(ban.getTitle());
        }
        return "home";
    }
}