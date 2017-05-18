package OOP.Them12.Laba5;

/**
 * Created by Den on 06.03.2017.
 */
public class Main {
    public static void main(String[] args) {
    MyTestClass myTestClass = new MyTestClass();
    MyTestClass.MyStaticNested myStaticNested = new MyTestClass.MyStaticNested();
    myStaticNested.test();
    MyTestClass.MyInner myInner = new MyTestClass.MyInner();
    MyTestClass.MyLocal myLocal = myTestClass.new MyLocal();
    MyTestClass.MyInner gjh = new MyTestClass.MyInner();
    }
}


/*
1. public class OuterClass {
2. //...
3. static class StaticNestedClass {
4. // ...
5. }
6. class InnerClass {
7. // ...
8. }
9. }

OuterClass.StaticNestedClass nestedObject =
new OuterClass.StaticNestedClass();

1. OuterClass outerObject = new OuterClass();
2. OuterClass.InnerClass innerObject =
outerObject.new InnerClass();
 */