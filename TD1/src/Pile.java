public class Pile {
  static final int MAX = 8;
  char[] t;
  int top;

  Pile() {
    t = new char[MAX];
    top = -1;
  }

  public void empiler(char c) {
    if (!estPleine()) {
      t[++top] = c;
    } else {
      System.err.println("Pile est pleine");
    }
  }

  public char sommet() {
    if (!estVide()) {
      return t[top];
    } else {
      return '\0';
    }
  }

  public void depiler() {
    if( !estVide() ) {
      t[top] = '\0';
      top--;
    } else {
      System.out.println("Pile est vide!");
    }
  }

  public boolean estVide() {
    return top < 0;
  }

  public boolean estPleine() {
    return top == MAX;
  }

  public static void main(String[] args) {}

}
