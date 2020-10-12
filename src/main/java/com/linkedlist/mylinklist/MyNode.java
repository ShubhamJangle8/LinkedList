package com.linkedlist.mylinklist;

public class MyNode<K> {
	private K key;
	private MyNode<K> next;

	
	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public K getKey() {
		return key;
	}

	public void setNext(MyNode<K> next) {
		this.next = (MyNode<K>) next;
	}

	public MyNode<K> getNext() {
		return next;
	}

}
