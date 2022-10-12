package Example;
class Seljuqturks046_03 {
String name;
String surname;
int age;
int first;
int second;
String operation;
int i=10;
int qeder;
Seljuqturks046_03(String name,String surname,int age){
this.name=name;
this.surname=surname;
this.age=age;
}
String getInformation(){
String info=name+" "+surname+" "+age;
return info;
}
void test(){
for(this.i=0;i<=100;i++){
System.out.println(i+"=>"+this.i);
}
}
Seljuqturks046_03(String operation,int first,int second){
this.first=first;
this.second=second;
this.operation=operation;
if(operation=="+"){
int sum=first+second;
System.out.println(first+"+"+second+"="+sum);
}
else if(operation=="-"){
int substr=first-second;
System.out.println(first+"-"+second+"="+substr);
}
else if(operation=="*"){
int multiply=first*second;
System.out.println(first+"*"+second+"="+multiply);
}
else if(operation=="/"){
int devide=first/second;
System.out.println(first+"/"+second+"="+devide);
}
else if(operation=="%"){
int qaliq=first%second;
System.out.println(first+"%"+second+"="+qaliq);
}
else if(operation=="**"&&second==0){
int kvadrat=first*first;
System.out.println(first+"*"+first+"="+kvadrat);
}
}
void Salut(int qeder){
this.qeder=qeder;
int count=0;
int count1=0;
for(int i=1;i<=qeder;i++){
if(i%3==0||i%5==0){
count++;
}
else if(i%3==0&&i%5==0){
count1++;
}
}
int countSum=count+count1;
System.out.println("1--"+qeder+" salut="+countSum);
}
}