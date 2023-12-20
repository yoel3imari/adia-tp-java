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
      System.exit(1);
    }
  }

  public char sommet() {
    if (!estVide()) {
      return t[top];
    } else {
      return '\0';
    }
  }

  public char depiler() {
    if( !estVide() ) {
      char tmp = t[top];
      t[top] = '\0';
      top--;
      return tmp;
    } else {
      return '\0';
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
