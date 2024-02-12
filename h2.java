public class h2 {
	
    public h2() {
    }
    
    public static void main(String[] args) {
        // Declare and initialize variables of different data types
        int IntVar = 21;
        String StringVar = "This is a String";
        char CharVar = 'm';
        float FloatVar = 99.9f;
        double DoubleVar = 999999.99d;
        boolean BooleanVar = true;
        // Print the values of the variables
        System.out.println (IntVar);
        System.out.println (StringVar);
        System.out.println (CharVar);
        System.out.println (FloatVar);
        System.out.println (DoubleVar);
        System.out.println (BooleanVar);
        
        System.out.println ();
        // Perform arithmetic operations and string concatenation
        int num1 = 5, num2 = 4, sum, diff;
        sum = num1+num2;
        diff = num1-num2;
        
        System.out.println ("Addition: " + num1 + " + " + num2 + " = " + sum);
        System.out.println ("Subtraction: " + num1 + " - " + num2 + " = " + diff);
        
        String word1 = "Play";
        String word2 = "ground";
        
        System.out.println ("Concatenation: " + word1 + word2);
        
    }
}
