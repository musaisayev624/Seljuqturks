package Example;
import java.util.Scanner;
public class Seljuqturks058_05 {
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("Program started");
try{
add(12,0);
}catch(Exception e){
System.out.println("Sifir bolmek olmaz.");
e.printStackTrace();//Kodun partladigi yeri gosterir.
}
}
private static void add(int a,int b){
int c=a/b;
System.out.println("Result:"+c);
}
}
