import java.util.Scanner;

public class S01_String {
  public static void PrintChar(String str) {
    for (int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i));
    }
  };
  
  public static void PrintCharTwo(String str) {
    for(char n : str.toCharArray()){
      System.out.print(n);
    }
  };

  public static void main(String[] args) {
    // Strings are immutable belive it or not.

    // char[] first = { 'a', 'b' };
    // String one = "danish";
    // String two = new String("danish");

    // Scanner sc = new Scanner(System.in);
    // String name;
    // name = sc.nextLine();
    // System.out.println(name);

    // String myName="Danish Khan";
    // System.out.println(myName.length());

    // Contatenation
    String firstName = "Danish ";
    String lastName = "Khan";
    String fullName = firstName + lastName;
    System.out.println(fullName);

    // access the char
    System.out.println(fullName.charAt(7));
    PrintChar(fullName);
    PrintCharTwo(fullName);

  }
}
