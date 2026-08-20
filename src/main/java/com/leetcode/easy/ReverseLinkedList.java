package com.leetcode.easy;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        ListNode prev = head;
        ListNode curr = prev != null ? prev.next : null;
        ListNode next;
        boolean first = true;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            if (first) {
                prev.next = null;
                first = false;
            }
            prev = curr;

            if (next != null) {
                curr = next;
            } else {
                curr = null;
            }
        }

        return prev;
    }


    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        one.next = two;

        ListNode it = one;

        System.out.print("[");
        while (it != null) {
            System.out.print(it.val + ",");
            it = it.next;
        }
        System.out.println("]");

        ReverseLinkedList solver = new ReverseLinkedList();
        ListNode rv = solver.reverseList(one);

        System.out.print("RV[");
        while (rv != null) {
            System.out.print(rv.val + ",");
            rv = rv.next;
        }
        System.out.println("]");

    }
}
