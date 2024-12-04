package Materia.Stacks;

import Materia.Modelo.Node;
import java.util.EmptyStackException;

public class Stack {
 private Node top; // Nodo en la cima 
 private int size; 
 // Constructor vacío del stack
 public Stack () {
    this.top = null;
    this.size = 0;
 }
 public void push(int value) {
    // Implementación de push
    Node newNode = new Node(value);
    newNode.setNext(top);
    top = newNode;
    size++;

 }
 public int pop(){
    // Implementación de pop
    if(isEmpty()){
        throw new EmptyStackException ();
    }
    int value = top.getValue();
    top = top.getNext();
    size--;
    return value;

 }
 public boolean isEmpty(){

    // Implementación de isEmpty
    return top == null;
 }
 public int peek(){
    // Implementación de peek
    if(isEmpty()){
        throw new EmptyStackException();
    }
    return top.getValue();
   }
   public void printStack(){
      Node current=top;
      while(current!=null){
         System.out.println(current.getValue());
         current = current.getNext();
      }
   }
   public int getsize(){
      // Implementación de getSize
      return size;

   }
   
}
