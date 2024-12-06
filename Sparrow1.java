interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Sparrow1 implements Animal, Bird {
    public void eat() {
        System.out.println("Sparrow is eating");
    }

    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.eat();
        sparrow.fly();
    }
}
