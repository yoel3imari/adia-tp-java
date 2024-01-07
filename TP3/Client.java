import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Client {
    private static int cltIndex = 0;
    private String code;
    private String nom;
    private String prenom;
    private Agence monAgence;
    private LinkedList<Compte> mesComptes = new LinkedList<Compte>();

    Client(
            String nom,
            String prenom,
            Agence monAgence
    ) {
        code = getClass().getName() + ":" + this.newClientIndex();
        this.nom = nom;
        this.prenom = prenom;
        this.monAgence = monAgence;
        /*monAgence.addClient(this);*/
    }


    public Compte getMesCompte(int i) {
        return mesComptes.get(i);
    }

    public void addCompte(Compte c) {

        this.mesComptes.add(c);
    }

    @Override
    public String toString() {
        return "Client{\n" +
                "- code='" + code + '\'' + '\n' +
                "- nom='" + nom + '\'' + '\n' +
                "- prenom='" + prenom + '\'' + '\n' +
                "- nbr accounts=" + getNbComptes() + "\n" +
                "}";
    }

    public void deposer(int numCompte, double montant) {
    }

    public void retirer(int numCompte, double montant) {
    }

    public int getNbComptes() {
        return mesComptes.size();
    }

    public String getCode() {
        return this.code;
    }

    private String newClientIndex() {
        Client.cltIndex += 1;
        return String.valueOf(cltIndex);
    }
}
