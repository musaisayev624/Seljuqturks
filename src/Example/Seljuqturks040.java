package Example;
import java.util.Scanner;
public class Seljuqturks040 {
public static void main(String[] args) {
int[] a=new int[5];
Scanner scanner=new Scanner(System.in);
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
