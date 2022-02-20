package com.practice;

import com.practice.model.ListNode;

public class MergeTwoSortedLinkList {


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode node1ToProcess = list1;
        ListNode node2ToProcess = list2;

        ListNode resulNode = null;
        ListNode previousProcessedNode = null;


        while (node1ToProcess != null && node2ToProcess != null) {

            if (node1ToProcess.val < node2ToProcess.val) {

                ListNode nodeWithMinValue = new ListNode(node1ToProcess.val);

                if (resulNode == null)
                    resulNode = nodeWithMinValue;
                else
                    previousProcessedNode.next = nodeWithMinValue;

                previousProcessedNode = nodeWithMinValue;

                node1ToProcess = node1ToProcess.next;

            } else if (node1ToProcess.val > node2ToProcess.val) {
                ListNode nodeWithMinValue = new ListNode(node2ToProcess.val);

                if (resulNode == null)
                    resulNode = nodeWithMinValue;
                else
                    previousProcessedNode.next = nodeWithMinValue;

                previousProcessedNode = nodeWithMinValue;

                node2ToProcess = node2ToProcess.next;
            } else {

                ListNode nodeWithMinValue = new ListNode(node1ToProcess.val);

                if (resulNode == null)
                    resulNode = nodeWithMinValue;
                else
                    previousProcessedNode.next = nodeWithMinValue;

                previousProcessedNode = nodeWithMinValue;

                node1ToProcess = node1ToProcess.next;

                ListNode nodeWithMinValue2 = new ListNode(node2ToProcess.val);

                if (resulNode == null)
                    resulNode = nodeWithMinValue2;
                else
                    previousProcessedNode.next = nodeWithMinValue2;

                previousProcessedNode = nodeWithMinValue2;

                node2ToProcess = node2ToProcess.next;
            }
        }

        ListNode nodeLoop;
        if (node1ToProcess != null)
            nodeLoop = node1ToProcess;
        else nodeLoop = node2ToProcess;

        while (nodeLoop != null) {
            ListNode result = new ListNode(nodeLoop.val);

            if (resulNode == null)
                resulNode = result;
            else
                previousProcessedNode.next = result;

            previousProcessedNode = result;

            nodeLoop = nodeLoop.next;
        }

        return resulNode;
    }

    public ListNode mergeTwoListsConcidse(ListNode list1, ListNode list2) {
        final ListNode root = new ListNode();
        ListNode prev = root;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }

        prev.next = list1 != null ? list1 : list2;

        return root.next;
    }

}
