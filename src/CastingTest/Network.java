package CastingTest;

/**
 * Created by info on 17-Aug-16.
 */
public class Network {
    int id;
    Network p;

    Network(int x, Network n) {
        id = x;
        p = this;
        if (n != null)
            p = n;
    }

    void go(Network n1) {
        Network n2 = new Network(2, n1);
        Network n3 = new Network(3, n1);
        System.out.println(n3.p.toString());

    }

    public static void main(String[] args) {
        Network n1 = new Network(1, null);
        n1.go(n1);
    }

}
