import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        String course;

        System.out.println("Enter Student Name:");
        name = sc.nextLine();

        System.out.println("Enter Age:");
        age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter Course:");
        course = sc.nextLine();

        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}