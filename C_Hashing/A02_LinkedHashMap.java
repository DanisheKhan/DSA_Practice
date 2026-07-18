import java.util.*;

public class A02_LinkedHashMap {
  public static void main(String[] args) {
    // ! remembers insertion order

    LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
    lhm.put("Biryani", 200);
    lhm.put("Pulao", 150);
    lhm.put("GoshtManda", 250);

    System.out.println(lhm);

    System.out.println(lhm.containsKey("Biryani"));

    System.out.println(lhm.get("Biryani"));

    System.out.println(lhm.remove("Pulao"));

    System.out.println(lhm.size());

    System.out.println(lhm.isEmpty());

    Set<String> key = lhm.keySet();

    for (String string : key) {
      System.out.println(string);
    }

  }
}
