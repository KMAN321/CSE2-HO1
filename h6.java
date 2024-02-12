public class h6 {
// Attributes (instance variables)
private String name;
private int age;

// Constructor (optional)
public h6(String name, int age) {
    this.name = name;
    this.age = age;
}

// Methods
public void introduce() {
    System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
}

public void celebrateBirthday() {
    age++;
    System.out.println("Happy birthday to me! Now I am " + age + " years old.");
}

// Getters and setters (optional)
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

// Main method (optional)
public static void main(String[] args) {
    // Create objects
    h6 h61 = new h6("John Doe", 30);
    h6 h62 = new h6("Jane Smith", 25);

    // Call methods
    h61.introduce();
    h62.celebrateBirthday();
    h62.introduce();

    // Use getters and setters (optional)
    h61.setAge(35);
    System.out.println(h61.getName() + "'s new age is: " + h61.getAge());
}
}