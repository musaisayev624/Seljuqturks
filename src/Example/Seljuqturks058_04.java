package Example;
import java.util.Scanner;
public class Seljuqturks058_04 {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Program started");
try{
calculate(12,0);
}catch(Exception e){
System.out.println("Sifir bolmek olmaz.");
}
System.out.println("Program ended");
}
static void calculate(int a,int b)throws Exception{
try{
int c=a/b;
System.out.println("Result:"+c);
}catch(ArithmeticException e){
System.out.println("Mexrec sifir ola bilmez.");   
}
} 
}