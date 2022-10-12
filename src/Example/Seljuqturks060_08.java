package Example;
public class Seljuqturks060_08 {
public static void main(String[] args) {
Seljuqturks060_07<String,Integer>seljuqturks060_07=new Seljuqturks060_07();//MyHashMap
seljuqturks060_07.put("Osman",1);
seljuqturks060_07.put("Orkhan",2);
seljuqturks060_07.put("Murad",3);
seljuqturks060_07.put("Beyazid",4);
seljuqturks060_07.put("Mehmet",5);
System.out.println(seljuqturks060_07.get("Murad"));
for(int i=0;i<=15;i++){
seljuqturks060_07.put("Seljuqturks#"+i,0+i);
}
System.out.println("Capacity:"+seljuqturks060_07.getCapacity());
System.out.println(seljuqturks060_07.get("Seljuqturks#7"));   
}
}
