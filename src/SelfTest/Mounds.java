package SelfTest;

/**
 * Created by info on 26-Aug-16.
 */
public class Mounds {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = new String();

        for (int i = 0; i < 1000; i++) {

            s = " " + i;
            sb.append(s);

            System.out.println(s);

        }
    }
}
