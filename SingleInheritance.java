class Creature {
    void eat() {
        System.out.println("Creature eats food");
    }
}

class Dog extends Creature {
    void speak() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  
        myDog.speak();
    }
}
