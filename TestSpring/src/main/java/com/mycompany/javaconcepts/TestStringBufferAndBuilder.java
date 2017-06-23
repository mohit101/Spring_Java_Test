/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaconcepts;

/**
 *
 * @author mohitm@bdcvit.com
 */
//Object Created using string stored in StringPoool
//Object Created using Bffer and Builde stroed in Heap
//String Builder is Not Synchronise and Not threadSafe and less overhead=moreefficient
//String Buffer is  Synchronise
//StringBuilder is faster than StringBuffer because it's not synchronized.
//StringBuffer came first. Sun was concerne/StringBuilder is faster than Std with correctness under all conditions, so they made it synchronized to make it thread-safe just in case.
//StringBuilder came later. Most of the uses of StringBuffer were single-thread and unnecessarily paying the cost of the synchronization.
//Which one to use when? StringBuilder :
//When you need a string, which can be modifiable, 
//and only one thread is accessing and modifying it. 
//StringBuffer:  When you need a string, which can be modifiable, and multiple threads are accessing and modifying it.
public class TestStringBufferAndBuilder {

    public static void main(String[] args) {

        int N = 77777777;
        long t;

        {
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();
            int count = 0;
            for (int i = N; i-- > 0;) {
                sb.append("x");
                count++;
            }
            System.out.println("" + count);
            System.out.println("Buffer" + (System.currentTimeMillis() - t));
        }
        {
            StringBuilder sb = new StringBuilder();
            t = System.currentTimeMillis();
            int count = 0;
            for (int i = N; i-- > 0;) {
                count++;
                sb.append("y");
            }
            System.out.println("" + count);
            System.out.println("Builder" + (System.currentTimeMillis() - t));
        }

//String Builder
        StringBuilder sbu = new StringBuilder();
        sbu.append("mohit");
        sbu.append("mangal");
        System.out.println(sbu);//prints Hello Java  
        sbu.insert(10, "rohit");
        System.out.println(sbu);
        sbu.replace(1, 3, "Java");
        System.out.println(sbu);
        sbu.reverse();
        System.out.println(sbu);
        System.out.println(sbu.capacity());

        long t1 = System.currentTimeMillis();
        String str = "mangal";
        for (int i = 0; i < 100; i++) {
            str = str + "mohit";
        }

        long t2 = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 100; i++) {
            sb.append("mohit");
        }
        long t3 = System.currentTimeMillis();

        System.out.println(str.length());
        System.out.println(sb.length());

        // ... Times.
        System.out.println(t2 - t1);
        System.out.println(t3 - t2);
        //String and String Builder
    }
}
