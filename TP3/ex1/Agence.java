import java.util.Arrays;
import java.util.LinkedList;

public class Agence {
    public final static int MAX_COMPTE_NBR = 10;
    public final static int MAX_CLIENT_NBR = 100;

    /**
     * to increment ID (code/numero)
     */
    private static int agIndex = 0;

    /**
     * track number of accounts added
     */
    private static int countCompte = 0;

    /**
     * track number of clients added
     */
    private static int countClient = 0;

    private String numero;
    private String adresse;
    private Client[] lesClients = new Client[MAX_CLIENT_NBR];
    private Compte[] lesComptes = new Compte[MAX_COMPTE_NBR];

    Agence(String adresse) {
        numero = getClass().getName() + ":" + newAgenceIndex();
        this.adresse = adresse;
    }

    Agence() {
        this("");
    }

    public Compte getCompte(int index) {
        if( index >= countCompte && index < 0 ) return null;
        return this.lesComptes[index];
    }

    public Client getClient(int index) {
        if( index >= countClient && index < 0 ) return null;
        return this.lesClients[index];
    }

    public void addCompte(Compte compte) {
        if (countCompte < MAX_COMPTE_NBR) {
            this.lesComptes[countCompte] = compte;
            countCompte += 1;
        }
    }

    public void addClient(Client client) {
        if (countClient < MAX_CLIENT_NBR) {
            this.lesClients[countClient] = client;
            for (int i=0; i < client.getNbComptes(); i++) {
                this.addCompte(client.getMesCompte(i));
            }
            countClient += 1;
        };
    }

    public int getNbClients() {
        return countClient ;
    }

    public int getNbComptes() {
        return countCompte;
    }

    @Override
    public String toString() {
        return "Agence{\n" +
                "- numero='" + numero + '\'' + '\n' +
                "- adresse='" + adresse + '\'' + '\n' +
                "- nbComptes=" + countCompte + '\'' + '\n' +
                "- nbClients=" + countClient + '\'' + '\n' +
                "}";
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    private String newAgenceIndex() {
        Agence.agIndex += 1;
        return String.valueOf(agIndex);
    }
}
