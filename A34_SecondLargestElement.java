public class A34_SecondLargestElement {
  public static int getSecondLargest(int[] elements) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int i = 0; i < elements.length; i++) {
      if (elements[i] > largest) {
        secondLargest = largest;
        largest = elements[i];
      } else if (elements[i] > secondLargest && elements[i] != largest) {
        secondLargest = elements[i];
      }
    }

    return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
  }

  public static void main(String[] args) {
    int[] elements = { 10, 5, 10 };
    System.out.println(getSecondLargest(elements));
  }
}
