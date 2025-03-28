package com.rohit.Trees;

public class binarySearchTree {

    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    private Node root;

    public binarySearchTree() {
    }

    public int height() {
        return height(root);
    }

    private int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }
    public void insert(int value){
        root = insert(value,root);
    }

    private Node insert(int value , Node node){
        if (node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value,node.left);
        }
        if(value > node.value){
            node.right = insert(value,node.right);
        }
        node.height = Math.max(height(node.left),height(node.right));
        return node;
    }

    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void populatedSorted(int[] nums){
        populatedSorted(nums,0,nums.length);
    }
    private void populatedSorted(int[] nums , int start , int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start)/2;
        this.insert(nums[mid]);
        populatedSorted(nums,start,mid);
        populatedSorted(nums,mid+1,end);
    }

    public boolean balanced(){
        return balanced(root);
    }

    public boolean balanced(Node node){
        if (node == null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
    public void display(){
        display(this.root,"Root Node : ");
    }
    private void display(Node node , String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left,"Left child of "+node.value+":");
        display(node.right,"Right  child of "+node.value+":");

    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if(node == null){
            return;
        }
        //  this is one type of  traversal method. in this method first node is printed then left side and then right side is printed
        System.out.println(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if(node == null){
            return;
        }
        //in this case first left side is printed then node is printed then right side is printed
        inOrder(node.left);
        System.out.println(node.value+" ");
        inOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node){
        if(node == null){
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.value+" ");

    }

    public static void main(String[] args) {
        binarySearchTree tree = new binarySearchTree();
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        tree.populatedSorted(nums);
        tree.display();

    }
}
