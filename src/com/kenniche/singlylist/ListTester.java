package com.kenniche.singlylist;

public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.AddBack(1);
        sll.AddBack(2);
        sll.AddBack(3);
        sll.AddBack(4);

        int val = sll.removeBack();
        System.out.println("Value Removed: " + val);
        
        sll.printValues(); 
        sll.findValues(2);
        
    }
}
