public class A29_MaxSubarraySumKadanesAlgorithm {

  public static int MaxSubarraySumKadanes(int[] arr) {
    int maximum = Integer.MIN_VALUE;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      maximum = Math.max(maximum, sum);
      if (sum < 0) {
        sum = 0;
      }
    }
    return maximum;
  }

  public static void main(String[] args) {
    int[] arr = { 5, 4, -1, 7, 8 };
    System.out.println(MaxSubarraySumKadanes(arr));
  }
}
