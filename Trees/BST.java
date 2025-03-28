package com.rohit.Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BST {

    static class Node{
        Node left;
        Node right;
        int val ;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }



    static Node Insert(Node root , int val){
        if(root == null){
            return new Node(val);
        }
        if(val < root.val){
           root.left = Insert(root.left,val);
        } else if (val > root.val) {
           root.right = Insert(root.right,val);
        }

        return root;
    }

    static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.val+" ");
        Inorder(root.right);
    }

    static ArrayList<Integer> bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        q.add(root);

        while (!q.isEmpty()){
            Node node = q.remove();
            list.add(node.val);

            if(node.left != null){
                q.add(node.left);
            }

            if(node.right != null){
                q.add(node.right);
            }

        }

        return list;
    }

    public static void main(String[] args) {
        Node root = null;
        int bst[] = {6,3,1,4,10,7,11};
        int n = bst.length;
        for (int i = 0 ; i < n ; i++){
            root = Insert(root,bst[i]);
        }
        Inorder(root);
        System.out.println();
        ArrayList<Integer> li = bfs(root);
        System.out.println(li);
    }

}
