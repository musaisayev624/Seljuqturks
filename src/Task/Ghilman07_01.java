package Task;
class Ghilman07_01 {
int a;
int b;
String c;
void operation(){
if(c=="+"){
System.out.println(a+c+b+"="+a+b);
}
else if(c=="-"){
System.out.println(a+c+b+"="+(a-b));
}
else if(c=="*"){
System.out.println(a+c+b+"="+a*b);
}
else if(c=="/"){
System.out.println(a+c+b+"="+a/b);
}
else if(c=="%"){
System.out.println(a+c+b+"="+a%b);
}else{
System.out.println("Zehmet olmasa duzgun emeliyyat qeyd edin!");       
}
}
}
