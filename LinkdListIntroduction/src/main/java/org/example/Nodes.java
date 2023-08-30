package org.example;

public class Nodes {

  class Node {

    int data;
    Node prev;
    Node next;

    public Node(int data) {
      this.data = data;

    }
  }

  Node head, tail = null;

  public void addNode(int data) {

    Node newNode = new Node(data);

    if (head == null) {
      head = tail = newNode;
      head.prev = null;
      tail.next = null;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
      tail.next = null;
    }
  }

  public void display() {

    Node current = head;

    if (head == null) {

      System.out.println("List is empty");
      return;
    }
    System.out.println("Node of doubly linked list: ");
    while (current != null) {

      System.out.println(current.data + "");
      current = current.next;


    }
  }
}


