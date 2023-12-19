
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Fighter f1 = new Fighter("Alperen", 10, 120, 100, 30);
        Fighter f2 = new Fighter("Burak", 20, 85, 85, 40);
        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}

