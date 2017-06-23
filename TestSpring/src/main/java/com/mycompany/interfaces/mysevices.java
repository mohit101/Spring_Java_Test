/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.testspring.Student;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author mohitm@bdcvit.com
 */
public interface mysevices {
    
    public ResponseEntity<String> postData(String id,String name,String mobile,String address);
     public ResponseEntity<Student> getData(String id);
}
