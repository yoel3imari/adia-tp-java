import java.util.Scanner;
import Pile;
public class TestPile {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a text: ");
    String input = scan.nextLine();
    String reversed = reverseString(input);
    System.out.println("Reversed string: " + reversed);
    scan.close();
  }

  private static String reverseString(String original) {

    Pile pile = new Pile();

    StringBuilder reversed = new StringBuilder();
    for (int i = original.length() - 1; i >= 0; i--) {
      reversed.append(original.charAt(i));
    }
    return reversed.toString();
  }

}
