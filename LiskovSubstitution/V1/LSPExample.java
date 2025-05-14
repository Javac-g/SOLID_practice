class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}

class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow flies");
    }
}

// Should not be like that
class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly!");
    }
}

public class LSPExample {
    public static void main(String[] args) {
        Bird b = new Sparrow(); // подставили подкласс — всё работает
        b.fly();
    }
}
