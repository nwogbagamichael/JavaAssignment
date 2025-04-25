public class MultilevelInheritance {
    public static void main(String[] args) {
        YoungChild child = new YoungChild();
        child.consume();  
        child.speak(); 
        child.cries(); 
    }
}

class Parent {
    void consume() {
        System.out.println("Parent consumes food");
    }
}

class Adult extends Parent {
    void speak() {
        System.out.println("Adult speaks");
    }
}

class YoungChild extends Adult {
    void cries() {
        System.out.println("Young child cries");
    }
}
