package Example;
public class Seljuqturks060_04 {
public static void main(String[] args) {
Seljuqturks060_03<String>seljuqturks060_03=new Seljuqturks060_03();
/*seljuqturks060_03.add("Sultan Togrul");
seljuqturks060_03.add("Sultan Alp Arslan");
seljuqturks060_03.add("Sultan Melikshah");
seljuqturks060_03.add("Sultan Muhammed Tapar");
System.out.println("ArrayList:"+seljuqturks060_03.get(2));
*/
for(int i=0;i<30;i++){
seljuqturks060_03.add("Data#"+i);
}
System.out.println("Capacity:"+seljuqturks060_03.getCapacity());
System.out.println("Size:"+seljuqturks060_03.getSize());
for(int i=0;i<seljuqturks060_03.getSize();i++){
System.out.println("Arraylist:"+seljuqturks060_03.get(i));
}
}
}
