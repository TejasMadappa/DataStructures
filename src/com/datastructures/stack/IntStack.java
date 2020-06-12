package com.datastructures.stack;

public class IntStack {
    private int[] stack;
    private int top;
    private int size;

    public IntStack(){
        top = -1;
        size = 10;
        stack = new int[size];
    }

    public IntStack(int size){
        top = -1;
        this.size = size;
        stack = new int[size];
    }

    public boolean push(int item){
        if(!isFull()){
            top++;
            stack[top] = item;
            return true;
        }
        return false;
    }

    public int pop(){
        return stack[top--];
    }

    public boolean isFull(){
        return top == size -1;
    }
}
