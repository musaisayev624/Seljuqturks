package Example;
import java.util.Scanner;
public class Seljuqturks016 {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Zehmet olmasa eded daxil edin: ");
int eded=scanner.nextInt();
double result=eded>0?Math.pow(eded,2):2*eded;
System.out.println("Netice="+result);
}
}