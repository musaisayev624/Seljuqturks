package Example;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;
public class Seljuqturks058_03{
public static void main(String[] args) {
String names[]={"Yasin","Musa"};
System.out.println("Program started");
Scanner scanner=new Scanner(System.in);
try{
System.out.println("Arrayin elementini:"+names[0]);
}catch(ArrayIndexOutOfBoundsException e){
System.out.println("Arrayin olmayan elementine muraciet etmek olmaz.");
}
int a,b;
try{
System.out.print("a=");
a=scanner.nextInt();
}catch(InputMismatchException e){
System.out.println("A-ucun default qiymet alindi.");
a=23;
}
try{
System.out.print("b=");
b=scanner.nextInt();
}catch(InputMismatchException e){
System.out.println("B-ucun default qiymet alindi.");
b=10;
}
try{
int c=a/b;
System.out.println("Result:"+c);
}catch(ArithmeticException e){
System.out.println("Sifira bolme teyin edilmeyib.");
}
catch(InputMismatchException e){
System.out.println("A ve B int ededi ol bilerler.");
}
}
}