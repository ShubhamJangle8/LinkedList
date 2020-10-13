package com.linkedlist.mylinklist;

public class MyLinkedList {
	private INode head;
	private INode tail;

	public INode getHead() {
		return head;
	}

	public void setHead(INode head) {
		this.head = head;
	}

	public INode getTail() {
		return tail;
	}

	public void setTail(INode tail) {
		this.tail = tail;
	}

	public MyLinkedList() {
		this.head = null;
	}

	public void add(INode newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} 
		else {
			INode tempNode = this.tail;
			this.tail = newNode;
			tempNode.setNext(newNode);

		}

	}

	public void printLinkList() {
		StringBuffer myNodes = new StringBuffer();
		INode tempNode = head;
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

	public void insert(INode myNode, INode<Integer> newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public void pop() {
		this.head = this.head.getNext();
	}

	public INode popLast() {
		if (this.head == null) {
			return null;
		}
		if (this.head.getNext() == null) {
			return null;
		} 
		else {
			INode tempNode = this.head;
			while (!tempNode.getNext().equals(this.tail)) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(null);
			this.tail = tempNode;
			return tempNode;
		}
	}

	public INode searchNode(Integer key) {
		INode tempNode = this.head;
		while (tempNode.getKey() != key) {
			tempNode = tempNode.getNext();
		}
		return tempNode;
	}

	public void insertAfterAKey(Integer key, INode newNode) {
		INode tempNode = this.head;
		while (tempNode.getKey() != key) {
			tempNode = tempNode.getNext();
		}
		insert(tempNode, newNode);
	}

	public INode popFindingKey(Integer key) {
		INode temp = head;
		INode prev = null;
		if (this.head == null) {
			return null;
		}
		if (temp.getNext() == null) {
			return null;
		} 
		else if (temp.getKey() == key) {
			this.head = temp.getNext();
			return temp;
		}
		else {
			while (temp != null && temp.getKey() != key) {
				prev = temp;
				temp = temp.getNext();
			}
			prev.setNext(temp.getNext());
			return temp;
		}
	}

}