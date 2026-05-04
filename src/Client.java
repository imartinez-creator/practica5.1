import java.util.ArrayList;

/**
 * Classe que representa un client del banc.
 */
public class Client extends Persona {
    private ArrayList<CompteBancari> comptes;

    /**
     * Constructor de Client.
     *
     * @param dni DNI del client
     * @param nom Nom del client
     * @param adreca Adreça del client
     * @param telefon Telèfon del client
     */
    public Client(String dni, String nom, String adreca, String telefon) {
        super(dni, nom, adreca, telefon);
        this.comptes = new ArrayList<>();
    }

    /**
     * Afegeix un compte bancari al client.
     *
     * @param compte Compte bancari a afegir
     */
    public void afegirCompte(CompteBancari compte) {
        comptes.add(compte);
    }

    public ArrayList<CompteBancari> getComptes() {
        return comptes;
    }
}