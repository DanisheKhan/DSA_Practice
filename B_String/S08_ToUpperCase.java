public class S08_ToUpperCase {
  public static String ToUpperCase(String str) {
    StringBuilder sb = new StringBuilder("");

    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == ' ' && i < str.length() - 1) {
        sb.append(' ');
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));
      } else {
        sb.append(str.charAt(i));
      }
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    String sentence = "this is danish khan and i m a developer";
    System.out.println(ToUpperCase(sentence));
  }

}
