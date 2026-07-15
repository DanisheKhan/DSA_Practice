import java.util.*;

public class A10_PrimesInRange {
  public static boolean Prime(int value) {
    if (value < 2)
      return false;
    for (int i = 2; i <= Math.sqrt(value); i++) {
      if (value % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static int PrimeInRange(int start, int end) {
    for (; start < end; start++) {
      if (Prime(start) == true) {
        System.out.print(start + " ");
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    PrimeInRange(2, 10);
  }
}