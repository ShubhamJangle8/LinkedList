package com.linkedlist.mylinklist;

public class SortedLinkedList<K extends Comparable<K>> {
	private INode<Integer> head;
	private INode<Integer> tail;

	public INode<Integer> getHead() {
		return head;
	}

	public void setHead(INode<Integer> head) {
		this.head = head;
	}

	public INode<Integer> getTail() {
		return tail;
	}

	public void setTail(INode<Integer> tail) {
		this.tail = tail;
	}

	public SortedLinkedList() {
		this.head = null;
	}

	public void addAtHead(INode<Integer> newNode) {
		if (head == null)
			head = newNode;
		if (tail == null)
			tail = newNode;
		else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	public void addAtTail(INode<Integer> newNode) {
		if (head == null)
			head = newNode;
		if (tail == null)
			tail = newNode;
		else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	public void printLinkList() {
		StringBuffer myNodes = new StringBuffer();
		INode<Integer> tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail)) {
				myNodes.append("--->");
			}
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);

	}

	public void insert(INode<Integer> myNode, INode<Integer> newNode) {
		INode<Integer> tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public void pop() {
		this.head = this.head.getNext();
	}

	public INode<Integer> popLast() {
		if (this.head == null) {
			return null;
		}
		if (this.head.getNext() == null) {
			return null;
		} 
		else {
			INode<Integer> tempNode = this.head;
			while (!tempNode.getNext().equals(this.tail)) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(null);
			this.tail = tempNode;
			return tempNode;
		}
	}

	public INode<Integer> searchNode(Integer key) {
		INode<Integer> tempNode = this.head;
		while (tempNode.getKey() != key) {
			tempNode = tempNode.getNext();
		}
		return tempNode;
	}

	public void insertAfterAKey(Integer key, INode<Integer> newNode) {
		INode<Integer> tempNode = this.head;
		while (tempNode.getKey() != key) {
			tempNode = tempNode.getNext();
		}
		insert(tempNode, newNode);
	}

	public INode<Integer> popFindingKey(Integer key) {
		INode<Integer> tempNode = head;
		INode<Integer> prevNode = null;
		if (this.head == null) {
			return null;
		}
		if (tempNode.getNext() == null) {
			return null;
		} 
		else if (tempNode.getKey() == key) {
			this.head = tempNode.getNext();
			return tempNode;
		}
		else {
			while (tempNode != null && tempNode.getKey() != key) {
				prevNode = tempNode;
				tempNode = tempNode.getNext();
			}
			prevNode.setNext(tempNode.getNext());
			return tempNode;
		}
	}
	
	public boolean addInSortedOrder(INode<Integer> newNode) {
		INode<Integer> tempNode = head;
		if (head == null) { 
			head = newNode;
			tail = newNode;
		} 
		else if (head.getKey().compareTo(newNode.getKey()) > 0) { 
																	
			newNode.setNext(tempNode);
			head = newNode;
		} 
		else if (tail.getKey().compareTo(newNode.getKey()) < 0) { 
			tail.setNext(newNode);
			tail = newNode;
		} 
		else {
			INode<Integer> prevNode = head;
			while (tempNode.getNext() != null && tempNode.getKey().compareTo(newNode.getKey()) < 0) {
				prevNode = tempNode;
				tempNode = tempNode.getNext();
			}
			newNode.setNext(prevNode.getNext());
			prevNode.setNext(newNode);
		}
		return true;
	}

}