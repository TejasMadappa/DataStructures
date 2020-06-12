package com.datastructures.Linkedlist;

public class IntLinkedlist {
    private Node head;

    public boolean insert(int item){
        Node n = new Node(item, null);
        if(head == null){
            head = n;
            return true;
        }
        n.link = head;
        head = n;
        return true;
    }

    public boolean delete(int item){
        if(head.value == item){
            head = head.link;
            return true;
        }

        Node first = head;
        Node second = head.link;
        while (second != null){
            if(second.value == item){
                first.link = second.link;
                return true;
            }
            first = second;
            second = second.link;
        }
        return false;
    }

    public void printList(){
        Node n = head;
        while (n != null){
            System.out.println(n.value);
            n = n.link;
        }
    }

    private class Node{
        private int value;
        private Node link;

        Node(int value, Node link){
            this.value = value;
            this.link = link;
        }
    }
}
