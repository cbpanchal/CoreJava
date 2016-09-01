package SelfTest;


/**
 * Created by info on 30-Aug-16.
 */
public class SwitchTest {

    public static void main(String[] args) {
        String s = "abcd";

        switch (s.length()) {
            case 1:
                System.out.println("length is 1");
                break;

            case 2:
                System.out.println("length is 2");
                break;
            case 3:
                System.out.println("length is 3");
                break;
            default:
                System.out.println("no match");


        }


    }
}



