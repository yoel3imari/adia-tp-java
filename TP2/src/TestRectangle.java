public class TestRectangle {

    public static void main(String[] args) {
        Point a = new Point(2);
        Point b = new Point(5,6);

        Rectangle r = new Rectangle(a,b);
        r.afficher();
        r.zoom(2,2);
        r.afficher();
    }

}
