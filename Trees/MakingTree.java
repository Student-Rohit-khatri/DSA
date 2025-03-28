package com.rohit.Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.in;

public class MakingTree {

    public static class TreeNode { TreeNode left;
     TreeNode right;
     int val;
     TreeNode() {}
      TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = null;
          this.right = null;
      }
  }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> inMap = new HashMap<>();

        for(int i = 0 ; i < inorder.length ; i++){
            inMap.put(inorder[i],i);
        }

        TreeNode root = build(preorder,0,preorder.length-1,inorder,0,inorder.length-1,inMap);

        return root;
    }

    public static TreeNode build(int []preorder,int preStart , int preEnd, int[] inorder,int inStart, int inEnd, Map<Integer,Integer> inMap ){
        if(preStart > preEnd || inStart > inEnd){
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);

        int inRoot = inMap.get(root.val);
        int numsLeft = inRoot - inStart;

        root.left = build(preorder,preStart+1,preStart+numsLeft,inorder,inStart,inRoot-1,inMap);
        root.right = build(preorder,preStart+numsLeft+1, preEnd,inorder,inRoot+1,inEnd,inMap);

        return root;
    }

    public static void inorder(TreeNode root ){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(" "+root.val);
        inorder(root.right);


    }
    public static void main(String[] args) {
        int inorder[] = {9,3,15,20,7};
        int preOrder[] = {3,9,20,15,7};
        TreeNode root = null;
        root = buildTree(preOrder, inorder );

        System.out.println(root);
    }
}
