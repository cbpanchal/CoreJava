package Polimorphism;

class Anm {

    public void eat() throws Exception {
    }
}

class Dog extends Anm {
    public void eat() throws Exception {
    }

    public static void main(String[] argc) {
        Anm a = new Dog();
        Dog b = new Dog();
    }
}