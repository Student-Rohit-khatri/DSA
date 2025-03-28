package com.rohit.Binary_search_Tree_Dsa;

public class Tree_Dsa {
    Node root;
    class Node{
        int data;
        Node right;
        Node left;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public void insert(int data){
       root = insert(root,data);
    }
    private Node insert(Node root , int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data > root.data){
            root.right = insert(root.right,data);
        }else if(data < root.data){
            root.left = insert(root.left,data);
        }
        return root;
    }

    public void Delete(int data){
        root = Delete(root,data);
    }

    public Node Delete(Node root , int data){
        if(root.data > data){
            root.left = Delete(root.left,data);
        } else if (root.data < data) {
            root.right = Delete(root.right,data);
        }else if(root.data == data){
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }

            Node temp = root.right;
            while(temp.left != null){
                temp = temp.left;
            }
            root.data = temp.data;
            root.right = Delete(root.right,temp.data);

        }
        return root;
    }

    public void inorder(){
        inorder(root);
    }
    private void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Tree_Dsa bst = new Tree_Dsa();
        int[] arr = {20,14,35,8,18,28,40};
        for(int i = 0 ; i < arr.length ; i++){
            bst.insert(arr[i]);
        }
        bst.inorder();
        bst.Delete(8);
        System.out.println();
        bst.inorder();
    }

}
