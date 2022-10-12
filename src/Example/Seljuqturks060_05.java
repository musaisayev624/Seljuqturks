package Example;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Seljuqturks060_05 {
public static void main(String[] args) {
Set<String>names=new HashSet<>();//List-lerde order(ardicilliq) prinsipi var.
names.add("Rusif");//Set-de Dublikat(Tekrar) element saxlamir.
names.add("Musa");//HashSet-Elementleri qaris-qurus verir. 
names.add("Meharet");
names.add("Rusif");
names.add("Musa");
System.out.println("Size:"+names.size());
for(String name:names){
System.out.println(name);
}
Set<String>nums=new TreeSet<>();
nums.add("1");//TreeSet-Elementleri artan sira ile verir.
nums.add("2");
nums.add("3");
nums.add("4");
nums.add("5");
System.out.println("Size:"+nums.size());
System.out.println(nums);
for(String num:nums){
System.out.println(nums);
}
}
}