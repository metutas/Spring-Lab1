public class part6 {
    public static void main(String[] args){
        int n = 6;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }

            if( i == 1 ){
                System.out.print("*");
            }else {
                System.out.print("*");
                for(int j = 1; j <= 2 * (i - 1) - 1; j++){
                    System.out.print(" ");
                }
                if(i > 1){
                System.out.print("*");
                }
            }
            System.out.println();
        }

        for(int  i = n - 1; i >= 1; i--){
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }

            if(i == 1) {
                System.out.print("*");

            } else {
                System.out.print("*");
                for(int j = 1; j <= 2 * (i - 1) - 1; j++){
                    System.out.print(" ");
                }
                if(i > 1){
                    System.out.print("*");
                }

            }
            System.out.println();
        }

        

     

       

    }

}
