public class PraveenPattern {
    public static void main(String[] args) {
        printP();
        System.out.println();
        printR();
        System.out.println();
        printA();
        System.out.println();
        printV();
        System.out.println();
        printE();
        System.out.println();
        printE();
        System.out.println();
        printN();
    }
    public static void printP() {
        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 2) {
                System.out.println("P P P P");
            } else if (i == 1) {
                System.out.println("P     P");
            } else {
                System.out.println("P");
            }
        }
    }
    public static void printR() {
        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 2) {
                System.out.println("R R R R");
            } else if (i == 1) {
                System.out.println("R     R");
            } else {
                System.out.println("R    R".substring(0, 5 - i) + "R");
            }
        }
    }
    public static void printA() {
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                System.out.println("A A A A");
            } else if (i == 2) {
                System.out.println("A A A A");
            } else {
                System.out.println("A     A");
            }
        }
    }
    public static void printV() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("V");
            for (int j = 0; j < 6 - 2 * i - 1; j++) {
                System.out.print(" ");
            }
            if (i != 3) {
                System.out.print("V");
            }
            System.out.println();
        }
    }
    public static void printE() {
        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 2 || i == 4) {
                System.out.println("E E E E E");
            } else {
                System.out.println("E");
            }
        }
    }
    public static void printN() {
        for (int i = 0; i < 5; i++) {
            System.out.print("N");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("N");
        }
    }
}
