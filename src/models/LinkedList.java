package models;

import materia.models.NodeGeneric;

public class LinkedList<T> {
private NodeGeneric<T> head;
private int size=0;

public void  print(){
    if(head==null){
        System.out.println("End");
        return;
    }
    NodeGeneric<T> current = head;
    while(current.getNext()!=null){
        System.out.print(current.getValue()+" -> ");
        current=current.getNext();
    }
    System.out.println("Endi");
}

public NodeGeneric<T> getHead() {
    return head;
}

public void setHead(NodeGeneric<T> head) {
    this.head = head;
}

public int getSize() {
    return size;
}

public void setSize(int size) {
    this.size = size;
}
public void appendToTail(T value){
 if(head==null){
    head=new NodeGeneric<>(value);
 }else{
    NodeGeneric<T> current=head;
    while(current.getNext()!=null){
        current=current.getNext();
    }
    current.setNext(new NodeGeneric<>(value));
}

size++;
}

}
