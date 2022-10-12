package Example;
public class Seljuqturks020 {
public static void main(String[] args) {
int tekcem=0,cutcem=0;
for(int i=1;i<=100;i++){
if(i%2==0){
tekcem=tekcem+i;
}else{
cutcem+=i;
}
}
System.out.println("Tekcem="+tekcem);
System.out.println("Cutcem="+cutcem);
}
}