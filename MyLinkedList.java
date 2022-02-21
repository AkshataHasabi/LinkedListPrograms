package com.bridgelab.linkedlist;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;
	
	public MyLinkedList() {
		this.head=null;
		this.tail=null;
	}
	
	public void add(INode<K> newNode) {
		if(this.head==null) {
			this.head=newNode;
		}
		if(this.tail==null) {
			this.tail=newNode;
		}else {
			INode<K> tempNode=this.head;
			this.head=newNode;
			this.head.setNext(tempNode);
		}
	}
	
	public void append(INode<K> newNode) {
		if(this.head==null) {
			this.head=newNode;
		}
		if(this.tail==null) {
			this.tail=newNode;
		}else {
			this.tail.setNext(newNode);
			this.tail=newNode;
			
		}
	}
	
	public void insert(INode<K> myNode, INode<K> newNode) {
		INode<K> tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	public void printMyNodes() {
		StringBuffer myNodes=new StringBuffer("my nodes:");
		INode<K> tempNode=head;
		while(tempNode.getNext()!=null) {
			myNodes.append(tempNode.getKey());
			myNodes.append("->");
			tempNode=tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println("My Nodes:"+myNodes);
	}
}
