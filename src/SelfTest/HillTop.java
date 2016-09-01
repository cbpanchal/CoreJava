package SelfTest;

public class HillTop {

    public static void main(String[] args) {
        String[] hourse = new String[5];

        hourse[4] = null;

        for (int i = 0; i < hourse.length; i++) {

            if (i < args.length) {
                hourse[i] = args[i];
                System.out.println(hourse[i].toUpperCase() + "");
            }


        }

    }
}