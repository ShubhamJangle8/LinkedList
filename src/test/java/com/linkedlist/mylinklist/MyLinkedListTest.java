package com.linkedlist.mylinklist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyLinkedListTest {

	@Test
	void test() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkList = new MyLinkedList();
		myLinkList.add(myFirstNode);
		Assert.assertTrue(myLinkList.getHead().equals(myFirstNode) && myLinkList.getTail().equals(myFirstNode));
	}

	@Test
	void test1() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkList = new MyLinkedList();
		myLinkList.add(myFirstNode);
		myLinkList.add(mySecondNode);
		myLinkList.add(myThirdNode);
		myLinkList.printLinkList();
		Assert.assertTrue(myLinkList.getHead().equals(myThirdNode) && myFirstNode.getNext() == null
				&& myThirdNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myFirstNode));
	}

}
