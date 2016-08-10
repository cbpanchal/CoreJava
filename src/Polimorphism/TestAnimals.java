package Polimorphism;


public class TestAnimals {
    public static void main(String [] argc) {
        Animal a = new Animal();
        Animal b = new Horse();
        a.eat();
        b.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Animal eating");
    }
}

class Horse extends Animal {
    void eat() {
        System.out.println("Horse eating");
    }

}



