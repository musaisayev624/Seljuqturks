package Example;
public class Seljuqturks057_10 {
public static void main(String[] args){
Seljuqturks057_05 cal=(a,b)->a+b;//Lambda expression
calculate((a,b)->a+b,12,3);
calculate((a,b)->a-b,12,3);
calculate((a,b)->a*b,12,3);
calculate((a,b)->a/b,12,3);
calculate((a,b)->a%b,12,3);
}
public static void calculate(Seljuqturks057_05 cal,int a,int b){
cal.calculate(a,b);
}
}
