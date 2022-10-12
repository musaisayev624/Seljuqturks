package Task;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Ghilman19 {
public static void main(String[] args){
try(Scanner scanner = new Scanner(new FileReader("Great Seljuk empire.txt"))){
while(scanner.hasNextLine()){
System.out.println(scanner.nextLine());
}
}catch (FileNotFoundException ex) {    
Logger.getLogger(Ghilman19.class.getName()).log(Level.SEVERE, null, ex);
}    
}
}
