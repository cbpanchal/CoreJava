package OverLoading;

import sun.plugin2.util.SystemUtil;

class Anmil {
}

class Hourse1 extends Anmil {

}


class useAnimals {
    public void doStuff(Anmil a) {
        System.out.println("in the animal version");
    }

    public void doStuff(Hourse1 h) {
        System.out.println("in the hourse1 version");
    }

    static public void main(String[] argc) {
        useAnimals ua = new useAnimals();
        Anmil a = new Anmil();
        Hourse1 h = new Hourse1();
        ua.doStuff(a);
        ua.doStuff(h);
    }
}
