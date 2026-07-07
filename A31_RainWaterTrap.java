public class A31_RainWaterTrap {

  public static void TrappingWater(int[] height) {
    int[] maxLeft = new int[height.length];
    int[] maxRight = new int[height.length];
    int sum = 0;

    maxLeft[0] = height[0];
    for (int i = 1; i < height.length; i++) {
      maxLeft[i] = Math.max(maxLeft[i - 1], height[i]);
    }

    maxRight[height.length - 1] = height[height.length - 1];
    for (int i = height.length - 2; i >= 0; i--) {
      maxRight[i] = Math.max(maxRight[i + 1], height[i]);
    }

    for (int i = 0; i < height.length; i++) {
      int min = Math.min(maxLeft[i], maxRight[i]);
      int current = min - height[i];
      sum += current;
    }
    System.out.println(sum);

  }

  public static void main(String[] args) {
    int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
    TrappingWater(height);
  }
}
