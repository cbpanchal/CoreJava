package Colllections;

/**
 * Created by info on 26-Aug-16.
 */
class Special {
    private StringBuilder sb = new StringBuilder("bob");

    StringBuilder getname() {
        return sb;
    }

    void printName() {

        System.out.println(sb);
    }

}

public class TestSpecial {
    public static void main(String[] args) {
        Special sp = new Special();

        StringBuilder sb2 = sp.getname();

        sb2.append("hii");
        sp.printName();


    }


}

