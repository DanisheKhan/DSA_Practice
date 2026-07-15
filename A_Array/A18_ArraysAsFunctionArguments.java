public class A18_ArraysAsFunctionArguments {
    public static void update(int[] marks, int nonChangeable) {
        nonChangeable = 10; // changes only locally (pass by value)
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1; // changes reflect in the main array (pass by reference)
        }
    }

    public static void main(String[] args) {
        int[] marks = {97, 98, 99};
        int nonChangeable = 5;

        update(marks, nonChangeable);

        System.out.println("Value of nonChangeable after update(): " + nonChangeable);
        System.out.print("Array values after update(): ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
