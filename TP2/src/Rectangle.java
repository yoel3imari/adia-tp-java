public class Rectangle
{
    private Point hg;
    private Point bd;

    Rectangle () {
        this(new Point(), new Point());
    }
    Rectangle(Point x, Point y) {
        // creer nouveau objet eviter la reference a x et y
        this.hg = new Point(x);
        this.bd = new Point(y);
    }

    /**
     * pour calculer la surface on doit calculer les dimensions (largeur, longueur) du rectangle
     * on calculant la distance entre ses point
     * puis on fait le calcule
     *
     * @return double
     */
    public double surface() {
        Point second = new Point(bd.x, hg.y);
        Point fourth = new Point(hg.x, bd.y);

        double longeur = Point.distance(hg, fourth);
        double largeur = Point.distance(hg, second);

        return longeur * largeur;
    }

    /**
     * pour zoomer, on ajout/soustrait deltaX et deltaY de X et Y
     * à fin de élargir la surface du rectangle
     *
     * @param deltaX
     * @param deltaY
     */
    public void zoom (int deltaX, int deltaY) {
        hg.x -= deltaX;
        hg.y += deltaY;

        bd.x += deltaX;
        bd.y -= deltaY;
    }

    public void afficher() {
        System.out.println("Rectangle: ["+ hg.toString() + "," + bd.toString() +"]");
    }

    public Point getBd() {
        return bd;
    }

    public Point getHg() {
        return hg;
    }

    public void setBd(Point bd) {
        this.bd = bd;
    }

    public void setHg(Point hg) {
        this.hg = hg;
    }

}
