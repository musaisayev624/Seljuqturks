package Example;
class Seljuqturks052_02 {
public static void main(String[] args) {
Seljuqturks052_01 i=new Seljuqturks052_01();
i.ad="Musa";
i.soyad="Isayev";
i.yas=18;
System.out.println(i.ad+" "+i.soyad);
i.danismaq();
String info=i.getInformation();
System.out.println(info);
Seljuqturks052_01 r=new Seljuqturks052_01();
r.ad="Sultan";
r.soyad="Alp Arslan";
r.yas=50;
r.danismaq();
System.out.println(r.getInformation());
}
}