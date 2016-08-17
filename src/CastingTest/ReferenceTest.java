package CastingTest;

import java.awt.*;

/**
 * Created by info on 17-Aug-16.
 */
public class ReferenceTest {
    public static void main(String[] args) {
        Dimension d = new Dimension(5, 20);

        ReferenceTest rt = new ReferenceTest();
        System.out.println("before modify() d.height:" + d.height);
        rt.modify(d);
        System.out.println("after modify() d.height:" + d.height);

    }

    void modify(Dimension dim) {
        dim.height = dim.height + 1;
        System.out.println("dim :-"+dim.height);

    }
}
