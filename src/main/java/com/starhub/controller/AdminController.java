package com.starhub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.starhub.model.Banner;

/**
 * 
 * @author DungNV
 *
 */

@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        return "admin";
    }

    @RequestMapping(value = { "/header" }, method = RequestMethod.GET)
    public String adminPageHeader(ModelMap model) {
        return "adminHeader";
    }

    @RequestMapping(value = { "/tiles" }, method = RequestMethod.GET)
    public String adminPageTiles(ModelMap model) {
        return "adminTiles";
    }

    @RequestMapping(value = "/banner", method = RequestMethod.GET)
    public ModelAndView showUpdateBanner() {
        ModelAndView model = new ModelAndView();
        Banner banner = new Banner();
        // Banner banner = bannerService.getActiveItemById(id);
        if (banner == null) {
            model.addObject("css", "danger");
            model.addObject("msg", "Banner is not found");
        } else {
            // BannerExt bannerExt =
            // BannerExt.create(bannerService.getActiveItemById(id));
            model.addObject("banner", banner);
            model.addObject("isNew", false);
        }
        model.setViewName("admin");
        return model;

    }
}