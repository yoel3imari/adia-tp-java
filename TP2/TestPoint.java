public class TestPoint {
  
  public static void main (String[] args) {

    /* ----------- partie 2 ----------- */

    Point p = new Point(2,5);
    Point q = new Point();

    q.setX(2);
    q.setY(5);

    System.out.println("p" + p.toString());
    System.out.println("q" + q.toString());

    double distance = p.distance(q);
    System.out.format("distance: %.2f \n", distance);

    // on utilise la method equlas de Point (non pas celle de Object)
    // d'où elle compare seules les attribues
    if( p.equals(q) ) {
      System.out.println("p is equal to q");
    } else {
      System.out.println("p is not equal to q");
    }

    Object a = new Point(2,5);
    Object b = new Point(2,5);

    // il n'ont pas la meme reference donc false
    // a et b sont de type Object alors la methode equals n'est pas overrided
    if( a.equals(b) ) {
      System.out.println("a is equal to b");
    } else {
      System.out.println("a is not equal to b");
    }

  }

}
