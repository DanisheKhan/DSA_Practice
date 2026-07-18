import java.util.*;

public class A01_Hashmap {
  public static void main(String[] args) {

    // ! A HashMap stores key-value pairs, where each key is unique and maps to
    // exactly one value. It's the backbone data structure behind HashSet itself.
    // !hashmap are unordered , it doesnot follow the order.

    // ! Hashmap Decleration
    HashMap<String, Integer> hm = new HashMap<>();

    // add operation put();
    hm.put("danish", 1);
    hm.put("khan", 2);
    hm.put("naeem", 3);
    hm.put("yasmin", 4);

    // ! print
    // System.out.println(hm);

    // ! get the vaule
    // System.out.println(hm.get("danish"));

    // ! contains the key or value
    // System.out.println(hm.containsKey("a"));
    // System.out.println(hm.containsValue(2));

    // ! remove operation
    // hm.remove("khan");
    // System.out.println(hm);

    // ! size
    // System.out.println(hm.size());

    // ! isEmpty
    // System.out.println(hm.isEmpty());

    // ! clear
    // hm.clear();
    // System.out.println(hm);

    // ! iteration of hashmap
    Set<String> keys = hm.keySet();
    System.out.println(keys);

    for (String key : keys) {
      System.out.println("Key = "+key+", and Value = "+ hm.get(key));
    }
  }

}