/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaconcepts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 *
 * @author mohitm@bdcvit.com
 */
public class BufferedFileInputStreamReaderClasses {

    public static void main(String[] args) throws Exception {

      
          BufferedReader br2 = new BufferedReader(new FileReader(new File("/home/bdcvit.com/mohitm/unix")));
        String strLine1;
          while ((strLine1=br2.readLine()) != null) {
            System.out.println("BR2" + strLine1);
        }
         String strLine2;
        BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream(new File("/home/bdcvit.com/mohitm/unix"))));

        while ((strLine2=br1.readLine()) != null) {
            System.out.println("BR1" + strLine2);
        }
      
    }
}
