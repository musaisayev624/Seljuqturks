package Task;
import java.util.Scanner;
public class Ghilman08 {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Her Hansi eded daxil edin:");
int qeder=scanner.nextInt();
int count=0;
int count1=0;
for(int i=1;i<=qeder;i++){
if(i%3==0||i%5==0){
count++;
}
else if(i%3==0&&i%5==0){
count1++;
}
}
int countSum=count+count1;
System.out.println("1--"+qeder+" salut="+countSum);       
}  
}