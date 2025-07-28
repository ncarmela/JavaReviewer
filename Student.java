public class Student {
    String name;

    // Constructor with 'this'
    public Student(String name) {
        this.name = name; // 'this.name' refers to the object's variable
    }

    public static void main(String[] args) {
        Student s1 = new Student("Nina");
        Student s2 = new Student("Marco");

        System.out.println(s1.name); // Output: Nina
        System.out.println(s2.name); // Output: Marco
    }
}


// public class Student {
//     // Fields / Attributes
//     String name;
//     int age;
//     double grade;

//     // Constructor
//     public Student(String name, int age, double grade) {
//         this.name = name;
//         this.age = age;
//         this.grade = grade;
//     }

//     // Method to display student info
//     public void displayInfo() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Grade: " + grade);
//         System.out.println();
//     }

//     // Main method to create and use Student objects
//     public static void main(String[] args) {
//         // Create student objects
//         Student s1 = new Student("Nina", 20, 92.5);
//         Student s2 = new Student("Marco", 21, 88.3);

//         // Call method to display info
//         s1.displayInfo();
//         s2.displayInfo();
//     }
// }

