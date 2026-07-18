import java.util.*;

public class A02_LinkedHashMap {
  public static void main(String[] args) {
    // ! remembers insertion order

    LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
    lhm.put("Biryani", 200);
    lhm.put("Pulao", 150);
    lhm.put("GoshtManda", 250);

    System.out.println(lhm);

  }
}
