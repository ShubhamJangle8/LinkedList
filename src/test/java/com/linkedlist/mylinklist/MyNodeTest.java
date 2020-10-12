package com.linkedlist.mylinklist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyNodeTest {

	@Test
	public void Given3Nodes_WhenAddedToNext_GetsAdded() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		Assert.assertTrue((myFirstNode.getNext().equals(mySecondNode)) && (mySecondNode.getNext().equals(myThirdNode)));
	}

}
