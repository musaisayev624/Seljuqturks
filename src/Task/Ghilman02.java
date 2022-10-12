package Task;
import java.util.Scanner;
public class Ghilman02 {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
for(int j=1;j<=2;j++){
System.out.println("Birinci ededi daxil edin:");
for(int i=1;i<=2;i++){
int a=scanner.nextInt();
System.out.println("Ikinci ededi daxil edin:");
for(int k=1;k<=2;k++){
int b=scanner.nextInt();
System.out.println("Ucuncu ededi daxil edin:");
for(int m=1;m<=2;m++){
int c=scanner.nextInt();
int sum=a+b+c;
System.out.println("Reqemlerinin cemi:"+sum);
}
}
}
}
}
}