public class part1 {
    public static void main (String[] args){
        //Part 1
        int n = 6;
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n-i ; j++ ){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i -1; k++){
                System.out.print("*");

            }

            System.out.println();
            
        }

        
        
        


        
        
        
    



 }

    
}