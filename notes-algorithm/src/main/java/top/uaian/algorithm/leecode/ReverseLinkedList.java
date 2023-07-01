package top.uaian.algorithm.leecode;

import top.uaian.notes.algorithm.ListNode;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(5);
        ListNode listNode2 = new ListNode(4, listNode1);
        ListNode listNode3 = new ListNode(3, listNode2);
        ListNode listNode4 = new ListNode(2, listNode3);
        ListNode listNode5 = new ListNode(1, listNode4);
        ListNode listNode = reverseList(listNode5);
        System.out.println(listNode);
    }


    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head != null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
