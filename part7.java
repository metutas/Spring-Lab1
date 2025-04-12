import java.util.Scanner;

public class part7 {
    public static void main(String[] args){

        double result = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the  Basic Calculator Simulator!");

        while(true) {
            System.out.println("\nmenu:");
            System.out.println("1.Add");
            System.out.println("2.Substract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5.Clear");
            System.out.println("Display result");
            System.out.println("7.Exit");
            System.out.println("\nEnter Your choice: ");

            int choice = scanner.nextInt();

            switch(choice) {
                case 1:                 
                       System.out.println("\nEnter the value to add: ");
                       double addValue =scanner.nextInt();
                       result = add(result , addValue);
                       System.out.println("Result after addition :" + result);

                       break;
                case 2:
                        System.out.print("\nEnter the value to subtract: ");
                        double subtractValue = scanner.nextDouble();
                        result = substract(result, subtractValue);
                        System.out.println("Result after subtraction: " + result);


                        break;
                case 3:
                        System.out.print("\nEnter the value to multiply: ");
                        double multiplyvalue = scanner.nextDouble();
                        result = multiply(result, multiplyvalue);
                        System.out.println("Result after multiplication: " + result);


                        break;
                case 4:
                        System.out.print("\nEnter the value to divide: ");
                        double divideValue = scanner.nextDouble();
                        result = divide(result, divideValue);
                        System.out.println("Result after division: " + result);


                        break;
                case 5:
                        result = clear();
                        System.out.println("Result cleared.");


                        break;
                case 6:
                        displayResult(result);


                        break;
                case 7:
                        System.out.println("\nGoodbye. Thank you for using the Basic Calculator!");
                        
                        scanner.close();
                        return;
                        
            
        }
    }


                
            }

     public static double add(double currentResult , double value ){
        return currentResult + value;


    }

    public static  double substract(double currentResult , double value){
        
        return currentResult - value;


    }

    public static  double multiply(double currentResult , double value){
        return currentResult * value;

    }

    public static double divide(double currentResult , double value){
        if(value == 0){
            System.out.println("Divison by zero ERROR!" + " Result unchanged.");
        }
        return currentResult / value;

    }

    public static double clear(){
        return 0.0;

    }

    public static void displayResult(double result){
        System.out.println("Current result is " + result );

    }



    
}
