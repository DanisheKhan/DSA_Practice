import java.util.Iterator;
import java.util.LinkedHashSet;

public class A06_LinkedHashSet {
  public static void main(String[] args) {
    // LinkedHashSet maintains insertion order, contains unique elements, and allows null values.

    // 1. Declaration
    LinkedHashSet<String> lhs = new LinkedHashSet<>();

    // 2. Add elements: add(element)
    lhs.add("danish");
    lhs.add("yasmin");
    lhs.add("umar");
    lhs.add("danish"); // Duplicate element (will be ignored)
    lhs.add("ahtesham");
    lhs.add("ali");

    // Display set (Insertion order is preserved)
    System.out.println("LinkedHashSet: " + lhs);

    // 3. Check existence: contains(element)
    System.out.println("Contains 'danish': " + lhs.contains("danish"));

    // 4. Remove element: remove(element)
    lhs.remove("umar");
    System.out.println("After removing 'umar': " + lhs);

    // 5. Check size: size()
    System.out.println("Size of LinkedHashSet: " + lhs.size());

    // 6. Check if empty: isEmpty()
    System.out.println("Is LinkedHashSet empty? " + lhs.isEmpty());

    // 7. Iteration using Enhanced For Loop
    System.out.println("\nIterating using for-each loop:");
    for (String name : lhs) {
      System.out.println(name);
    }

    // 8. Iteration using Iterator
    System.out.println("\nIterating using Iterator:");
    Iterator<String> it = lhs.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }

    // 9. Clear all elements: clear()
    lhs.clear();
    System.out.println("\nAfter clear(): " + lhs);
  }
}

