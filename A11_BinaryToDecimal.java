import java.util.*;

public class A11_BinaryToDecimal {
  public static void BinaryToDecimal(int BinaryNumber) {
    int power = 0;
    int decimalNumber = 0;
    while (BinaryNumber > 0) {
      int lastDigit = BinaryNumber % 10;
      decimalNumber = decimalNumber + (lastDigit * (int) Math.pow(2, power));
      BinaryNumber = BinaryNumber / 10;
      power++;
    }
    System.out.print(decimalNumber);
  }

  public static void main(String[] args) {
    BinaryToDecimal(1000);
  }
}
