package com.gulbitnuri.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class MainController {
    @GetMapping("/")
    public String getMainPage(Model model){
        model.addAttribute("title","");
        return "pages/test/mainPage";
    }

    @GetMapping("/logout")
    public String logout(Model model){
        model.addAttribute("title","");
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String getLoginPage(Model model){
        model.addAttribute("title","");
        return "pages/test/loginPage";
    }

    @GetMapping("/finduser")
    public String getFindUserPage(Model model){
        model.addAttribute("title","");
        return "pages/test/findUserPage";
    }

    @GetMapping("/letterlist")
    public String getLetterListPage(Model model){
        model.addAttribute("title","");
        return "pages/test/letterListPage";
    }

    @GetMapping("/letterwrite")
    public String getLetterWritePage(Model model){
        model.addAttribute("title","");
        return "pages/test/letterWritePage";
    }

    @GetMapping("/mypage")
    public String getMyPage(Model model){
        model.addAttribute("title","");
        return "pages/test/myPage";
    }

    @GetMapping("/detail")
    public String getLetterDetailPage(Model model){
        model.addAttribute("title","");
        return "pages/test/letterDetailPage";
    }
}