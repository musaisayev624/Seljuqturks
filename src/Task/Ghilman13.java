package Task;
import java.util.Scanner;
public class Ghilman13 {
public static void main(String[] args){
int count1=0,count2=0,count3=0,count4=0,m,b,c,d;    
Scanner scanner=new Scanner(System.in);
System.out.print("Zehmet olmasa olcunu daxil edin:");
int size=scanner.nextInt();
int[] a=new int[size];
for(int i=0;i<a.length;i++){
System.out.print("a["+i+"]=");
a[i]=scanner.nextInt();
}
System.out.println("Arrayin elementleri:");
for(int i=0;i<a.length;i++){
if(a[i]%2==0&&a[i]!=0){
count1++;
}
if(a[i]%2==1&&a[i]!=5){
count2++;
}
if(a[i]==0){
count3++;
}
if(a[i]==5){
count4++;
}
System.out.println(a[i]);
}
m=1*count1;
b=3*count2;
c=0*count3;
d=5*count4;        
System.out.println("Cut eded sayi="+count1+",Xal deyeri="+m);
System.out.println("Tek eded sayi="+count2+",Xal deyeri="+b);
System.out.println("Sifirlarin sayi="+count3+",Xal deyeri="+c);
System.out.println("Beslerin sayi="+count4+",Xal deyeri="+d);
System.out.println("Toplam xal="+(m+b+c+d));
}
}