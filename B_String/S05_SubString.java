public class S05_SubString {
  public static String SubString(String str, int startingIndex, int endingIndex) {
    String substr = "";
    for (int i = startingIndex; i < endingIndex; i++) {
      substr += str.charAt(i);
    }
    return substr;

  }

  public static void main(String[] args) {
    String name = "danishkhan";
    System.out.print(SubString(name, 1, 5));

  }
}
