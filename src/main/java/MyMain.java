import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(int n) {
        // m = (n + x/n) / 2
        double x = n;
        double y = n+1; //the previous value of n;
        while(y - x > 0.00001){
          //m = (n + x/n) / 2
          y = x; //previous value
          x = (x + n/x)/2; // calculates the next value using babylonian method
        }
        return x;
    }

    // Calculates the factorial of a number
    public static double factorial(double x) {
        double n = x;
        for(double i = n-1; i>0; i--){
            n = n * (i);
        }
        return n;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    
    public static double calculateE() {
    double e_value = 1; //initiallizes the e_value
    for(int i = 1; i < 100; i++){
        e_value = e_value + 1/(factorial(i));
    }
    return(e_value);
    }
    
    
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive number: ");
        int x = scan.nextInt();
        System.out.println("The square root of " + x + " is: " + babylonian(x));
        System.out.println("The factorial of " + x + " is: " + factorial(x));
        System.out.println("The constant e is approximately equal to " + calculateE());
        


        

        scan.close();
    }
}