package com.rohit.Link_List.linkList_Best_Questions;

public class LL_cycle_or_not {

    //This is solution to check a ll for m a circle or not
    public boolean hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    //finding the length of a cycle
    public int lengthCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                //calculate the length of a cycle
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                }while (temp != fast);
                return length;
            }
        }
        return 0;
    }

    //finding the node from where the cycle start
    public ListNode detectCycle(ListNode head){
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
              length = lengthCycle(slow);
              break;
            }
        }

        if(length == 0){
            return null;
        }

        //find the start node
        ListNode f = head;
        ListNode s = head;
        while (length > 0){
            s = s.next;
            length--;
        }
        //keep moving both forward and they will meet at cycle start
        while (f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }

    //To check  number is happy number or not
        public boolean isHappy(int n){
            int slow = n;
            int fast = n;

            do {
                slow = findSquare(slow);
                fast = findSquare(findSquare(fast));
            }while (slow != fast);

            if (slow == 1){
                return true;
            }
            return false;
        }
        private int findSquare(int number){
            int ans = 0;
            while(number > 0){
                int rem = number%10;
                ans += rem * rem;
                number = number/10;
            }
            return ans;
        }


        //To find middleNode at single pass . In this case we cant calculate the length of a ll.so in this case we use
        // fast and slow pointer . we move slow pointer by on step and fast pointer by 2 step . when fast pointer
        // is at the end the slow pointer is at the mid of the link list.
    public ListNode middleNode(ListNode head){
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }



    class ListNode{
        int val;
        ListNode next;

        ListNode(int x){
            val = x;
            next = null;
        }
    }
    public static void main(String[] args) {
        LL_cycle_or_not list = new LL_cycle_or_not();
        System.out.println(list.isHappy(19));
    }
}
