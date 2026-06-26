public class A22_BinarySearch {
    // Iterative Binary Search implementation
    public static int binarySearch(int[] numbers, int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Prevents potential integer overflow

            // Comparison
            if (numbers[mid] == key) {
                return mid; // Key found
            }
            if (numbers[mid] < key) {
                start = mid + 1; // Search in right half
            } else {
                end = mid - 1; // Search in left half
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        // Binary search requires a sorted array
        int[] numbers = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        int index = binarySearch(numbers, key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Index of key " + key + " is: " + index);
        }
    }
}
