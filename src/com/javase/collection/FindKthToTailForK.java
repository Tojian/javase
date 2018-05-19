/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.javase.collection;

/**
 * 
 * @author taojian
 * @time  2017年4月23日下午3:54:32
 * @ClassName FindKthToTailForK.java
 * @description 找出倒数第K个结点
 */


public class FindKthToTailForK {

	
	public ListNode FindKthToTail(ListNode head, int k ){

		ListNode pahead = head;
		ListNode pbehind=null;
		if(head==null||k==0)
			return null;

		for(int i=0;i<k-1;i++){
			if(pahead!=null)
				pahead=pahead.next;
			else
				return null;
		}

		pbehind=head;

		while(pahead.next!=null){
			pahead=pahead.next;
			pbehind=pbehind.next;
		}
		return pbehind;


	}

	public static void main(String[] args) {
		ListNode node1=new ListNode();
		ListNode node2=new ListNode();
		ListNode node3=new ListNode();
		ListNode node4=new ListNode();
		ListNode node5=new ListNode();
		ListNode node6=new ListNode();
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		
		node1.data=1;
		node2.data=4;
		node3.data=5;
		node4.data=8;
		node5.data=9;
		node6.data=11;
		FindKthToTailForK fk=new FindKthToTailForK();
		System.out.println(fk.FindKthToTail(node1, 2).data);
		
	}
}
