public class A24_ReverseAnArray {
    // In-place reversal using two-pointer approach
    public static void reverse(int[] numbers) {
        int first = 0;
        int last = numbers.length - 1;

        while (first < last) {
            // Swap elements
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            // Move pointers
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};

        System.out.print("Original array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        reverse(numbers);

        System.out.print("Reversed array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
