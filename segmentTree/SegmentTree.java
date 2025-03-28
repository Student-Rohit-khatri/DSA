package com.rohit.segmentTree;

public class SegmentTree {

    private class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
            this.left = null;
            this.right = null;
        }

    }

    Node root;
    public SegmentTree(int[] arr){
        //create a tree using this array
        this.root = constructTree(arr,0,arr.length-1);
    }

    private Node constructTree(int[] arr, int start , int end){
        if(start == end){
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start,end);

        int mid = (start + end) /2;
        node.left = this.constructTree(arr,start,mid);
        node.right = this.constructTree(arr,mid+1,end);

        node.data = node.left.data + node.right.data;

        return node;
    }

    public void display(){
        display(this.root);
    }

    private void display(Node root){
        String str = "";
        if(root.left != null){
            str = str + "Interval = ["+root.left.startInterval + "-"+root.left.endInterval + "] and data : "+ root.left.data + "+ ->";

        }else {
            str = str + "No left child";
        }
        //for current node
        str = str + "Interval = ["+root.startInterval + "-"+root.endInterval + "] and data : "+ root.data + "+ <-";

        if(root.right != null){
            str = str + "Interval = ["+root.right.startInterval + "-"+root.right.endInterval + "] and data : "+ root.right.data + "+ ->";

        }else {
            str = str + "No right child";
        }

        System.out.println(str);
        if(root.left != null){
            display(root.left);
        }
        if(root.right != null){
            display(root.right);
        }
    }

    //query
    public int query(int qsi, int qei){
        return this.query(this.root,qsi,qei);
    }

    private int query(Node node , int qsi, int qei){
        if(node.startInterval >= qsi && node.endInterval <= qei){
            //node is completely lying inside the query
            return node.data;
        } else if (node.startInterval > qei || node.endInterval < qsi) {
            // completely outside the query
            return 0;
        }else {
            // overlapping
            return this.query(node.left,qsi,qei) + this.query(node.right,qsi,qei);
        }
    }

    //update
    public void update(int index, int value){
        this.root.data = update(this.root,index,value);
    }

    public int update(Node node,int index , int value){
        if(index >= node.startInterval && index <= node.endInterval){
            if(index == node.startInterval && index == node.endInterval){
                node.data = value;
                return node.data;
            }else {
                int leftAns = update(node.left,index,value);
                int rightAns = update(node.right,index,value);

                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }


    public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);
        System.out.println(tree.query(2,6));

    }
}
