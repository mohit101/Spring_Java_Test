/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testspring;

import java.util.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mohitm@bdcvit.com
 */
public class HelloWorld {

    private String message;
    private Date date;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("singletonscope");
        System.out.println("*********SINGLETON SCOPE************");
        objA.setMessage("Message by object A");
        objA.setDate(new Date());
        System.out.println("Your Message : " + objA.getMessage());
        System.out.println("Date : " + objA.getDate().toString());
        HelloWorld objB = (HelloWorld) context.getBean("singletonscope");
        System.out.println("*********SINGLETON SCOPE************");
        System.out.println("Your Message : " + objB.getMessage());
        System.out.println("Date : " + objB.getDate().toString());

        HelloWorld objC = (HelloWorld) context.getBean("prototypescope");
        System.out.println("*********SINGLETON SCOPE************");
        objC.setMessage("Message by object A");
        objC.setDate(new Date());
        System.out.println("Your Message : " + objC.getMessage());
        System.out.println("Date : " + objC.getDate().toString());

        HelloWorld objD = (HelloWorld) context.getBean("prototypescope");
        System.out.println("*********SINGLETON SCOPE************");
        System.out.println("Your Message : " + objD.getMessage());
        System.out.println("Date : " + objD.getDate().toString());

    }
}
