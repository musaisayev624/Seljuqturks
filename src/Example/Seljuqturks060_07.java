package Example;
public class Seljuqturks060_07<K,V> {//MyHashMap
private int capacity;
private int size;
private float loadFactor;
private float resizeElement;
private Node<K,V>[]array;
public Seljuqturks060_07(){
this.capacity=16;
this.loadFactor=0.75f;
this.array=new Node[capacity];
this.resizeElement=capacity*loadFactor;
}
public int getCapacity(){
return capacity;
}
public void put(K key,V value){
if(resizeElement==size){
capacity*=2;
this.resizeElement=capacity*loadFactor;
Node[]newArray=new Node[capacity];
for(int i=0;i<array.length;i++){
newArray[i]=array[i];
}
this.array=newArray;
}
Node node=new Node(key,value);
array[size]=node;
size++;
}
public V get(K key){
for(Node node:array){
if(node!=null&&key.equals(node.key)){
return(V)node.value;
}
}
return null;
}
private class Node<K,V>{//Node
private int hashCode;
private K key;
private V value;
private Node next;
public Node (K key,V value){
this.hashCode=key.hashCode();
this.key=key;
this.value=value;
}
}
}