/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaconcepts;

import java.lang.reflect.*;

/**
 *
 * @author mohitm@bdcvit.com
 */
//Java Reflection is a process of examining or modifying the run time behavior of a class at run time.
//You want to access for method and custructor
public class TestReflection {

    public static void main(String[] args) throws Exception {
//        Class<?> forName = Class.forName("Class1");
//        Class1 newInstance = (Class1) c2.newInstance();
//        newInstance.set(1);
//        System.out.println("Output " + forName.getName());
//        System.out.println("Output " + newInstance.get());
        Class1 c3 = new Class1();
        Class ClassFromReflection = c3.getClass();
        Class c1 = boolean.class;
        Class c2 = Class1.class;
        System.out.println("Output " + c1.getName());
        System.out.println("Output " + c2.isInterface());
        System.out.println("Output " + ClassFromReflection.getClass());
        Method[] methods = ClassFromReflection.getMethods();
        for (Method method : methods) {
            System.out.println("Output " + method.getName());
        }
        Method declaredMethod = ClassFromReflection.getDeclaredMethod("message");
        declaredMethod.invoke(c3);
        System.out.println("" + declaredMethod.invoke(c3));
    }

}

class Class1 {

    int i;
    String str;

    public void set(int i) {
        this.i = i;
    }

    public int get() {
        return i;
    }

    public void message() {
        System.out.println("Fine");
    }

}

class Class2 {
}
