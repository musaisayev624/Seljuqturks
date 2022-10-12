package Task;
import java.util.Scanner;
public class Ghilman01 {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Her hansi eded daxil edin:");
int a=scanner.nextInt();
int b=0;
for(int i=1;i<=a;i++){
if(a%i==0){
b++;
}
}
if(b==2){
System.out.println(a+" ededi sadedir.");
}else{
System.out.println(a+" ededi murekkebdir.");
}
}    
}
