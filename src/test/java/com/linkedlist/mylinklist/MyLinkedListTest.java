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
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyNode<Integer> myFourthNode = new MyNode<>(85);
		MyNode<Integer> myInsertionNode = new MyNode<>(80);
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

	@Test
	void GivenNode_whenFirstElementDeleted_GetsDeleted() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyNode<Integer> myFourthNode = new MyNode<>(85);
		MyLinkedList myLinkList = new MyLinkedList();
		myLinkList.add(myFirstNode);
		myLinkList.add(mySecondNode);
		myLinkList.add(myThirdNode);
		myLinkList.add(myFourthNode);
		myLinkList.pop();
		myLinkList.printLinkList();
		Assert.assertTrue(myLinkList.getHead().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode)
				&& myThirdNode.getNext().equals(myFourthNode) && myFourthNode.getNext() == null);
	}

	@Test
	void GivenNode_whenLastElementPoped_GetsDeleted() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyNode<Integer> myFourthNode = new MyNode<>(85);
		MyLinkedList myLinkList = new MyLinkedList();
		myLinkList.add(myFirstNode);
		myLinkList.add(mySecondNode);
		myLinkList.add(myThirdNode);
		myLinkList.add(myFourthNode);
		myLinkList.popLast();
		myLinkList.printLinkList();
		Assert.assertTrue(myLinkList.getHead().equals(myFirstNode) && myFirstNode.getNext().equals(mySecondNode)
				&& mySecondNode.getNext().equals(myThirdNode) && myThirdNode.getNext() == null);
	}
	
	@Test
	void GivenNode_SearchedElement_WithAKey() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyNode<Integer> myFourthNode = new MyNode<>(85);
		MyLinkedList myLinkList = new MyLinkedList();
		myLinkList.add(myFirstNode);
		myLinkList.add(mySecondNode);
		myLinkList.add(myThirdNode);
		myLinkList.add(myFourthNode);
		INode foundNode = myLinkList.searchNode(30);
		Assert.assertTrue(foundNode.equals(mySecondNode));
	}
	
	@Test
	void GivenNode_SearchedElementWithAKey_InsertedAfterThat() {
		MyNode<Integer> myFirstNode = new MyNode<>(38);
		MyNode<Integer> mySecondNode = new MyNode<>(80);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyNode<Integer> myFourthNode = new MyNode<>(65);
		MyNode<Integer> myInsertionNode = new MyNode<>(49);
		MyLinkedList myLinkList = new MyLinkedList();
		myLinkList.add(myFirstNode);
		myLinkList.add(mySecondNode);
		myLinkList.add(myThirdNode);
		myLinkList.add(myFourthNode);
		myLinkList.insertAfterAKey(80, myInsertionNode);
		myLinkList.printLinkList();
		Assert.assertTrue(myLinkList.getHead().equals(myFirstNode) && myFirstNode.getNext().equals(mySecondNode)
				&& mySecondNode.getNext().equals(myInsertionNode) && myInsertionNode.getNext().equals(myThirdNode)
				&& myThirdNode.getNext().equals(myFourthNode) && myFourthNode.getNext() == null);
	}

}
