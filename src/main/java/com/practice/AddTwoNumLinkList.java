package com.practice;

import com.practice.model.ListNode;

public class AddTwoNumLinkList {

    ListNode firstNode;
    ListNode previousNode;


    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode node1ToProcess= l1;
        ListNode node2ToProcess = l2;

        while (node1ToProcess != null || node2ToProcess != null) {
            ListNode l = addTwoNumbersRe(node1ToProcess, node2ToProcess);

            node1ToProcess = node1ToProcess != null ? node1ToProcess.next : null;
            node2ToProcess = node2ToProcess != null ? node2ToProcess.next : null;

            if (firstNode == null)
                firstNode = l;
            else
                previousNode.next = l;
            previousNode = l;
        }

        return firstNode;
    }


    public ListNode addTwoNumbersRe(ListNode l1, ListNode l2) {
        int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);

        ListNode result = new ListNode();

        if (sum > 9) {
            sum = sum - 10;

            if(l1 != null && l1.next != null)
                l1.next.val = l1.next.val + 1;

            else if(l2 != null && l2.next != null)
                l2.next.val = l2.next.val + 1;

            else{
                result.next = new ListNode(1);
            }
        }

        result.val = sum;
        return result;
    }

}


