package Task;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Ghilman17 {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Toplama islemi icin + vurun:\n"
                  +"Cixma islemi icin - vurun:\n"
                  +"Vurma islemi icin * vurun:\n"
                  +"Bolme islemi icin / vurun:\n"
                  +"Qaliq islemi icin % vurun:");
System.out.println("Birinci ededi daxil edin:");
int firstValue=scanner.nextInt();
System.out.println("Emeliyyati daxil edin:");
String operation=scanner.next();
System.out.println("Ikinci ededi daxil edin:");
int secondValue=scanner.nextInt();
try(FileWriter writer = new FileWriter("gilhman17.txt")){
writer.write("Birinci eded:"+firstValue+"\n"
            +"Ikinci eded:"+secondValue+"\n"
            +"Emeliyyat:"+operation+"\n");
if(operation.equals("+")){
writer.write(firstValue+"+"+secondValue+"="+(firstValue+secondValue));    
}else if(operation.equals("-")){
writer.write(firstValue+"-"+secondValue+"="+(firstValue-secondValue));     
}else if(operation.equals("*")){
writer.write(firstValue+"*"+secondValue+"="+(firstValue*secondValue));   
}else if(operation.equals("/")){
writer.write(firstValue+"/"+secondValue+"="+(firstValue/secondValue));   
}else if(operation.equals("%")){
writer.write(firstValue+"%"+secondValue+"="+(firstValue%secondValue));     
}else{
writer.write("Duzgun emeliyyat daxil edin...");
}   
}catch (IOException ex){
Logger.getLogger(Ghilman17.class.getName()).log(Level.SEVERE, null, ex);
}
}
}
