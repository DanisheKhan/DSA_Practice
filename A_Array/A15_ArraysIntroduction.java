public class A15_ArraysIntroduction {
    public static void main(String[] args) {
        // Introduction to Arrays in Java
        // An array is a list of elements of the same type placed in contiguous memory locations.
        
        System.out.println("--- Introduction to Arrays in Java ---");
        System.out.println("1. Contiguous Memory: Elements are stored side-by-side in memory.");
        System.out.println("2. Homogeneous Data: Only elements of the same data type can be stored.");
        System.out.println("3. Static Size: The size of an array cannot be changed dynamically once defined.");
        
        // Basic syntax:
        // dataType[] arrayName = new dataType[size];
        int[] marks = new int[50];
        System.out.println("Example Array created with length: " + marks.length);
    }
}
