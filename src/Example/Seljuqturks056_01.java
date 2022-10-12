package Example;
public interface Seljuqturks056_01{
int sum(int a,int b); 
default void test(){
System.out.println("Hello interface");
}
private static void Hello(){
System.out.println("Hello!");
}
}
/*Interface olanda methodlari abstract etmeye ehtiyac yoxdur,
cunki methodlar abstractdir.
Interface-de normal methodlar default olur.
Interface-de ancaq static methodlari private etmek olur.
*/