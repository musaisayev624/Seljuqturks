package Example;
public class Seljuqturks057_01 {
private String name;
public void Hello(){//Butun Acses modifiers ola biler.
Frank a=new Frank();
a.testFrank();
a.name="asd";
System.out.println("Test class.");
}//Member-Inner class non-static olur.
class Frank{//Member ne olubsa oda o olur.Interface olur.
private String name;
void testFrank(){//Private olanda ancaq bir class daxilinde ola biler.
name="aa";
System.out.println("Frank inner classdir.");
Teutonic();
}//Member-Inner class static olmayan classdir.
void Teutonic(){
System.out.println("Teutonic is German tribes");
}
}//Inner(Frank) final olanda extends etmek olmur.
}//Eyni class-in icinde cagiranda obyekt yaratmaga ehtiyac yoxdur.
//Nestead class-bir classin icinde bir classdir.