package com.practice;

import com.practice.model.ListNode;

import java.util.Collections;
import java.util.List;

public class ReverseLinkList {


    public static void main(String[] args) {
        ListNode node = getLinkList(10);
        printAllLinkNodes(node);
    }

    private static ListNode getLinkList(int limit) {

        ListNode result = new ListNode(1);

        ListNode prv = result;

        for (int i = 2; i <= limit; i++) {
            ListNode newNode = new ListNode(i);
            prv.next = newNode;

            prv = newNode;
        }

        return result;
    }

    private static void reverseLinkList(ListNode listNode) {



    }

    private static void printAllLinkNodes(ListNode listNode) {

        ListNode nodeToProcess = listNode;

        List l = Collections.emptyList();

        String s = l.toString();

        while (nodeToProcess != null) {
            System.out.println(nodeToProcess.val + ", ");
            nodeToProcess = nodeToProcess.next;
        }
    }
}
