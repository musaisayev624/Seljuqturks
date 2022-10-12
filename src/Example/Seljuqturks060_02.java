package Example;
public class Seljuqturks060_02<T> {//MyLinkedList
private Node head;
private int size;
public int getSize(){
return size;
}
public void add(T value){
size++;
Node node=new Node(value);
if(head==null){
head=node;
}else{
Node last=head;
while(last.next!=null){
last=last.next;
}
last.next=node;
}
}
public T get(int index){
Node currentNode=head;
int counter=0;
while(currentNode!=null){
if(counter==index){
return currentNode.value;
}
System.out.println("Data:"+currentNode.value);
currentNode=currentNode.next;
counter++;
}
throw new ArrayIndexOutOfBoundsException("Undefined index");
}
private class Node{
private T value;
private Node next;
public Node(T value,Node next){
this.next=next;
this.value=value;
}
public Node(T value){
this.next=null;
this.value=value;
}
}
}
/*
Linkedlist-in get-i suretli(fast),add-i ise yavas(slow) isleyir.
Linkedlist-ler Node-lar isleyir.
Arraylist-in geti yavas(slow),add-i ise suretli(fast) isleyir.
Arraylist-ler Array ile isleyir.
*/