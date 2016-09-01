package SelfTest;

/**
 * Created by info on 01-Sep-16.
 */
public class Wind {

    public static void main(String[] args) {

        foreach:

        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(" " + j);
               if (j == 1 && k == 1) {
                   break foreach;
               }
                if (j == 0 || k == 2) {
                   break ;

                }
            }

        }

    }
}

