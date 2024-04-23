package com.tree;


import java.util.*;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


class Solution {
    public static void main(String[] args) {
        // 创建一个N叉树
        Node root = new Node(1);
        Node node1 = new Node(3);
        Node node2 = new Node(2);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);
        root.children = Arrays.asList(node1, node2, node3);
        node1.children = Arrays.asList(node4, node5);

        // 创建一个Solution对象
        Solution solution = new Solution();

        // 调用levelOrder方法并打印结果
        List<List<Integer>> result = solution.levelOrder(root);
        System.out.println(result);
    }
    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            List<Integer> rowans = new ArrayList<>();
            int len = que.size();
            //null 分割，遇到null 把前面的收到一起
            for (int i = 0; i < len; i++) {
                Node cur = que.poll();
                rowans.add(cur.val);
                if(cur.children==null||cur.children.size() ==0){
                    continue;
                }
                for(Node child: cur.children){
                    if (child != null) {
                        que.offer(child);
                    }
                }
            }
            ans.add(rowans);
        }
        return ans;


    }
}