import java.util.*;

public class A28_MaxSubarraySum {
  public static void MaxSubArray(int[] arr) {
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      int current = 0;
      for (int j = i; j < arr.length; j++) {
        current += arr[j];
        max = Math.max(max, current);
      }
    }

    System.out.println("This is the maximum sum of subarray : " + max);
  }

  public static void main(String[] args) {
    int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    MaxSubArray(arr);
  }
}