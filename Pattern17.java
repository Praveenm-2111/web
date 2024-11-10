public class Pattern17 {
    public static void main(String[] args) {
        byte n = 6; 
        for (byte i = 0; i < 2; i++) { 
            for (byte j = 1; j <= n - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (byte i = 3; i <= n; i++) { 
            for (byte j = 1; j < i; j++) {
                System.out.print(" "); 
            }
            for (byte j = i; j <= n; j++) {
                System.out.print(j + " "); 
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 2; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); 
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " "); 
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
