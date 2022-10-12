package Example;
import java.util.Scanner;
public class Seljuqturks042 {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.print("Arrayin olcusunu daxil edin:");
int size=scanner.nextInt();
int[] a=new int[size];
for(int i=0;i<a.length;i++){
System.out.print("a["+i+"]=");
a[i]=scanner.nextInt();
}
System.out.println("Arrayin elementleri:");
for(int i=0;i<a.length;i++){
System.out.println(a[i]);
}
}
}
