package com.starhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.starhub.service.BannerService;
import com.starhub.service.HeaderService;
import com.starhub.service.TilesLeftService;
import com.starhub.service.TilesRightService;

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

    @Autowired
    private HeaderService headerService;

    @Autowired
    private TilesLeftService tilesLeftService;

    @Autowired
    private TilesRightService tilesRightService;

    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String homePage(ModelMap model) {

        // Banner
        model.addAttribute("banner", bannerService.getDefaultBanner());

        // Header
        model.addAttribute("headerSection", headerService.getDefaultHeaderSection());

        // Tiles Left
        model.addAttribute("tilesLeft", tilesLeftService.getDefaultTilesLeft());

        // Tiles Right
        model.addAttribute("tilesRight", tilesRightService.getDefaultTilesRight());

        return "home";
    }
}