package Example;
public class Seljuqturks048_01{
private String name; //Classin fieldleri final olduqda baslangic qiymet verilmelidir,set etmek olmur.
private String surname;//Ya da conustuctorda qiymet verilmelidir.
private int age;       //Final int c=1066; olur.
public String getName() {  //Methodlarin fieldleri final olduqda iceriden qiymet deyisdirile bilmez.
return name;               //Method final olduqda onu Override etmek olmur.
}
public void setName(String name) {
this.name = name;
}
public String getSurname() {
return surname;
}
public void setSurname(String surname) {
this.surname = surname;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
public void printInfo(){
System.out.println("Person info");
}
@Override
public String toString(){
return name+" "+surname;
}
}
