public class A16_ArraysCreation {
    public static void main(String[] args) {
        // Ways to create an array in Java:

        // 1. Defining size: datatype[] arrayName = new datatype[size];
        int[] marks = new int[50];

        // 2. Creating and initializing: datatype[] arrayName = {value1, value2, ...};
        int[] numbers = {1, 2, 3, 4, 5};
        String[] fruits = {"apple", "mango", "orange"};

        // Printing values to verify
        System.out.println("Length of marks array: " + marks.length);
        System.out.println("First number: " + numbers[0]);
        System.out.println("Second fruit: " + fruits[1]);
    }
}
