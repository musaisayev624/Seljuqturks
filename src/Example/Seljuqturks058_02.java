package Example;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.ArithmeticException;
public class Seljuqturks058_02 {
public static void main(String[] args) {
String names[]={"Yasin","Musa"};
System.out.println("Program started");
Scanner scanner=new Scanner(System.in);
try{
System.out.println("Arrayin elementini:"+names[0]);
}catch(ArrayIndexOutOfBoundsException e){
System.out.println("Arrayin olmayan elementine muraciet etmek olmaz.");
}
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
/*Check->compile time exception->Handle/Declare olunmasi teleb olunur.
Unchecked->Runtime exception->Handle/Declare elemek teleb olunmur.
Exception-->RuntimeException-->sub classlari runtime/unchecked exception.
Exception-->sub classlari checked/compile time exception adlnir.
Unchecked exception___->
int a=5,b=0;
int c=a/b;-Burda runtime-de compile olur.
Checked exception___->
File file=new File("C:/tes/exmp.text");
try{
InputStream i=new FileInputStream(file);
}catch(FileNotFoundException e){
}-Burda Compile time exceptions olur.
*/