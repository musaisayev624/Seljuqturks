package Example;
public class Seljuqturks048_03 {//Super class final olduqda extends etmek olmur
private String name;
private String surname;
private int age;
public Seljuqturks048_03(String name, String surname, int age) {
this();             //this();Eyni class daxilinde conustructorlarin bir-birini cagirmasidir.
this.name=name;       //super();Sub class daxilinde super class conustructorlarin cagirmasidir,
this.surname=surname;  //conustructorun daxilinde ve ilk setirine isleyir.
this.age=age;         
}
static String message;
public String getName() {
return name;
}
public String getSurname() {
return surname;
}
public int getAge() {
return age;
}
public void printInfo(){ //
System.out.println("person info");
}
@Override
public String toString(){//Methodlar field olanda sub class override ede bilmir,superde nece var ele qalir.
return name+" "+surname+" "+age;
}
public Seljuqturks048_03() {
System.out.println("East Roman empire");
}
void test(){
System.out.println("Western Roman empire");
test1();
}
void test1(){
System.out.println(name);
System.out.println(message);
}
}