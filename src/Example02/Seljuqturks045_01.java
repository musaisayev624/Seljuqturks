package Example02;
public class Seljuqturks045_01 {
public int sum(int a,int b){  //Obyekt Default access olanda eyni packegede isletmek olur.
return a+b;
}                            
private int substr(int a,int b){ //private olanda yalniz ve yalniz eyni class daxilinde cagirmaq olur.
return a-b;
}                               //protected olanda eyni package daxilinde cagirmaq olur.
}                   //Encapsulation-ancaq eyni class cagira bilsin(yeni,fieldler private olur).
