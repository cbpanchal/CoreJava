package Constructors;

class Parent {
    String str;

    Parent() {

        System.out.println("parent default");
    }

    Parent(String s) {
        this();
        this.str = s;
        System.out.println("parent argument" + str);
    }

}

class ChildParentTest extends Parent {
    String Str;

    ChildParentTest() {

        System.out.println("Child default");
    }

    ChildParentTest(String st) {
        super();
        this.Str = st;
        System.out.println("child argument" + Str);
    }

    static public void main(String[] args) {

        //   ChildParentTest c = new ChildParentTest();
        //  ChildParentTest cp=new Parent();
        //  Parent p=new Parent();
        Parent obj = new ChildParentTest("i am child");

    }
}
