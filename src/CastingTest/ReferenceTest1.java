package CastingTest;

/**
 * Created by info on 17-Aug-16.
 */
public class ReferenceTest1 {

    public static void main(String[] args) {
        int a = 1;
        ReferenceTest1 rt = new ReferenceTest1();

        System.out.println("before change a=" + a);

        rt.modify(a);

        System.out.println("after change a=" + a);
    }

    void modify(int number) {
        number = number + 1;
        System.out.println("Number +" + number);

    }
}
