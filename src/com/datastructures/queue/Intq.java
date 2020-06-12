package com.datastructures.queue;

public class Intq {
    private int[] q;
    private int total;
    private int size;
    private int front = 0;
    private int rear = 0;

    public Intq(){
        size = 50;
        total = 0;
        q = new int[size];
    }

    public Intq(int size){
        this.size = size;
        total = 0;
        q = new int[size];
    }

    public boolean enqueue(int item){
        if(isFull()){
            return false;
        }
        q[front] = item;
        front++;
        total++;
        return true;
    }

    public int dequeue(){
        if(rear < size) {
            return q[rear++];
        }

        return 0;
    }

    public boolean isFull(){
        return total == size;
    }
}
