public class A34_SecondLargestElement {
  public static int SecondLargestElement(int[] elements) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int i = 0; i < elements.length; i++) {
      if (largest < elements[i]) {
        secondLargest = largest;
        largest = elements[i];
      } else if (elements[i] > secondLargest) {
        secondLargest = elements[i];
      }
    }

    return secondLargest;
  }

  public static void main(String[] args) {
    int[] elements = { 1, 24, 33, 45, 66, 77, 70,71 };
    System.out.println(SecondLargestElement(elements));
  }
}
