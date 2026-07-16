public class S07_StringBuilder {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("DanishKhan");

    // add to end
    sb.append("NaeemKhan");
    System.out.println(sb);

    //reverse
    sb.reverse();
    System.out.println(sb);

    //read char index at
    sb.charAt(4);
    System.out.println(sb);

    //length
    int n=sb.length();
    System.out.println(n);

    //convert to String
    sb.toString();
    System.out.println(sb);


    //delete
    sb.deleteCharAt(2);
    
  }

}
