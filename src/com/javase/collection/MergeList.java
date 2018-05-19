/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.javase.collection;

/**
 * 
 * @author taojian
 * @time  2017年4月23日下午5:15:46
 * @ClassName MergeList.java
 * @description 两个链表进行合并
 */
//链表


public class MergeList {


	public ListNode merge(ListNode head1, ListNode head2){
		 if(head1==null)
			 return head2;
		 else if(head2==null)
			 return head1;

		 ListNode mergeHead=null;

		 if(head1.data<head2.data){
			 mergeHead=head1;
			 mergeHead.next=merge(head1.next, head2);
		 }else{
			 mergeHead=head2;
			 mergeHead.next=merge(head1,head2.next);
		 }
		 return mergeHead;

	}

	public static void main(String[] args) {
		ListNode head1=new ListNode();
		ListNode node2=new ListNode();
		ListNode node3=new ListNode();
		ListNode node4=new ListNode();
		ListNode node5=new ListNode();
		ListNode node6=new ListNode();
		head1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		head1.data=1;
		node2.data=4;
		node3.data=5;
		node4.data=8;
		node5.data=9;
		node6.data=11;
		ListNode head2=new ListNode();
		ListNode node7=new ListNode();
		ListNode node8=new ListNode();
		ListNode node9=new ListNode();
		ListNode node10=new ListNode();
		ListNode node11=new ListNode();
		head2.next=node7;
		node7.next=node8;
		node8.next=node9;
		node9.next=node10;
		node10.next=node11;
		head2.data=2;
		node7.data=2;
		node8.data=5;
		node9.data=7;
		node10.data=19;
		node11.data=20;
		MergeList fk=new MergeList();
		ListNode mergeNode=fk.merge(head1, head2);
		
		while(mergeNode.next!=null){
		System.out.print(mergeNode.data+" ");
		mergeNode=mergeNode.next;
		}
		
	}
}
