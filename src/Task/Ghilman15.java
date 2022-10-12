package Task;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Ghilman15 {
public static void main(String[] args) {       
FileOutputStream fos = null;
//File file =  new File("dosya.txt");
try{
fos = new FileOutputStream("Great Seljuk empire.txt",true);           
//byte[] array = {101,75,66,68};
String s ="The Great Seljuk Empire or the Seljuk Empire was a high medieval Turko-Persian Sunni Muslim empire,originating from the Qiniq branch\n"
+"of Oghuz Turks.At the time of its greatest extent, the Seljuk Empire controlled a vast area, stretching from western Anatolia and\n"
+"the Levant in the west to the Hindu Kush in the east, and from Central Asia in the north to the Persian Gulf in the south.\n"
+"The Seljuk empire was founded in 1037 by Tughril (990–1063) and his brother Chaghri (989–1060). From their homelands near the\n"
+"Aral Sea, the Seljuks advanced first into Khorasan and then into mainland Persia, before eventually conquering Baghdad and\n"
+"eastern Anatolia.The Seljuks won the battle of Manzikert in 1071, and then conquered most of the rest of Anatolia wresting it\n"
+"from the Byzantine Empire.The Seljuk empire united the fractured political landscape of the eastern Islamic world and played\n"
+"a key role in both the First Crusade and Second Crusade.The Seljuks also played an important part in the creation and\n"
+"expansion of multiple art forms during the period in whichthey had influence.";
byte[] s_array = s.getBytes();                   
fos.write(s_array);
}catch(FileNotFoundException ex) {
System.out.println("File Not found exception oluştu....");
}catch(IOException ex) {
System.out.println("Dosyaya yazılırken bir hata oluştu...");
}
finally{           
try{
fos.close();
}catch(IOException ex) {
System.out.println("Dosya kapatılırken bir hata oluştu...");
}           
}
}
}
/*
package Task;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Ghilman15 {
public static void main(String[] args) {
try(FileWriter writer = new FileWriter("Great Seljuk empire(1).txt")){
String s ="The Great Seljuk Empire or the Seljuk Empire was a high medieval Turko-Persian Sunni Muslim empire,originating from the Qiniq branch\n"
+"of Oghuz Turks.At the time of its greatest extent, the Seljuk Empire controlled a vast area, stretching from western Anatolia and\n"
+"the Levant in the west to the Hindu Kush in the east, and from Central Asia in the north to the Persian Gulf in the south.\n"
+"The Seljuk empire was founded in 1037 by Tughril (990–1063) and his brother Chaghri (989–1060). From their homelands near the\n"
+"Aral Sea, the Seljuks advanced first into Khorasan and then into mainland Persia, before eventually conquering Baghdad and\n"
+"eastern Anatolia.The Seljuks won the battle of Manzikert in 1071, and then conquered most of the rest of Anatolia wresting it\n"
+"from the Byzantine Empire.The Seljuk empire united the fractured political landscape of the eastern Islamic world and played\n"
+"a key role in both the First Crusade and Second Crusade.The Seljuks also played an important part in the creation and\n"
+"expansion of multiple art forms during the period in whichthey had influence.";
writer.write(s);
}catch (IOException ex){
Logger.getLogger(Ghilman15.class.getName()).log(Level.SEVERE, null, ex);
}
}
}
*/