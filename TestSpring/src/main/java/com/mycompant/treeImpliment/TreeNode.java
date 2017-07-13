/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompant.treeImpliment;

import java.io.Serializable;

/**
 *
 * @author mohitm@bdcvit.com
 */
public class TreeNode implements Serializable {

	private static final long serialVersionUID = 3045067792858591596L;

	private NodeType type;
	private String value;
	private TreeNode left;
	private TreeNode right;

	public TreeNode(NodeType type, String value) {
		this.type = type;
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public NodeType getType() {
		return type;
	}

	public MainType getMainType() {
		return type.getMainType();
	}

	public void setType(NodeType type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

}

