/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompant.treeImpliment;

/**
 *
 * @author mohitm@bdcvit.com
 */
public enum MainType {
    
	OPERATOR(0), OPERAND(1);

	private int value;

	MainType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
