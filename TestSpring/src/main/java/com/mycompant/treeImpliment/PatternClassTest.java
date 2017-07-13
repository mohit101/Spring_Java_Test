/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompant.treeImpliment;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mohitm@bdcvit.com
 */
//https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
public class PatternClassTest {

    public static void main(String[] args) {
        		ArrayList<String> infIds = new ArrayList<String>();

        Pattern p = Pattern.compile("[ ]*+[\\\"][0-9A-Za-z\\s+]+[\\\"][ ]*+|[ ]*+(\\w+)[ ]*+",
                Pattern.MULTILINE);
        Matcher m = p.matcher("( Camera & Photo Equipment and Equestrian and Camera & Photo Equipment and Camera & Photo Equipment and Western and ( English as a 2nd Language and 13-17 ) )");
//        Pattern p = Pattern.compile("ab*");
//        Matcher m = p.matcher("aaaaab");
        boolean b = m.matches();
        while (m.find()) {
         String infName = m.group().trim();
			if (!(infName.equalsIgnoreCase("AND") || infName.equalsIgnoreCase("OR") || infName
					.equalsIgnoreCase("NOT"))) {
				String inferenceId = m.group();
				if (inferenceId.contains("\"")) {

					inferenceId = inferenceId.replaceAll("\"", "");
				}

				infIds.add(inferenceId.trim());
			}
        }
    }
}
