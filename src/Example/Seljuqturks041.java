package Example;
import java.util.Scanner;
public class Seljuqturks041 {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.print("Arrayin olcusunu daxil edin:");
int size=scanner.nextInt();
int[] a=new int[size];
for(int i=0;i<a.length;i++){
System.out.print("a["+i+"]=");
a[i]=scanner.nextInt();
}
int sum=0;
for(int i=0;i<a.length;i++){
sum+=a[i];
}
System.out.println("Sum of Array's elements:"+sum);
}
}
