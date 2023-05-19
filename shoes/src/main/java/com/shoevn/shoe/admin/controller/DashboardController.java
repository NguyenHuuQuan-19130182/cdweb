package com.shoevn.shoe.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DashboardController {
    @RequestMapping("dashboard")
    //@ResponseBody
    public String index(){
        return "/admindashboard";
    }
}
