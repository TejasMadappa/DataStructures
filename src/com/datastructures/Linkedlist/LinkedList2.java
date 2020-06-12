package com.datastructures.Linkedlist;

public class LinkedList2 {
    private Node head;

    public boolean insert(int item){
        Node n = new Node(item);

        if(head == null){
            head = n;
            return true;
        }

        Node x = head;
        while(x.link != null){
            x = x.link;
        }
        x.link = n;
        return true;
    }

    public boolean delete(int item){
        if(head == null){
            return false;
        }
        if(head.value == item){
            head = head.link;
            return true;
        }

        Node first = head;
        Node second = head.link;
        while(second != null) {
            if (second.value == item) {
                first.link = second.link;
                return true;
            }
            first = first.link;
            second = second.link;
        }
        return false;
    }


    public void printList(){
        Node n = head;
        while(n != null){
            System.out.println(n.value);
            n = n.link;
        }
    }

    private class Node{
        int value;
        Node link;

        Node(int value){
            this.value = value;
        }
    }
}
