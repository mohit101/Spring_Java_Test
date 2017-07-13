/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaprogram;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 *
 * @author mohitm@bdcvit.com
 */
public class Test {

    public static void main(String args[]) {
        int lines = 0;
        try {
            lines = LineCounter.countLines("");
            System.out.println("" + lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class LineCounter {

    public static int countLines(String filename) throws IOException {
        LineNumberReader reader = new LineNumberReader(new FileReader(filename));
        int cnt = 0;
        String lineRead = "";
        while ((lineRead = reader.readLine()) != null) {
        }
        cnt = reader.getLineNumber();
        reader.close();
        return cnt;
    }
}
