public class TestVoiture {
    public static void main(String[] args) {
        Voiture myCar = new Voiture(255);
        Voiture myCar2 = new Voiture(80);
        Moteur myMoteur = new Moteur(100);

        System.out.println(myCar.toString());
        System.out.println(myCar2.toString());

        // changerLeMoteur cree just une copie du moteur pour ne pas avoir
        // le meme moteur instance pour diffrents voiture
        myCar.changerLeMoteur(myMoteur);
        myCar2.changerLeMoteur(myMoteur);

        System.out.println(myCar.toString());
        System.out.println(myCar2.toString());

        if( myCar.getMoteur().equals(myCar2.getMoteur()) ) {
            System.out.println("mycar and myacr2 has the same engine >(");
        } else {
            System.out.println("mycar and myacr2 has diffrent engine :-)");
        }
     }
}
