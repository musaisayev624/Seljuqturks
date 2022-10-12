package Example;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Seljuqturks058_01 {
public static void main(String[] args) {
System.out.println("Program started");
Scanner scanner=new Scanner(System.in);
try{
System.out.print("a=");
int a=scanner.nextInt();
System.out.print("b=");
int b=scanner.nextInt();
int c=a/b;
System.out.println("Result:"+c);
}catch(ArithmeticException e){
System.out.println("Sifira bolme teyin edilmeyib.");
}
catch(InputMismatchException e){
System.out.println("A ve B int ededi ol bilerler.");
}
System.out.println("Program ended");
}   
}
/*AritmethcEx-Ededlerin duzgun olmagi
InputMismatch-Tipe uygun qiymet daxil etmek
ArrayIndexOutBoundsOfEx-Arrayde olmayan index-e muraciet
NullPointerEx-Obyekt yoxdur,Referansa muraciet edir.
*/