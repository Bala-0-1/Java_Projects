package Test.inheritance;

public class InheritancePractice {
public static void main(String[] args) {
DerivedEntity derived = new DerivedEntity(50, "hello while instantiating Subclass");
derived. printNumber();
derived.printString();
derived.printDefaultValue();
BaseEntity superObj = new DerivedEntity();
superObj. printNumber();
superObj.printString();
superObj = new BaseEntity();
superObj. printNumber();
superObj. printString();
}
}
