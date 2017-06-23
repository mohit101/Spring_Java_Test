/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testspring;

import com.mycompany.interfaces.mysevices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author mohitm@bdcvit.com
 */
@Controller
public class TestSpring implements mysevices {

    @RequestMapping(value = "/myservlet", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> postData(@RequestParam(value = "name") String name, @RequestParam(value = "id") String id, @RequestParam(value = "mobile") String mobile, @RequestParam(value = "address") String address) {
        System.out.println("Success");
        Student student = new Student();
        student.setName(name);
        student.setId(id);
        student.setMobile(mobile);
        student.setAddress(address);

        System.out.println("" + student.getName());
        System.out.println("" + student.getId());
        System.out.println("" + student.getAddress());
        System.out.println("" + student.getMobile());
        return new ResponseEntity<String>(student.getName(), HttpStatus.OK);
    }

    @RequestMapping(value = "/add-data", method = RequestMethod.GET)
    public ResponseEntity<Student> getData(@RequestParam String id) {
        Student foo = new Student();

        return new ResponseEntity<Student>(foo, HttpStatus.OK);
    }
    
    
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<Student> checkGetData() {
        Student foo = new Student();

        return new ResponseEntity<Student>(foo, HttpStatus.OK);
    }

}
