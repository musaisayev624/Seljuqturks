package Task;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Ghilman18 {
public static void main(String[] args){
try(Scanner scanner = new Scanner(new FileReader("ogrenciler.txt"))){
while (scanner.hasNextLine()) {               
String ogrenci_bilgisi = scanner.nextLine();               
String[] array = ogrenci_bilgisi.split(",");               
if (array[1].equals("Bilgisayar Mühendisliği")) {
System.out.println("Öğrenci Bilgisi: " + ogrenci_bilgisi);  
}    
}   
}catch (FileNotFoundException ex) {
Logger.getLogger(Ghilman18.class.getName()).log(Level.SEVERE, null, ex);
}
}
}
