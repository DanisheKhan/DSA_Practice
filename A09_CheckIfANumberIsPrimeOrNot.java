import java.lang.Math;

public class A09_CheckIfANumberIsPrimeOrNot {
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

  public static void main(String[] args) {
    System.out.println(Prime(8));
  }
}
