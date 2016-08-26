package Colllections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by info on 26-Aug-16.
 */
public class Cities {

    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<String>();
        c.add("paris");
        c.add("london");
        c.add("malesiya");

        int index = c.indexOf("london");

        System.out.println(c + "" + index);

        c.add(index,"NewYork");

        System.out.println(c);
    }
}
