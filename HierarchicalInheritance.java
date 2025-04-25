public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();   
        cat.meow();    

        Snake snake = new Snake();
        snake.eat();   
        snake.hisses();
    }
}

class Animal {
    void eat() {
        System.out.println("The animal is eating");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows");
    }
}

class Snake extends Animal {
    void hisses() {
        System.out.println("The snake hisses");
    }
}
