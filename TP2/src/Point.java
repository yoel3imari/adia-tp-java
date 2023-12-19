public class Point {
  int x;
  int y;

  Point() {
    //x = 0;
    //y = 0;
    //this(0,0);
    this(0);
  }

  Point (int x) {
    //x = x;
    //y = 0;
    this(x, 0);
  }

  Point(int x, int y) {
    setX(x);
    setY(y);
  }

  // copy constructor
  public Point(Point copy) {
    this.x = copy.x;
    this.y = copy.y;
  }

  public void setX (int x) {
    this.x = x;
  }

  public int getX () {
    return this.x;
  }

  public void setY (int y) {
    this.y = y;
  }

  public int getY () {
    return this.y;
  }

  public void deplacer(int longueur) {
    this.x += longueur;
    this.y += longueur;
  }

  public double distance(Point b) {
    int deltaX = b.x - this.x;
    int deltaY = b.y - this.y;
    int wrapper = deltaX * deltaX + deltaY*deltaY;
    return Math.sqrt(wrapper);
  }

  public static double distance (Point a, Point b) {
    int deltaX = b.x - a.x;
    int deltaY = b.y - a.y;
    int wrapper = deltaX * deltaX + deltaY*deltaY;
    return Math.sqrt(wrapper);
  }
  public void reset() {
    this.x = 0;
    this.y = 0;
  }

  public boolean equals(Point b) {
    return (this.x == b.x) && (this.y == b.y);
  }

  public String toString() {
    return "(" + x + "," + y + ")";
  }

}
