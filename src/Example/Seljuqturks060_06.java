package Example;
import java.util.*;
/*
import java.util.HashMap;
import java.util.Map; 
*/import java.util.Set;
public class Seljuqturks060_06 {
public static void main(String[] args) {
Map<String,Integer>map=new HashMap();
map.put("Rusif",29);
map.put("Musa",18);
map.put("Yasin",23);
map.put("Vusale",19);
map.put("Rusif",30);//Eyni element varsa axirincisinin qiymetini goturur.
System.out.println(map.containsKey("Yavuz"));//Elementin orda olub-olmadigin yoxlayir.
System.out.println(map.containsValue(20));//Elementin nomresin orda olub-olmamagin yoxlayir.
System.out.println(map.getOrDefault("Vusale",0));//Key ordadisa nomresin,yoxdusa secileni(0) cap edir.
System.out.println(map.remove("Yasin",23));//Ust uste dusurse silsin.
System.out.println(map.replace("Yasin",19));//Yasinin qiymetin deyisdirir.
System.out.println(map.get("Rusif"));
Set<String>keys=map.keySet();
for(String key:keys){
System.out.println(key+"-->"+map.get(key));
Set<Map.Entry<String,Integer>>entrySet=map.entrySet();//Bu collection-iki elementi
for(Map.Entry entry:map.entrySet()){//bir yerde isletmek ucun  istifade olunur.
System.out.println(entry.getKey()+" "+entry.getValue());
}
}
}
}