package Test.inheritance;

class DerivedEntity extends BaseEntity{
DerivedEntity(int n, String s){
super (n, s);
}
DerivedEntity(){
super.num = 200;
super.str = "Hello from subclass constructor";
}
@Override
public void printNumber(){
System.out.println("Number in SubClass: "+num);
}
@Override
public void printString(){
System.out.println("String in SubClass: "+str);
}
public void printDefaultValue(){
System.out.println("Default value of Number: "+ num);
System.out.println("Default value of String: "+ str);
}
@Override
protected void show() {
System.out.println("Show method in SubClass");
}
}