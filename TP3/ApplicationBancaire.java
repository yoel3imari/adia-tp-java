import java.util.HashMap;
import java.util.Map;

public class ApplicationBancaire {

    public static void main(String[] args) {
        Agence ag = new Agence();
        Client[] clients = new Client[4];

        /*Client 1 et son compte*/
        Client cl1 = new Client("cl1", "cl1", ag);
        Compte cm1 = new CompteEpargne(ag, cl1, 1000);
        cl1.addCompte(cm1);

        /*Client 2 et son compte*/
        Client cl2 = new Client("cl2", "cl2", ag);
        Compte cm2 = new ComptePayant(ag, cl2, 2500);
        cl2.addCompte(cm2);

        /*Client 3 et son compte*/
        Client cl3 = new Client("cl3", "cl3", ag);
        Compte cm31 = new ComptePayant(ag, cl3, 0);
        Compte cm32 = new ComptePayant(ag, cl3, 3000);
        cl3.addCompte(cm31);
        cl3.addCompte(cm32);

        /*Client 4 et son compte*/
        Client cl4 = new Client("cl4", "cl4", ag);
        Compte cm41 = new CompteEpargne(ag, cl4, 2300);
        Compte cm42 = new ComptePayant(ag, cl4, 0);
        cl4.addCompte(cm41);
        cl4.addCompte(cm42);

        cl1.getMesCompte(0).deposer(1000);
        cl2.getMesCompte(0).retirer(500);
        cl3.getMesCompte(1).deposer(5000);

        clients[0] = cl1;
        clients[1] = cl2;
        clients[2] = cl3;
        clients[3] = cl4;

        for (int i=0; i<clients.length; i++) {
            ag.addClient(clients[i]);
        }

        /*
        * Liste des différents clients avec leurs différents comptes
        *
        * */
        for (int i=0; i < clients.length; i++) {
            System.out.println("----------- client "+ i +" -----------");
            System.out.println(clients[i].toString());
            for (int j=0; j < clients[i].getNbComptes(); j++) {
                System.out.println(clients[i].getMesCompte(j).toString());
            }
        }

        /*
        * Liste des comptes d’épargne de l’agence.
        *
        * */
        for (int i=0; i<ag.getNbComptes(); i++) {
            if( ag.getCompte(i) instanceof CompteEpargne ) {
                System.out.println(ag.getCompte(i).toString());
            }
        }

        /*
        * Liste des comptes payants de l’agence.
        *
        * */
        for (int i=0; i<ag.getNbComptes(); i++) {
            if( ag.getCompte(i) instanceof ComptePayant ) {
                System.out.println(ag.getCompte(i).toString());
            }
        }

        /*
        *Le solde total des comptes d’un client.
        * */
        double count = 0;
        for (int i=0; i<cl3.getNbComptes(); i++) {
            count += cl3.getMesCompte(i).solde;
        }
        System.out.println("Solde total = " + count);

    }


}
