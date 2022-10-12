package Task;
import java.util.Scanner;
public class Ghilman12 {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Arrayin setirini daxil edin:");
int setr=scanner.nextInt();
System.out.println("Arrayin sutununu daxil edin:");
int sutun=scanner.nextInt();
int a[][]=new int[setr][sutun];
for(int i=0;i<a.length;i++) {
for (int j=0;j<a[i].length;j++) {
System.out.print("a["+i+"]["+j +"]=");
a[i][j]=scanner.nextInt();
}
}
//int sum=0;
int max=a[0][0];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
if(max<a[i][j]);
max=a[i][j];
System.out.println(a[i][j]);
}
}
System.out.println("Massivin komekci dioqanalinin en boyuk elementi:"+max);
}
}