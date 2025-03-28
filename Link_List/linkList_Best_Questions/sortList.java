package com.rohit.Link_List.linkList_Best_Questions;

import com.rohit.Link_List.SIngly_Linklist.LL;
import org.w3c.dom.Node;

public class sortList {
    ListNode head;
    ListNode tail;
    int size;
    sortList(){
        this.size = 0;
    }
    public ListNode sortList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return Merge(left,right);
    }

    ListNode Merge(ListNode list1, ListNode list2){
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while (list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1:list2;
        return dummyHead.next;
    }

    //bubble sort in link list
    public void bubbleSort(){
        bubbleSort(size-1,0);
    }

    public void bubbleSort(int row , int col){
        if(row == 0){
            return;
        }
        if (col < row){
            ListNode first = get(col);
            ListNode second = get(col+1);

            if(first.val > second.val){
                //swap
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    ListNode prev = get(col-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;

                }else{
                    ListNode prev = get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row,col+1);
        }else {
            bubbleSort(row-1,0);
        }
    }
    public ListNode get(int index){
        ListNode node = head;
        for(int i = 0 ; i < index ; i++){
            node = node.next;
        }
        return node;
    }

    ListNode getMid(ListNode head){
        ListNode midPrev = null;

        while (head != null && head.next != null){
            midPrev = (midPrev == null) ? head:midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(){}

        ListNode(int val){
            this.val = val;
        }

        ListNode(int val , ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {

    }
}
