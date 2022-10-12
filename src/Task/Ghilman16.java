package Task;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ghilman16{
    public static void main(String[] args) {
        
        try(FileWriter writer1 = new FileWriter("Great Seljuk sultans.txt")){
           Scanner scanner = new Scanner(System.in);
           String dil;
           
           while (true) {
               
               System.out.println("Sultanı daxil edin:");
               dil = scanner.nextLine();
               
              
               
               if (dil.equals("-1")) {
                   System.out.println("Programdan Çıkılıyor...");
                   System.out.println("Dosyayı Kontrol Edin...");
                   break;
               }
               writer1.write(dil + "\n");
               
               
           }
            
           
        } catch (IOException ex) {
            System.out.println("Dosya oluşturulurken hata oluştu....");

        }
    }
}
