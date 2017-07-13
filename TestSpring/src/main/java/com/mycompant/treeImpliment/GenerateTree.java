/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompant.treeImpliment;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//import net.openhft.hashing.LongHashFunction;
//

/**
 *
 * @author mohitm@bdcvit.com
 */

public class GenerateTree {

    public static TreeNode buildSubTree(List<TreeNode> nodes, int left, int right) {
        if (right < left) {
            return null;
        } else if (right == left) {
            return nodes.get(right);
        }
        int mid = (right - left) / 2 + left;
        if (mid % 2 == 0) {
            mid = mid + 1;
        }
        TreeNode cur = nodes.get(mid);
        cur.setLeft(buildSubTree(nodes, left, mid - 1));
        cur.setRight(buildSubTree(nodes, mid + 1, right));
        return cur;
    }

    public static String formatExpression(String expression) {
        expression = expression.replaceAll("\\s+:", ":");
        expression = expression.replaceAll(":\\s+", ":");
        expression = expression.replaceAll("\\(", " ( ");
        expression = expression.replaceAll("\\)", " ) ");
        expression = "( " + expression + " )";
        expression = expression.replaceAll("\\s+", " ");
        return expression;
    }

    public static TreeNode generateTree(String expression) {
        expression = formatExpression(expression);
        String[] tokens = expression.split(" ");
        Stack<TreeNode> stack = new Stack<TreeNode>();
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            String lowerToken = token.toLowerCase().trim();
            if (lowerToken == null || lowerToken.length() == 0) {
                continue;
            }
            TreeNode t = null;
            switch (lowerToken) {
                case "(":
                    t = new TreeNode(null, "(");
                    stack.push(t);
                    break;
                case "and":
                    t = new TreeNode(NodeType.AND, "AND");
                    stack.push(t);
                    break;
                case "or":
                    t = new TreeNode(NodeType.OR, "OR");
                    stack.push(t);
                    break;
                case "not":
                    t = new TreeNode(NodeType.NOT, "NOT");
                    stack.push(t);
                    break;
                case ")":
                    List<TreeNode> list = new ArrayList<>();
                    while (!stack.isEmpty() && stack.peek().getType() != null) {
                        TreeNode cur = stack.pop();
                        if (cur.getMainType().equals(MainType.OPERATOR) && cur.getValue().equals("NOT")) {
                            if (cur.getLeft() == null) {
                                cur.setLeft(list.get(list.size() - 1));
                                list.remove(list.size() - 1);
                            }
                        } else if (cur.getMainType().equals(MainType.OPERAND) && cur.getValue() == null) {
                            TreeNode updateNode = list.get(list.size() - 1);
                            updateSubTree(updateNode, cur.getType());
                            cur = updateNode;
                            list.remove(list.size() - 1);
                        }
                        list.add(cur);
                    }

                    for (int k = 1; k < list.size(); k++) {
                        TreeNode old = list.get(k - 1);
                        TreeNode cur = list.get(k);
                        if (old.getMainType().equals(MainType.OPERAND) && cur.getMainType().equals(MainType.OPERAND)) {
                            cur.setValue(cur.getValue() + " " + old.getValue());
                            list.remove(old);
                            k--;
                        }
                    }
                    stack.pop();
                    t = buildSubTree(list, 0, list.size() - 1);
                    stack.push(t);
                    break;
                default:
                    t = operandNode(token);
                    stack.push(t);
                    break;
            }
        }
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return null;
    }

    public static TreeNode operandNode(String value) {
        TreeNode node = null;
        if (value.contains(":")) {
            String[] ops = value.split(":");
            String type = ops[0].trim().toLowerCase();
            String val = null;
            if (ops.length > 1) {
                val = ops[1].trim();
            }
            switch (type) {
                case "pr.co":
                    node = new TreeNode(NodeType.COUNTRY, val);
                    break;
                case "pr.st":
                    node = new TreeNode(NodeType.STATE, val);
                    break;
                case "pr.ct":
                    node = new TreeNode(NodeType.CITY, val);
                    break;
                case "applist.id":
                    if (val != null) {
//					Long hash = LongHashFunction.xx_r39().hashChars(val);
//					node = new TreeNode(NodeType.APP_ID, hash.toString());
                    } else {
                        node = new TreeNode(NodeType.APP_ID, null);
                    }
                    break;
                case "bids":
                    if (val != null) {
                        val = val.replace("\\-", "-");
                        node = new TreeNode(NodeType.APP_ID, val);
                    } else {
                        node = new TreeNode(NodeType.APP_ID, null);
                    }
                    break;
                case "tpinfs":
                    node = new TreeNode(NodeType.TP_INFERENCE, val);
                    break;
                case "dvcs.didt":
                    // node = new TreeNode(NodeType.DID_TYPE, DeviceIdentifierType.getCode(val));
                    node = new TreeNode(NodeType.DID_TYPE, val);
                    break;
                case "dvcs.dm":
                    if (val != null) {
                        val = val.replace("*", ".*");
                    }
                    node = new TreeNode(NodeType.DEVICE_MODEL, val);
                    break;
                case "lang":
                    node = new TreeNode(NodeType.LANGUAGE, val);
                    break;
                default:
                    node = new TreeNode(NodeType.INFERENCE, val);
                    break;
            }

        } else {
            node = new TreeNode(NodeType.INFERENCE, value.trim());
        }

        return node;
    }

    public static void updateSubTree(TreeNode node, NodeType type) {
        if (node == null) {
            return;
        } else if (node.getType().getMainType().equals(MainType.OPERAND)) {
            node.setType(type);
            if (type.equals(NodeType.APP_ID)) {
//				Long hash = LongHashFunction.xx_r39().hashChars(node.getValue());
//				node.setValue(hash.toString());
            } else if (type.equals(NodeType.DEVICE_MODEL)) {
                String val = node.getValue().replace("*", ".*");
                node = new TreeNode(NodeType.DEVICE_MODEL, val);
            } else if (type.equals(NodeType.DID_TYPE)) {
//				node = new TreeNode(NodeType.DID_TYPE, DeviceIdentifierType.getCode(node.getValue()));
            }

        } else {
            updateSubTree(node.getLeft(), type);
            updateSubTree(node.getRight(), type);
        }
    }

}
