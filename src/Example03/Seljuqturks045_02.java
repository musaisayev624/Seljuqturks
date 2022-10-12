package Example03;
public class Seljuqturks045_02 {
private String name;
private String surname;
private int age;
public void setName(String name){
boolean illegal=false;
for(int i=0;i<name.length();i++){
if(!Character.isLetter(name.charAt(i))){
illegal=true;
}
}
if(illegal){
System.out.println("Ad ancaq herflerden olur.");
}{
this.name=name;
}
}
public String getName(){
return name;
}
public void setSurname(String surname){
this.surname=surname;
}
public String getSurname(){
return surname;
}
public void setAge(int age){
this.age=age;
}
public int getAge(){
return age;
}
}