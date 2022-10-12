package Example;
public class Seljuqturks057_07 {
public static void main(String[] args) {
Seljuqturks057_05 calsum=new Seljuqturks057_05(){
@Override
public int calculate (int a,int b){
return a+b;
}
};
test(calsum,23,44);
Seljuqturks057_05 calsubstr=new Seljuqturks057_05(){
@Override
public int calculate (int a,int b){
return a-b;
}
};
test(calsubstr,12,3);
}
public static void test(Seljuqturks057_05 m,int a,int b){
System.out.println(m.calculate(a,b));
}
}

