package com.linkedlist.mylinklist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyLinkedListTest {

	@Test
	void GivenThreeNodes_WhenAppended_GetsAppended() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyNode<Integer> myFourthNode = new MyNode<>(80);
		MyNode<Integer> myFifthNode = new MyNode<>(98);
		MyNode<Integer> mySixthNode = new MyNode<>(105);
		MyLinkedList myLinkList = new MyLinkedList();
		myLinkList.add(myFirstNode);
		myLinkList.add(mySecondNode);
		myLinkList.add(myThirdNode);
		myLinkList.add(myFourthNode);
		myLinkList.add(myFifthNode);
		myLinkList.add(mySixthNode);
		myLinkList.printLinkList();
		Assert.assertTrue(myLinkList.getHead().equals(myFirstNode) && myFirstNode.getNext().equals(mySecondNode)
				&& mySecondNode.getNext().equals(myThirdNode) && myThirdNode.getNext().equals(myFourthNode)
				&& myFourthNode.getNext().equals(myFifthNode) && myFifthNode.getNext().equals(mySixthNode)
				&& mySixthNode.getNext() == null);
	}

	@Test
	void GivenNode_whenInserted_GetsInsertedBetween2Nodes() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> myInsertionNode = new MyNode<>(80);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyNode<Integer> myFourthNode = new MyNode<>(85);
		MyLinkedList myLinkList = new MyLinkedList();
		myLinkList.add(myFirstNode);
		myLinkList.add(mySecondNode);
		myLinkList.add(myThirdNode);
		myLinkList.add(myFourthNode);
		myLinkList.insert(myFirstNode, myInsertionNode);
		myLinkList.printLinkList();
		Assert.assertTrue(myLinkList.getHead().equals(myFirstNode) && myFirstNode.getNext().equals(myInsertionNode)
				&& myInsertionNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode)
				&& myThirdNode.getNext().equals(myFourthNode) && myFourthNode.getNext() == null);
	}

}
