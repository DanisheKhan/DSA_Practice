public class A33_LargestElement {
  public static int largestElement(int[] nums) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (largest < nums[i]) {
        largest = nums[i];
      }
    }
    return largest;
  }

  public static void main(String[] args) {
    int[] elements = { 1, 5, 7, 22, 6, 77, 7, 22 };
    System.out.println(largestElement(elements));
  }
}
