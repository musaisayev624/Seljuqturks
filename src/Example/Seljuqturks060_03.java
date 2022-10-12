package Example;
public class Seljuqturks060_03<T> {//MyArrayList
private int size;
private int capacity;
private Object array[];
public Seljuqturks060_03(){
this.capacity=10;
this.array=new Object[capacity];
}
public int getSize(){
return size;
}
public int getCapacity(){
return capacity;
}
public void add(T value){
if(size==capacity){
resizeArray();
}
array[size]=value;
size++;
}
public T get(int index){
if(index>=size){
throw new ArrayIndexOutOfBoundsException("Undefined index");
}
return (T)array[index];
}
void resizeArray(){
capacity*=2;
Object[] newArray=new Object[capacity];
for(int i=0;i<array.length;i++){
newArray[i]=array[i];
}
this.array=newArray;
}
}
/*
Arraylist-in geti yavas(slow),add-i ise suretli(fast) isleyir.
Arraylist-ler Array ile isleyir.
Linkedlist-in get-i suretli(fast),add-i ise yavas(slow) isleyir.
Linkedlist-ler Node-lar isleyir.
*/