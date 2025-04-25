public class MultipleInheritance {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        ShowHost host = new ShowHost();

        host.startSing(sparrow);
        host.startFly(sparrow);
    }
}

interface Singer {
    void sing();
}

interface Flyer {
    void fly();
}

class Sparrow implements Singer, Flyer {
    public void sing() {
        System.out.println("Sparrow sings melodiously");
    }

    public void fly() {
        System.out.println("Sparrow soars gracefully");
    }
}

class ShowHost {
    void startSing(Singer singer) {
        singer.sing();
    }

    void startFly(Flyer flier) {
        flier.fly();
    }
}
