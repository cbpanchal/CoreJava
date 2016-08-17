package CastingTest;

import java.util.Date;

/**
 * Created by info on 17-Aug-16.
 */
public class CheckGC {

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total JVM Memory" + rt.totalMemory());

        System.out.println("before Memory" + rt.freeMemory());

        Date d = null;
        for (int i = 0; i < 1000; i++) {
            d = new Date();
            d = null;
        }
        System.out.println("After Memory"+rt.freeMemory());
        rt.gc();
        System.out.println("After gc Memory "+rt.freeMemory());

    }


}
