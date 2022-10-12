package Example;
public class Seljuqturks056_03 extends Seljuqturks056_05 implements Seljuqturks056_02,Seljuqturks056_04{
@Override
public int sum(int a, int b) {
return a+b;
}
@Override
public int substr(int a, int b) {
return a-b;
}
@Override
public int multiply(int a, int b) {
return a*b;
}
@Override
public int divide(int a, int b) {
return a/b;
}
@Override
public double sin(double x) {
return Math.sin(x);
}
@Override
public void test() {
}
@Override
public void Hello(){
Seljuqturks056_02.super.Hello();
//Seljuqturks056_04.super.Hello(); Ikisinden birin ve ya ikisinde yazmaq olar.
}
}
/*Her hansi class Interface-in sub class-i olacaqsa o class extends yox,implements olur.
Interface-de abstract methodlarin qarsisina public yazsanda olar,yazmasanda.
Interface-in class-dan ferqi bir nece parents-i olur.
*/