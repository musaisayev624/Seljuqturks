package Example;
class Seljuqturks047_02 extends Seljuqturks047_01{
private String university; //Seljuqturks04702-cagiran(Veliehd)(Sub),Seljuqturks047_01-cagirilandir(Kral)(Super).
public Seljuqturks047_02(String name){
super(name);
System.out.println("The Crusader marchs in 1101 year");
}
public String getUniversity() {
return university;
}
public void setUniversity(String university) {
this.university = university;
}
public void printInfo(){
String info=getInfo();
System.out.println(info+" "+university);
}
}
