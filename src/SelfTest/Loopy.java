package SelfTest;

/**
 * Created by info on 01-Sep-16.
 */
public class Loopy {

    public static void main(String[] args) {
        int x[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int y = 0, z = 0; z < x.length; z++) {
            System.out.println(y = x[z]);

        }
    }
}
