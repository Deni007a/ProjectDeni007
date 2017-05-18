package OOP.Them12.Laba5;

/**
 * Created by Den on 06.03.2017.
 * 1) Create a new class MyTestClass that has method test(), static nested class MyStaticNested,
 * inner class MyInner and a method with local inner class MyLocal.
 * Make instances of each nested classes. 2) Create class Main with method main()
 * and add code that accesses the nested classes’ members from the outer class.
 * Create code that accesses the outer class’s members from within the nested classes.
 * 3) Execute the program.
 */
public class MyTestClass {

    public MyTestClass() {
        System.out.println(" MyTestClass");
    }

    static   class  MyStaticNested {
        public MyStaticNested() {
            System.out.println(" MyStaticNested ");
        }

        void test(){
          System.out.println("MyStaticNested test");
      };

    }
    static class MyInner {
        public MyInner() {
            System.out.println("MyInner ");
            class Asdfgh {
                public Asdfgh() {
                    System.out.println("MyInner ");
                }

            }


        }

    }
    class MyLocal{
        public MyLocal() {
            System.out.println("MyLocal");
        }
    }


}
