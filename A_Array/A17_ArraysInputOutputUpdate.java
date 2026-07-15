import java.util.Scanner;

public class A17_ArraysInputOutputUpdate {
    public static void main(String[] args) {
        int[] marks = new int[100];
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Please enter marks for Physics, Chemistry, and Math:");
        marks[0] = sc.nextInt(); // physics
        marks[1] = sc.nextInt(); // chemistry
        marks[2] = sc.nextInt(); // math

        // Output
        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Math: " + marks[2]);

        // Update
        marks[2] = 100; // Update Math mark to 100
        System.out.println("Updated Math: " + marks[2]);

        // Percentage
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}
