package Example;
public class Seljuqturks030 {
public static void main(String[] args) {
String message1="Sultan Selim";
String message2="SuLtan Selim";         //Herflerin boyuk-kicik olmadan beraberliyini yoxlayir.
boolean b=message1.equalsIgnoreCase(message2);
System.out.println(b);
}
}