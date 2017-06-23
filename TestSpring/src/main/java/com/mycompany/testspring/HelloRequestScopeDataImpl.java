/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testspring;

import com.mycompany.interfaces.HelloRequestScopeData;
import java.util.Date;

/**
 *
 * @author mohitm@bdcvit.com
 */
public class HelloRequestScopeDataImpl implements HelloRequestScopeData {

    private final Date date;

    public HelloRequestScopeDataImpl(Date date) {
        this.date = date;
    }

    @Override
    public String getDate() {
        return date.toString();
    }

}
