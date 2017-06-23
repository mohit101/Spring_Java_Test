/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testspring;

import com.mycompany.interfaces.HelloRequestScopeData;
import com.mycompany.interfaces.HelloSessionScopeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mohitm@bdcvit.com
 */
@Controller
public class HelloController {

    @Autowired
    private HelloRequestScopeData requestscopehellodata;

    @Autowired
    private HelloSessionScopeData sessionscopehellodata;

    @RequestMapping(value = "/")
    public String hellodata(Model model) {
        model.addAttribute("requestscopedate", requestscopehellodata.getDate());
        model.addAttribute("sessionscopedate", sessionscopehellodata.getDate());

        /* return to view "hello.jsp" */
        return "hello";
    }
}
