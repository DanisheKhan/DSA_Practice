public class A26_PrintSubarrays {
    // Print all possible subarrays and calculate their sums
    public static void printSubarrays(int[] numbers) {
        int totalSubarrays = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;
                
                System.out.print("[");
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k]);
                    if (k < end) {
                        System.out.print(", ");
                    }
                    sum += numbers[k];
                }
                System.out.print("] (Sum = " + sum + ")\n");
                totalSubarrays++;

                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: " + totalSubarrays);
        System.out.println("Max Subarray Sum: " + max);
        System.out.println("Min Subarray Sum: " + min);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}
