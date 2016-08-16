package IntializationBlock;


class Alpha {
    static String s = "";

    protected Alpha() {
        s += "alpha";
    }
}

class subAlpha extends Alpha {
    private subAlpha() {
        s += "subAplpha";
    }
}


class Testinf2 extends Alpha {
    private Testinf2() {
        s += "tesubf2";
    }
    static public void main(String args[]) {
        new Testinf2();
        System.out.println(s);

    }
}



