package Assignment3;

import java.util.ArrayList;
public class A3 {
    public static void main(String[] args) {
        SpecialStack stk=new SpecialStack(6);
        stk.push(3);
        stk.push(8);
        stk.push(2);
        stk.push(10);
        stk.push(5);
        stk.push(1);
        System.out.println("Minimum in stack is "+stk.getMin());
        System.out.println("Element removed is "+stk.pop());
        System.out.println("Minimum in stack is "+stk.getMin());}}
class SpecialStack {
    static int top=-1;
    ArrayList<Integer> stk;
    ArrayList<Integer> minStk;
    int capacity;
    public SpecialStack(int capacity) {
        this.capacity=capacity;
        stk=new ArrayList<>();
        minStk=new ArrayList<>();    }
    public void push(int ele) {
        if(isFull())
            throw new RuntimeException("Overflow");
        stk.add(++top,ele);
        if(minStk.isEmpty()|| minStk.getLast()>=ele)
            minStk.add(ele);}
    public int pop() {
        if(top<0)
            throw new RuntimeException("Underflow");
        int ele= stk.remove(top--);
        if(!minStk.isEmpty() && minStk.getLast()==ele )
            minStk.removeLast();
        return ele;}
    public boolean isEmpty() {
        return top < 0;
    }
    public boolean isFull() {
        return top == capacity;
    }
    public int getMin() {
        return minStk.getLast();
    }}
