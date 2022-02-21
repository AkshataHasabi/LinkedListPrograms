package com.bridgelab.linkedlist;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to linkedlist programms");
		 MyLinkedList<Integer>  myLinkedList = new  MyLinkedList<>();
		 MyNode<Integer> nodeOne = new MyNode<>(56);
		 MyNode<Integer> nodeTwo = new MyNode<>(30);
		 MyNode<Integer> nodeThree = new MyNode<>(70);
		 
		 nodeOne.setNext(nodeTwo);
		 nodeTwo.setNext(nodeThree);
		 System.out.println(nodeOne);
	}
}
