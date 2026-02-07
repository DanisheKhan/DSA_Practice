public class A12_DecimalToBinary {
  public static String decimalToBinary(int decimal) {
    if (decimal == 0)
      return "0";
    StringBuilder binary = new StringBuilder();
    while (decimal > 0) {
      binary.insert(0, decimal % 2);
      decimal /= 2;
    }
    return binary.toString();
  }

  public static void main(String[] args) {
    System.out.println(decimalToBinary(10)); // Output: 1010
    System.out.println(decimalToBinary(25)); // Output: 11001
  }
}
