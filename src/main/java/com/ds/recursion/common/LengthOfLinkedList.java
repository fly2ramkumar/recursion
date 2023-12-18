package com.ds.recursion.common;


public class LengthOfLinkedList {
	
	private static int lengthOfList(ListNode head) {
	
		if(head == null)
			return 0;
		
		return 1 + lengthOfList(head.next);		
	}
	
	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(3);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(1);

		System.out.println(lengthOfList(head));
		
	}

}
