/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaprogram;

import java.util.Stack;
import com.mycompant.treeImpliment.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author mohitm@bdcvit.com
 */
public class StackTest {

    String expression = "( Camera & Photo Equipment and Equestrian and Camera & Photo Equipment and Camera & Photo Equipment and ( English as a 2nd Language and 13-17 ) )";
    Stack<TreeNode> stack = new Stack<TreeNode>();
    Queue<Integer> queue = new LinkedList<Integer>();
    LinkedList<TreeNode> linkList = new LinkedList<>();
    String[] tokens = expression.split(" ");
    TreeNode t = new TreeNode(null, "(");
//        stack.push(t);
//        stack.pop();
}
