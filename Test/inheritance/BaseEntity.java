package Test.inheritance;

class BaseEntity {
int num;
String str;
BaseEntity(){
num = 100;
str =
"Hello from Superclass constructor";
}
BaseEntity(int num,
String
str){
this.num = num;
this.str = str;
}
public void printNumber(){
this.num = 10;
System.out.println("Number in SuperClass: "+ num);
}
public void printString(){
this.str = "hello";
System.out.println("String in SuperClass: "+ str);
}
private void printDefaultValue(){
System.out.println("Default value of Number:");
System.out.println("Default value of String:"+ str);
}
protected void show(){
System.out.println("This");
}
}