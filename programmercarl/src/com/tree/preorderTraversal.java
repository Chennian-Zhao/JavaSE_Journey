package com.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class preorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        List<Integer> result = preOrder(root);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
    //递归法
    public static List<Integer> preOrder(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        pre(root,ans);
        return ans;
    }
    public static void pre(TreeNode root,List<Integer> ans){
        if(root== null) return;
        //前序 中 左 有
        ans.add(root.val);
        pre(root.left,ans);
        pre(root.right,ans);
        //中序 左 中 右
        pre(root.left,ans);
        ans.add(root.val);
        pre(root.right,ans);
        //后续 左 右 中
        pre(root.left,ans);
        pre(root.right,ans);
        ans.add(root.val);
    }

    //迭代法，引入了null 用栈的思想来完成
    public static List<Integer> preorderTraversal(TreeNode node){
        //一个List 存结果，一个Stack作为容器

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        //先判断是否为空，不为空，压入一个父节点
        if(node!=null) stack.push(node);
        //栈不为空，进入判断
        while(!stack.isEmpty()){
            //核心就是如果是中，后面加一个null节点来处理
            TreeNode cur = stack.peek();
            if(cur!=null){
                //不为空，首先弹出
                //前序，中 左 右
                //因为是栈，所以反过来
                stack.pop();
                if(cur.right!=null)  stack.push(cur.right);
                if(cur.left!= null) stack.push(cur.left);
                stack.push(cur);
                stack.push(null);
            }
            else{
                //先弹出null，然后找到null前面的节点的值
                stack.pop();
                result.add(stack.pop().val);
            }

        }
        return result;
    }

    //迭代法
//    public static List<Integer> preorderTraversal(TreeNode node){
//        List<Integer> result = new ArrayList<>();
//        Stack<TreeNode> stack = new Stack<>();
//        if(node!= null){
//            stack.push(node);
//        }
//        while(!stack.isEmpty()){
//            TreeNode fir = stack.peek();
//            if(fir!=null){
//                stack.pop();
//                //前序 中，左，右
//                if(fir.right!=null) stack.push(fir.right);
//                if(fir.left!=null) stack.push(fir.left);
//                stack.push(fir);
//                stack.push(null);
////                //后序 左右中
////                //stack.pop();
////                //stack.push(fir);
////                stack.push(null);
////                if(fir.right!=null) stack.push(fir.right);
////                if(fir.left!=null) stack.push(fir.left);
//                //中序 左 中 右边
//                //先弹出，避免干扰
////                stack.pop();
////                if(fir.right!=null) stack.push(fir.right);
////                stack.push(fir);
////                stack.push(null);
////                if(fir.left!=null) stack.push(fir.left);
//            }
//            else {
//                stack.pop();
//                result.add(stack.pop().val);
//            }
//        }
//        return result;
//
//    }

}
