
import java.util.HashMap;

public class A04_ValidAnagram {
  public static boolean IsAnagram(String one, String two) {
    if (one.length() != two.length()) {
      return false;
    }
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < one.length(); i++) {
      map.put(one.charAt(i), map.getOrDefault(one.charAt(i), 0) + 1);
    }

    for (int i = 0; i < two.length(); i++) {
      if (map.get(two.charAt(i)) != null) {
        if (map.get(two.charAt(i)) == 1) {
          map.remove(two.charAt(i));
        } else {
          map.put(two.charAt(i), map.get(two.charAt(i)) - 1);
        }
      } else {
        return false;
      }
    }

    return map.isEmpty();
  }

  public static void main(String[] args) {
    String one = "danish";
    String two = "shinad";
    System.out.println(IsAnagram(one, two));
  }
}
