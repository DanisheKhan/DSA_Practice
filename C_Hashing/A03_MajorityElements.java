import java.util.HashMap;

public class A03_MajorityElements {
  public static int MajorityElemtns(int[] arr) {
    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (hm.containsKey(arr[i])) {
        hm.put(arr[i], hm.get(arr[i]) + 1);
      } else {
        hm.put(arr[i], 1);
      }
    }

    int result = 0;
    for (Integer key : hm.keySet()) {
      if (hm.get(key) > arr.length / 3) {
        result = key;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int numbers[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
    System.out.println(MajorityElemtns(numbers));

  }
}
