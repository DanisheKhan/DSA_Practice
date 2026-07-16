public class S06_largestString {
  public static void main(String[] args) {
    String[] arr = { "apple", "mango", "banana" };

    String largest = arr[0];
    for (int i = 0; i<arr.length; i++) {
      if (largest.compareTo(arr[i]) < 0) {
        largest = arr[i];
      }
    }

    System.out.println(largest);
  }
}
