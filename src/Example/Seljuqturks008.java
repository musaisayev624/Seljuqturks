package Example;
import java.util.Scanner;
public class Seljuqturks008 {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Her hansi eded daxil edin:");
double x=scanner.nextDouble();
double result=Math.sqrt(x);
if(x>0){
System.out.println("x-in kok alti "+result);
}else{
System.out.println("Zehmet olmasa musbet eded daxil edin!");
}
}
}