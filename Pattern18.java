public class Pattern18 {
    public static void main(String[] args) {
        byte n = 5;  
        for (byte i = 1; i <= n; i++) {
            for (byte j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (byte j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println(); 
        }
    }
}
