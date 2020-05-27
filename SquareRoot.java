public class SquareRoot {

    // A function to calculate the square root of any number

    public static int FindSquareRoot(int userInput) {
        // Assigning a value to the input
       Double __getRoot = Math.sqrt(userInput);
    //    Printing Output to screen
       System.out.println("The Square Root of " + userInput + " is "+ __getRoot);

       return 0;
    }
    // Invoking the Default Function (Main function)

    public static void main (String[] args){
// Insert any number you wanna find the Square in place of 25
        FindSquareRoot(2);
    }
    
    
}
