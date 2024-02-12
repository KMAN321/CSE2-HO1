import java.util.*;
public class h3 {
    public static void main(String[] args) {
    	// Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);
        // Present a menu of options to the user
        System.out.println ("[1] For loop");
        System.out.println ("[2] While loop");
        System.out.println ("[3] Exit");
        // Read the user's choice
        int a = in.nextInt();
        // Execute the appropriate code based on the user's choice
        if (a == 1){
        	// For loop demonstration
        	System.out.println ("This is for loop");
        	System.out.print ("Enter number of loops: ");
        	int b = in.nextInt();
        	// Execute the for loop the specified number of times
        	for (int i = 1; i<b; i++) {
        		System.out.println ("For loop #" + i);
			}
			System.out.println ("End of For loop");
        }
        else if (a == 2){
        	// While loop demonstration
        	System.out.println ("This is while loop");
        	int c = 10;
        	// Execute the while loop until countdown reaches 0
        	while (c>0) {
        		System.out.println ("Countdown: " + c);
        		c--;
			}
			System.out.println ("End of While loop");
			in.close();
        }
    }
}
