package SelfTest;

/**
 * Created by info on 26-Aug-16.
 */
public class Theory {

    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = s1;
        s1 += "d";
        System.out.println(s1 + " " + s2 + " " + (s1 == s2));//imutable..

        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = sb1;
        sb1.append("d");

        System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));//mutable..
    }
}
