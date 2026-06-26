public class A20_LinearSearch {
    public static int linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i; // Key found, return index
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Key " + key + " not found in the array.");
        } else {
            System.out.println("Key " + key + " found at index: " + index);
        }
    }
}
