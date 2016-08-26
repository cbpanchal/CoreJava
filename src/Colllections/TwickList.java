package Colllections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by info on 26-Aug-16.
 */
public class TwickList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("z");
        list.add("x");
        list.add(1, "y");
        list.add(0, "w");

        System.out.println(list);

        list.clear();
        list.add("b");
        list.add("a");
        list.add("c");

        System.out.println(list);
        System.out.println(list.contains("a") + "" + list.contains("x"));
        System.out.println("get 1" + list.get(1));
        System.out.println("index of c" + list.indexOf("c"));
        list.remove(1);

        System.out.println("size " + list.size() + "contents:" + list);


    }
}
