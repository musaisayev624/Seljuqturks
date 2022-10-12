package Example;
import java.util.Scanner;
public class Seljuqturks011 {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Her hansi eded daxil edin:");
int x=scanner.nextInt();
System.out.println("Her hansi isare daxil edin:");
String operation=scanner.next();
System.out.println("Her hansi eded daxil edin:");
int y=scanner.nextInt();
System.out.println("-------");
int result;
switch(operation){
case"+":
result=x+y;
System.out.println(x+"+"+y+"="+result);
break;
case"-":
result=x-y;
System.out.println(x+"-"+y+"="+result);
break;
case"*":
result=x*y;
System.out.println(x+"*"+y+"="+result);
break;
case"/":
result=x/y;
System.out.println(x+"/"+y+"="+result);
break;
case"%":
result=x%y;
System.out.println(x+"%"+y+"="+result);
break;
default:

}
}
}