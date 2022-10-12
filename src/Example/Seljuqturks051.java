package Example;
public class Seljuqturks051 {
public static void main(String[] args) {
/*int x=5,y=3;
int cem=sum(x,y);
int ferq=substr(x,y);
int multiply=cem*ferq;
multiply(35,25);
*/sadeYoxla(67);
}
static int sum(int a,int b){
int c=a+b;
return c;
}
static int substr(int a,int b){
int c=a-b;
return c;
}
static void multiply(int a,int b){
int cem=sum(a,b);
int ferq=substr(a,b);
int c=cem*ferq;
System.out.println("Hasil:"+c);
}
static void sadeYoxla(int k){
int counter=0;
for(int i=2;i<=Math.sqrt(k);i++){
if(k%i==0){
counter++;
break;
}
}
if(counter==0&&k>1){
System.out.println(k+" Ededi sade ededir.");
}else{
System.out.println(k+" Ededi murekkebdir.");
}
}
}
