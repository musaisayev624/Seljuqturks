package Task;
import java.util.Scanner;
public class Ghilman14{
public static void main(String[] args) {
String trueEmail="musaisayev331@gmail.com";
String trueShifre="germanyempire";
int mebleg=0;
Scanner scanner=new Scanner(System.in);
System.out.println("Banka Xosh geldiz!\n"
+"Zehmet olmasa hesaba daxil olun...");
System.out.println("Email-i daxil edin:");
String email=scanner.next();
System.out.println("Shifre-ni daxil edin:");
String shifre=scanner.next();
if(email.equals(trueEmail)&&shifre.equals(trueShifre)){
System.out.println("*********************************");
String emeliyyat = "1.Meblegi goruntule\n"
+"2.Mebleg yatir\n"
+"3.Mebleg gotur\n"
+"Çıxış uçun q'ya basın";
System.out.println(emeliyyat);
System.out.println("**********************************");
while(true){
System.out.println("Emeliyyat-i daxil edin:");
String c=scanner.next();
if(c.equals("q")){
System.out.println("Program chixilir...");
break;
}
else if(c.equals("1")){
System.out.println("Yeni mebleg: "+mebleg);    
}
else if(c.equals("2")){
System.out.println("Meblegi daxil edin:");
int tutar=scanner.nextInt();    
mebleg+=tutar;
System.out.println("Yeni mebleginiz: "+mebleg);    
}
else if(c.equals("3")){
System.out.println("Meblegi daxil edin:");    
int tutar=scanner.nextInt();
if ((mebleg-tutar)<0){            
System.out.println("Lazimli mebleginiz yoxdur...");            
}
else {
mebleg-=tutar;           
System.out.println("Yeni mebleginiz: "+mebleg);           
}
}
else
System.out.println("Gecersiz emeliyyat...");    
}
}
else if(email.equals(trueEmail)==false&&shifre.equals(trueShifre)==true){
System.out.println("email yanlishdir."); 
}
else if(shifre.equals(trueShifre)==false&&email.equals(trueEmail)==true){
System.out.println("shifre yanlishdir.");
}
else
System.out.println("Her ikisi yanlishdir."); 
}
}