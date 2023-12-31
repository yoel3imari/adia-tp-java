import java.util.Scanner;

public class TestPile {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Inverser une chaîne de charactères
    System.out.println("Entrer une phrase qui fini par # > ");
    String input = scan.nextLine();
    String result = reverseString(input);
    System.out.println("Resultat: " + result);

    // valider les parenthèses
    System.out.println("Entrer une phrase qui fini par # > ");
    String input2 = scan.nextLine();
    valideParentheses(input2);

    scan.close();
  }

  public static String reverseString(String input) {
    Pile pile = new Pile();
    for (char c : input.toCharArray()) {
      if (c != '#') {
        pile.empiler(c);
      } else {
        break;
      }
    }
    StringBuilder result = new StringBuilder();
    while (!pile.estVide()) {
      result.append(pile.depiler());
    }

    return result.toString();
  }

  public static void valideParentheses(String input) {
    Pile p = new Pile();
    boolean isvalid = true;
    for (char elm : input.toCharArray()) {
      if (elm == '#') {
        break;
      }
      if (elm == '(') {
        p.empiler(elm);
      } else if (elm == ')') {
        if (p.estVide()) {
          isvalid = false;
          break;
        } else {
          p.depiler();
        }
      }
    }
    if (isvalid && p.estVide()) {
      System.out.println("bien parenthésée.");
    } else {
      System.out.println("il y a plus de parenthèses ouvrantes que de parenthèses fermantes.");
    }
  }

}
