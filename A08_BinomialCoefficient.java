public class A08_BinomialCoefficient {
  public static int factorial(int value) {
    int fact = 1;
    for (int i = 1; i <= value; i++) {
      fact = fact * i;
    }
    return fact;
  }

  public static void main(String[] args) {
    int n = 7;
    int r = 4;
    int binomialCoefficient = factorial(n) / (factorial(r) * (factorial(n - r)));
    System.out.println(binomialCoefficient);
  }
}
