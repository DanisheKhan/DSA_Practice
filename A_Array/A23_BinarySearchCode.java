public class A23_BinarySearchCode {
    // Recursive Binary Search implementation
    public static int recursiveBinarySearch(int[] numbers, int key, int start, int end) {
        // Base case
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        // Base case: element found
        if (numbers[mid] == key) {
            return mid;
        }

        // Recursion steps
        if (numbers[mid] < key) {
            return recursiveBinarySearch(numbers, key, mid + 1, end); // Search right half
        } else {
            return recursiveBinarySearch(numbers, key, start, mid - 1); // Search left half
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14};
        int key = 12;

        int index = recursiveBinarySearch(numbers, key, 0, numbers.length - 1);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Index of key " + key + " (Recursive) is: " + index);
        }
    }
}
