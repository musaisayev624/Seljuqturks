package Example;
public class Seljuqturks047_01 {
private String name;
private String surname;
private int age;
public Seljuqturks047_01(String name){
System.out.println(name+" "+"Crusader march");
this.name=name;
}
public String getName() {
return name;
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
public String getInfo(){
return name+" "+surname+" "+age;
}
}
