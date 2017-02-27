package com.starhub.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.starhub.common.CommonConstant;
import com.starhub.model.Banner;
import com.starhub.model.HeaderSection;
import com.starhub.model.TilesLeft;
import com.starhub.model.TilesRight;
import com.starhub.service.BannerService;
import com.starhub.service.HeaderService;
import com.starhub.service.ImageService;
import com.starhub.service.TilesLeftService;
import com.starhub.service.TilesRightService;

/**
 * 
 * @author DungNV
 *
 */

@Controller
public class AdminController {
    @Autowired
    private BannerService bannerService;

    @Autowired
    private HeaderService headerService;

    @Autowired
    private TilesLeftService tilesLeftService;

    @Autowired
    private TilesRightService tilesRightService;

    @Autowired
    private ImageService imageService;

    @Autowired
    MessageSource messageSource;

    @RequestMapping(value = { "/admin", "/admin/banner" }, method = RequestMethod.GET)
    public ModelAndView showAdminPage() {
        ModelAndView model = new ModelAndView();
        Banner banner = bannerService.getDefaultBanner();
        if (banner == null) {
            model.addObject("css", "danger");
            model.addObject("msg", messageSource.getMessage("err.notfound", null, null));
        } else {
            model.addObject("bannerForm", banner);
        }
        model.setViewName("admin");
        return model;
    }

    @RequestMapping(value = { "/admin/header" }, method = RequestMethod.GET)
    public ModelAndView showAdminPageHeader() {
        ModelAndView model = new ModelAndView();
        HeaderSection headerSection = headerService.getDefaultHeaderSection();
        if (headerSection == null) {
            model.addObject("css", "danger");
            model.addObject("msg", messageSource.getMessage("err.notfound", null, null));
        } else {
            model.addObject("headerForm", headerSection);
        }
        model.setViewName("adminHeader");
        return model;
    }

    @RequestMapping(value = { "/admin/tiles-left" }, method = RequestMethod.GET)
    public ModelAndView showAdminPageTilesLeft() {
        ModelAndView model = new ModelAndView();
        TilesLeft tilesLeft = tilesLeftService.getDefaultTilesLeft();
        if (tilesLeft == null) {
            model.addObject("css", "danger");
            model.addObject("msg", messageSource.getMessage("err.notfound", null, null));
        } else {
            model.addObject("tilesLeftForm", tilesLeft);
        }
        model.setViewName("adminTilesLeft");
        return model;
    }

    @RequestMapping(value = { "/admin/tiles-right" }, method = RequestMethod.GET)
    public ModelAndView showAdminPageTilesRight() {
        ModelAndView model = new ModelAndView();
        TilesRight tilesRight = tilesRightService.getDefaultTilesRight();
        if (tilesRight == null) {
            model.addObject("css", "danger");
            model.addObject("msg", messageSource.getMessage("err.notfound", null, null));
        } else {
            model.addObject("tilesRightForm", tilesRight);
        }
        model.setViewName("adminTilesRight");
        return model;
    }

    @RequestMapping(value = "/admin/banner", method = RequestMethod.POST)
    public String updateBanner(@ModelAttribute("bannerForm") @Valid Banner banner, BindingResult result, Model model,
            final RedirectAttributes redirectAttributes, @RequestParam("file") MultipartFile file) {
        if (result.hasErrors()) {
            return "admin";
        } else {
            if (banner.getId() == null) {
                redirectAttributes.addFlashAttribute("css", "danger");
                redirectAttributes.addFlashAttribute("msg", messageSource.getMessage("err.notfound", null, null));
            } else {
                redirectAttributes.addFlashAttribute("css", "success");
                redirectAttributes.addFlashAttribute("msg", messageSource.getMessage("msg.update.success", null, null));
            }
            banner.setStatus(CommonConstant.ACTIVE);

            // Update image
            if (!file.isEmpty()) {
                String resultMsg = imageService.uploadImage(file);
                if (resultMsg != null) {
                    redirectAttributes.addFlashAttribute("css", "danger");
                    redirectAttributes.addFlashAttribute("msg", messageSource.getMessage(resultMsg, null, null));
                } else {
                    banner.setImagePath(CommonConstant.IMG_PATH + file.getOriginalFilename());
                }
            } else {
                banner.setImagePath(CommonConstant.DEFAULT_BANNER_IMG_PATH);
            }

            bannerService.updateBanner(banner);
            return "redirect:/admin/banner";
        }

    }

    @RequestMapping(value = "/admin/header", method = RequestMethod.POST)
    public String updateHeader(@ModelAttribute("headerForm") @Valid HeaderSection header, BindingResult result, Model model,
            final RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "adminHeader";
        } else {
            if (header.getId() == null) {
                redirectAttributes.addFlashAttribute("css", "danger");
                redirectAttributes.addFlashAttribute("msg", messageSource.getMessage("err.notfound", null, null));
            } else {
                redirectAttributes.addFlashAttribute("css", "success");
                redirectAttributes.addFlashAttribute("msg", messageSource.getMessage("msg.update.success", null, null));
            }
            header.setStatus(CommonConstant.ACTIVE);

            headerService.updateHeaderSection(header);
            return "redirect:/admin/header";
        }

    }

    @RequestMapping(value = "/admin/tiles-left", method = RequestMethod.POST)
    public String updateTilesLeft(@ModelAttribute("tilesLeftForm") @Valid TilesLeft tilesLeft, BindingResult result, Model model,
            final RedirectAttributes redirectAttributes, @RequestParam("file") MultipartFile file) {
        if (result.hasErrors()) {
            return "adminTilesLeft";
        } else {
            if (tilesLeft.getId() == null) {
                redirectAttributes.addFlashAttribute("css", "danger");
                redirectAttributes.addFlashAttribute("msg", messageSource.getMessage("err.notfound", null, null));
            } else {
                redirectAttributes.addFlashAttribute("css", "success");
                redirectAttributes.addFlashAttribute("msg", messageSource.getMessage("msg.update.success", null, null));
            }

            tilesLeft.setStatus(CommonConstant.ACTIVE);

            // Update image
            if (!file.isEmpty()) {
                String resultMsg = imageService.uploadImage(file);
                if (resultMsg != null) {
                    redirectAttributes.addFlashAttribute("css", "danger");
                    redirectAttributes.addFlashAttribute("msg", messageSource.getMessage(resultMsg, null, null));
                } else {
                    tilesLeft.setImagePath(CommonConstant.IMG_PATH + file.getOriginalFilename());
                }
            } else {
                tilesLeft.setImagePath(CommonConstant.DEFAULT_TILES_IMG_LEFT_PATH);
            }

            tilesLeftService.updateTilesLeft(tilesLeft);

            return "redirect:/admin/tiles-left";
        }

    }

    @RequestMapping(value = "/admin/tiles-right", method = RequestMethod.POST)
    public String updateTilesRight(@ModelAttribute("tilesRightForm") @Valid TilesRight tilesRight, BindingResult result, Model model,
            final RedirectAttributes redirectAttributes, @RequestParam("file") MultipartFile file) {
        if (result.hasErrors()) {
            return "adminTilesRight";
        } else {
            if (tilesRight.getId() == null) {
                redirectAttributes.addFlashAttribute("css", "danger");
                redirectAttributes.addFlashAttribute("msg", messageSource.getMessage("err.notfound", null, null));
            } else {
                redirectAttributes.addFlashAttribute("css", "success");
                redirectAttributes.addFlashAttribute("msg", messageSource.getMessage("msg.update.success", null, null));
            }
            tilesRight.setStatus(CommonConstant.ACTIVE);

            // Update image
            if (!file.isEmpty()) {
                String resultMsg = imageService.uploadImage(file);
                if (resultMsg != null) {
                    redirectAttributes.addFlashAttribute("css", "danger");
                    redirectAttributes.addFlashAttribute("msg", messageSource.getMessage(resultMsg, null, null));
                } else {
                    tilesRight.setImagePath(CommonConstant.IMG_PATH + file.getOriginalFilename());
                }
            } else {
                tilesRight.setImagePath(CommonConstant.DEFAULT_TILES_IMG_RIGHT_PATH);
            }

            tilesRightService.updateTilesRight(tilesRight);

            return "redirect:/admin/tiles-right";
        }

    }

}