interface Keyboard {
    String readInput();
}

class USBKeyboard implements Keyboard {
    public String readInput() {
        return "User typed on USB keyboard";
    }
}

class Computer {
    private final Keyboard keyboard;

    public Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void useKeyboard() {
        System.out.println(keyboard.readInput());
    }
}

public class DIPExample {
    public static void main(String[] args) {
        Keyboard kb = new USBKeyboard();       // Низкоуровневый модуль
        Computer pc = new Computer(kb);        // Высокоуровневый модуль зависит от интерфейса
        pc.useKeyboard();
    }
}
