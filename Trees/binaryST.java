package com.rohit.Trees;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class binaryST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left , val);
        }else {
            root.right = insert(root.right , val);
        }
        return root;
    }

    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }

        if(root.data > key){
            return search(root.left,key);
        } else if (root.data < key) {
            return search(root.right , key);
        }
        else {
            return true;
        }

    }


    public static Node delete(Node root , int val){
        if(root == null){
            return null;
        }
        if(root.data > val){
            root.left = delete(root.left , val);
        } else if (root.data < val) {
            root.right = delete(root.right,val);
        }else {
            //case 1
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2
            if(root.left == null){
                return root.right;
            }else if (root.right == null){
                return root.left;
            }

            //case 3
            Node IS = inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right , IS.data);
        }
        return root;
    }

    public static Node inOrderSuccessor(Node root){
        while (root.left != null){
            root = root.left;
        }

        return root;
    }

    //print path between given range from a binary search tree
    public static void printInRange(Node root , int X , int Y){
        if(root == null){
            return;
        }
        if(root.data >= X && root.data <= Y){
            printInRange(root.left,X,Y);
            System.out.print(root.data + " ");
            printInRange(root.right,X,Y);
        } else if (root.data >= Y) {
            printInRange(root.left,X,Y);
        }else {
            printInRange(root.right,X,Y);
        }
    }

    //print path from root to leaf
    public static void pathRootToLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);

        //This condition is for a leaf path
        if (root.left == null && root.right == null){
            printPath(path);
        }else { // This condition is for a non leaf Nodes
            pathRootToLeaf(root.left , path);
            pathRootToLeaf(root.right , path);
        }

        path.remove(path.size()-1);
    }

    public static void printPath(ArrayList<Integer> path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println();
    }

    public static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int[] value = {5,1,3,4,2,7};
        Node root = null;
        for (int i = 0; i < value.length ; i++){
            root = insert(root,value[i]);
        }
        inorder(root);
        System.out.println();
        root = delete(root,6);
        inorder(root);


    }
}
