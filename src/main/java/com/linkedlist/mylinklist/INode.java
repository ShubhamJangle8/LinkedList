package com.linkedlist.mylinklist;

public interface INode<K> {
	public void setKey(K key);

	public K getKey();

	public void setNext(INode<K> node);

	public INode<K> getNext();
}
