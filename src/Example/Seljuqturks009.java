package Example;
import java.util.Scanner;
public class Seljuqturks009 {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("1-ci eded daxil edin: ");
int a=scanner.nextInt();
System.out.println("2-ci eded daxil edin: ");
int b=scanner.nextInt();
System.out.println("3-cu eded daxil edin: ");
int c=scanner.nextInt();
if(a>b&&b>c){
System.out.println("Ortadaki eded "+b);
}
else if(a>c&&c>b){
System.out.println("Ortadaki eded "+c);
}
else if(b>a&&a>c){
System.out.println("Ortadaki eded "+a);
}
else if(b>c&&c>a){
System.out.println("Ortadaki eded "+c);
}
else if(c>a&&a>b){
System.out.println("Ortada "+b);
}
else if(c>b&&b>a){
System.out.println("Ortada "+b);
}
}
}