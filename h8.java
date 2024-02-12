import java.io.*;

public class h8 {
    public static void main(String[] args) throws IOException {
        // File paths
        String inputFile = "CSE2\\HANDS-ON\\input.txt";
        String outputFile = "CSE2\\HANDS-ON\\output.txt";

        // Read from file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read line: " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found!");
        }

        // Write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("This is a new line written to the file.");
            writer.newLine();
            writer.append("Another line added with append method.");
        } catch (IOException e) {
            System.out.println("Error: Writing to file failed!");
        }
    }
}
