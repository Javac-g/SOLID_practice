interface Printer {
    void print(String text);
}

interface Scanner {
    void scan(String document);
}

class SimplePrinter implements Printer {
    public void print(String text) {
        System.out.println("Printing: " + text);
    }
}

class MultiFunctionMachine implements Printer, Scanner {
    public void print(String text) {
        System.out.println("MFP Printing: " + text);
    }

    public void scan(String document) {
        System.out.println("MFP Scanning: " + document);
    }
}

public class ISPExample {
    public static void main(String[] args) {
        Printer printer = new SimplePrinter();
        printer.print("Hello!");

        MultiFunctionMachine mfp = new MultiFunctionMachine();
        mfp.scan("My Doc");
    }
}
