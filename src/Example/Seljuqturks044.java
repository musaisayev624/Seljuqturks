package Example;
import java.util.Scanner;
public class Seljuqturks044 {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Arrayin setirini daxil edin:");
int setr=scanner.nextInt();
System.out.println("Arrayin sutununu daxil edin:");
int sutun=scanner.nextInt();
int a[][]=new int[setr][sutun];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
System.out.print("a["+i+"]["+j+"]=");
a[i][j]=scanner.nextInt();
}
}
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
System.out.println(a[i][j]);
}   
}
}
}