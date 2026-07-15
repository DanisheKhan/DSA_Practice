public class A19_SpaceAndTimeComplexity {
    public static void main(String[] args) {
        /*
         * --- SPACE & TIME COMPLEXITY OF ARRAYS ---
         *
         * Time Complexity of standard Array operations:
         * 1. Access / Lookup: O(1)
         *    Since arrays are stored in contiguous memory, the address of any element is:
         *    Address = BaseAddress + index * sizeOfDataType.
         *
         * 2. Insert / Add element:
         *    - At the end: O(1) [if array has space]
         *    - At the start / middle: O(N) [needs shifting of elements]
         *
         * 3. Delete element:
         *    - From the end: O(1)
         *    - From the start / middle: O(N) [needs shifting of elements]
         *
         * 4. Search:
         *    - Linear Search (unsorted): O(N)
         *    - Binary Search (sorted): O(log N)
         *
         * Space Complexity:
         * - Array creation takes O(N) space to store N elements.
         */

        System.out.println("--- Space & Time Complexity for Array Operations ---");
        System.out.println("Accessing elements by index: O(1) Time");
        System.out.println("Searching (Linear Search): O(N) Time");
        System.out.println("Searching (Binary Search): O(log N) Time");
        System.out.println("Inserting/Deleting (At start or middle): O(N) Time");
    }
}
