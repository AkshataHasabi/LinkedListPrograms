package com.bridgelab.linkedlist;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to linkedlist programms");
		 MyLinkedList<Integer>  myLinkedList = new  MyLinkedList<>();
		 MyNode<Integer> nodeOne = new MyNode<>(56);
		 MyNode<Integer> nodeTwo = new MyNode<>(30);
		 MyNode<Integer> nodeThree = new MyNode<>(70);
		 MyNode<Integer> nodeFour = new MyNode<>(40);
		 
		 //Adding the node to linked list
		 myLinkedList.add(nodeOne);
		 //Appending the node
		 myLinkedList.append(nodeThree);
		 // inserting in between the two nodes
		 myLinkedList.insert(nodeOne, nodeTwo);
		 myLinkedList.printMyNodes();
		 //here again inserted the node 
		 myLinkedList.insertAfter(nodeTwo, nodeFour);
		 myLinkedList.printMyNodes();
		 //here we searched the node by passing node data
		 myLinkedList.search(40); 
		 //delete the node 
		 myLinkedList.deleteNode(nodeOne, 2);
		 myLinkedList.printMyNodes();
		 myLinkedList.size();
		
	}
}
