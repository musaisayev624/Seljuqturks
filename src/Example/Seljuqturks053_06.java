package Example;
public class Seljuqturks053_06 {
public static void main(String[] args) {
Seljuqturks053_01 seljuqturks053_01;//Static methodlar @Override olmur!
seljuqturks053_01=new Seljuqturks053_01();
seljuqturks053_01.Ottomansultans();
seljuqturks053_01=new Seljuqturks053_02();
seljuqturks053_01.Ottomansultans();
seljuqturks053_01=new Seljuqturks053_03();
seljuqturks053_01.Ottomansultans();
seljuqturks053_01=new Seljuqturks053_04();
seljuqturks053_01.Ottomansultans();
seljuqturks053_01=new Seljuqturks053_05();
seljuqturks053_01.Ottomansultans();
Seljuqturks053_05 seljuqturks053_05=(Seljuqturks053_05)seljuqturks053_01;
seljuqturks053_05.Nextsultan();
/*
((Seljuqturks053_05)seljuqturks053_01).Nextsultan(); Belede mumkundur.
Iki class arsainda varislik elaqesi olarken yalniz casting etmek olur.
*/
/*
Seljuqturks053_01 seljuqturks053_01=null;
seljuqturks053_01.Faith();
Static methodlari cagirarken obyekt yaratmaga ehtiyac yoxdur(Yeni null olur).
*/
}
}
