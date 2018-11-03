/*
 * Copyright (C) 2018 Tao Jian. All Rights Reserved.
 */
package com.javase.collection;

/**
 * 
 * @author taojian
 * @time  2017年4月23日下午4:50:46
 * @ClassName ReverseList.java
 * @description 反转链表
 */
//链表


public class ReverseList {


	public ListNode reverseList(ListNode head){
		  if(head==null){
		    return null;
		  }
		  if(head.next==null){
		    return head;
		  }
		  ListNode preListNode=null;
		  ListNode nowListNode=head;
		  ListNode reversedHead=null;
		  while(nowListNode.next!=null){
		    ListNode nextListNode=nowListNode.next;
		    if(nextListNode==null)
		      reversedHead=nextListNode;
		    nowListNode.next=preListNode;
		    preListNode=nowListNode;
		    nowListNode=nextListNode;
		  }
		  return nowListNode;
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
		ReverseList fk=new ReverseList();
		System.out.println(fk.reverseList(node1).data);
		
	}
}
