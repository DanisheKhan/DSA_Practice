import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class A05_HashSet {
  public static void main(String[] args) {
    // No duplicates , it is unordered , Null values are allowed

    HashSet<String> hs = new HashSet<>();

    hs.add("danish");
    hs.add("yasmin");
    hs.add("umar");
    hs.add("danish");
    hs.add("ahtesham");
    hs.add("ali");
    System.out.println(hs);

    // System.out.println(hs.contains("danish"));

    // hs.remove("umar");
    // System.out.println(hs);

    // System.out.println(hs.isEmpty());

    // System.out.println(hs.size());

    // for (String key : hs) {
    //   System.out.println(key);
    // }

    // Iterator it=hs.iterator();
    // while (it.hasNext()) {
    //   System.out.println(it.next());
    // }

    // Set<Integer> a = new HashSet<>(List.of(1, 2, 3));
    // Set<Integer> b = new HashSet<>(List.of(2, 3, 4));

    // a.addAll(b); // union → a becomes {1,2,3,4}
    // a.retainAll(b); // intersection → a becomes {2,3}
    // a.removeAll(b); // difference → a becomes {1}

    // hs.clear();
    // System.out.println(hs);

  }
}
