import java.util.*;
public class h5 {
    
    public h5() {
    }
    
    public static void main(String[] args) {
        // Create an ArrayList to store classmate names
        ArrayList<String> classmates = new ArrayList<String>();
        // Add names to the ArrayList
        classmates.add("Franz");
        classmates.add("James");
        classmates.add("Clyde");
        classmates.add("Milky");
        classmates.add("Jessica");
        // Print the ArrayList after adding names
        System.out.println ("Adding");
        System.out.println (classmates);
        // Remove names from the ArrayList
        classmates.remove("Jessica");
        classmates.remove("Clyde");
        // Print the ArrayList after removing names
        System.out.println ("Removing");
        System.out.println (classmates);
        // Change a name in the ArrayList
        classmates.set(0, "Miguel");
        // Print the ArrayList after changing a name
        System.out.println ("Changing");
        System.out.println (classmates);
        
    }
}
