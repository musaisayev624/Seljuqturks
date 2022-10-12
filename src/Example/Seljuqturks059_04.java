package Example;
import java.util.ArrayList;
import java.util.List;
public class Seljuqturks059_04 {
public static void main(String[] args) {
List<Integer>nums=new ArrayList();
System.out.println("Size:"+nums.size());
nums.add(100);
System.out.println("Size:"+nums.size());
nums.add(200);
System.out.println("Size:"+nums.size());
nums.add(300);
System.out.println("Size:"+nums.size());
nums.add(400);
System.out.println("Size:"+nums.size());
nums.add(500);
//List<Integer>subNums=nums.subList(1,3);//Secilenleri cap edir.
List<Integer>otherNums=new ArrayList();
otherNums.add(10);
otherNums.add(20);
otherNums.add(30);
otherNums.add(40);
otherNums.add(50);
nums.addAll(0,otherNums);//Elave edir.
nums.removeAll(otherNums);
nums.containsAll(otherNums);//Elementin olub olmamagin yoxlayir.
for(int i=0;i<nums.size();i++){
System.out.println(nums.get(i));
}
}
}
