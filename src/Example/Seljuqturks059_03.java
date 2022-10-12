package Example;
import java.util.ArrayList;
import java.util.List;
public class Seljuqturks059_03 {
public static void main(String[] args) {
List<Integer>nums=new ArrayList();//Dynamic size.Arxada massiv duzeldir.
System.out.println("Size:"+nums.size());
nums.add(100);
System.out.println("Size:"+nums.size());
nums.add(200);
System.out.println("Size:"+nums.size());
nums.add(300);
System.out.println("Size:"+nums.size());
nums.add(400);System.out.println("Size:"+nums.size());
nums.add(300);
nums.add(1,1071);//Indexi elave edir.
//nums.remove(2);//Index-e muraciet edib silirik.
//Integer j=new Integer(300);-Obyekte muraciet edib silirik.
//nums.remove(j);
//nums.clear();-Elementleri silir.
for(int i=0;i<nums.size();i++){
System.out.println(nums.get(i));
}
System.out.println(nums.contains(1071));//Yeni 1071-massivde varmi?
System.out.println(nums.indexOf(1453));//Yeni 1453 massivde varsa indexin gosterir.
System.out.println(nums.lastIndexOf(300));
//System.out.println(nums.set(5,1147));//Elementleri deyisdirir.

}
}
