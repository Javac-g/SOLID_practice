interface Discount {
    double apply(double price);
}

class NoDiscount implements Discount {
    public double apply(double price) {
        return price;
    }
}

class ChristmasDiscount implements Discount {
    public double apply(double price) {
        return price * 0.9;
    }
}

class PriceCalculator {
    public double calculate(double basePrice, Discount discount) {
        return discount.apply(basePrice);
    }
}

public class OCPExample {
    public static void main(String[] args) {
        PriceCalculator calc = new PriceCalculator();

        double price1 = calc.calculate(100.0, new NoDiscount());
        double price2 = calc.calculate(100.0, new ChristmasDiscount());

        System.out.println("No Discount: " + price1);
        System.out.println("Christmas Discount: " + price2);
    }
}
