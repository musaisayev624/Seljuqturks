package Example;
import java.util.Scanner;
public class Seljuqturks007 {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Her hansi eded daxil edin: ");
int a=scanner.nextInt();
System.out.println("Her hansi eded daxil edin: ");
int b=scanner.nextInt();
boolean greater=a>b;
boolean little=a<b;
boolean equal=a==b;
boolean differ=a!=b;
boolean ge=a>=b;
boolean le=a<=b;
System.out.println(a+">"+b+"="+greater);
System.out.println(a+"<"+b+"="+little);
System.out.println(a+"=="+b+"="+equal);
System.out.println(a+"!="+b+"="+differ);
System.out.println(a+">="+b+"="+ge);
System.out.println(a+"<="+b+"="+le);
}
}