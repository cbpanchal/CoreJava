package SelfTest;

/**
 * Created by info on 31-Aug-16.
 */
public class AgeVerifi {

    public static void main(String[] args) {
        int age = 21;

        outer:

        while (age <= 21) {
            age++;
            if (age == 16) {
                break  outer;
            }
        }
        System.out.println("getur licence");
    }
}
