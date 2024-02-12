public class h4 {
        
    public h4() {
    }
    /**
     * This method prints "Method 1" to the console.
     */
    static void m1(){
    	
    	System.out.println ("Method 1");
    }
    /**
     * This method takes two integer arguments and returns their sum.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of a and b.
     */
    static int m2(int a,int b){
    	
    	int sum = a+b;
    	return sum;
    }
    
    public static void main(String[] args) {
    	// Call method m1() to print "Method 1"
        m1();
        // Call method m2(65, 7) to calculate the sum of 65 and 7, and print the result
        System.out.println (m2(65,7));
        
    }
}
