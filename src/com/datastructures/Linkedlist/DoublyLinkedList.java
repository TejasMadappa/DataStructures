package com.datastructures.Linkedlist;

public class DoublyLinkedList {
    private Node head;

    public boolean insert(int item){
        Node newNode = new Node(item);
        if(head == null){
           head = newNode;
           return true;
        }
        Node x = head;
        Node y = null;
        while(x.next != null){
            x = x.next;
            y = x;
        }
        newNode.prev = x;
        x.next = newNode;
        return true;
    }

    public void printAll(){
        Node n = head;
        while(n != null){
            System.out.println(n.value);
            n = n.next;
        }
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }
    }
}
