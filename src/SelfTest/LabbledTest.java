package SelfTest;

/**
 * Created by info on 31-Aug-16.
 */
public class LabbledTest {
    public static void main(String[] args) {

        boolean istrue = true;
        outer:
        for (int i = 0; i <= 5; i++) {
            while (istrue) {
                System.out.println("hello");
                continue outer;
            }
            System.out.println("outer while");

        }
        System.out.println("good bye");

    }
}
