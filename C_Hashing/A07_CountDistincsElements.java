import java.util.HashSet;

public class A07_CountDistincsElements {
  public static int CountDistincsElements(int[] numbers) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < numbers.length; i++) {
      set.add(numbers[i]);
    }
    int size = set.size();

    return size;
  }

  public static void main(String[] args) {
    int[] numbers = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
    System.out.println(CountDistincsElements(numbers));
  }
}
