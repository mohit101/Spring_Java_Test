/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompant.treeImpliment;
import java.util.EnumSet;
import java.util.Set;

/**
 *
 * @author mohitm@bdcvit.com
 */
public enum NodeType {

	AND(MainType.OPERATOR, 0), OR(MainType.OPERATOR, 1), NOT(MainType.OPERATOR, 2),

	INFERENCE(MainType.OPERAND, 3), TP_INFERENCE(MainType.OPERAND, 4), DID_TYPE(MainType.OPERAND, 5),

	DEVICE_MODEL(MainType.OPERAND, 6), LANGUAGE(MainType.OPERAND, 7), APP_ID(MainType.OPERAND, 8),

	COUNTRY(MainType.OPERAND, 9), STATE(MainType.OPERAND, 10), CITY(MainType.OPERAND, 11);

	public static Set<NodeType> operands = EnumSet.of(AND, OR, NOT);
	public static Set<NodeType> operators = EnumSet.of(INFERENCE);
	private MainType mainType;
	private int nodeType;

	private NodeType(MainType type, int subType) {
		this.mainType = type;
		this.nodeType = subType;
	}

	public MainType getMainType() {
		return this.mainType;
	}

	public int getNodeType() {
		return this.nodeType;
	}

}

