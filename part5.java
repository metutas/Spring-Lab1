public class part5 {
    public static void main(String[] args) {
        int n = 6;

        for (int i = n; i >= 1; i--) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            
            if (i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("* "); 
                }
            }else {
                System.out.print("*");
                for (int j = 1; j <= 2 * i - 3; j++) { 
                    System.out.print(" ");
                }
                if (i > 1) { 
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        for (int i = 2; i <= n; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            
            if (i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("* "); 
                }
            }else {
                System.out.print("*");
                for (int j = 1; j <= 2 * i - 3; j++) { 
                    System.out.print(" ");
                }
                if (i > 1) { 
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
