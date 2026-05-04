import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Classe abstracta que representa un compte bancari.
 */
public abstract class CompteBancari {
    protected String numeroCompte;
    protected LocalDate dataObertura;
    protected double saldo;
    protected double tipusInteres;
    protected ArrayList<Client> clients;

    /**
     * Constructor de CompteBancari.
     *
     * @param numeroCompte Número del compte
     * @param dataObertura Data d'obertura
     * @param saldo        Saldo inicial
     * @param tipusInteres Tipus d'interès
     */
    public CompteBancari(String numeroCompte, LocalDate dataObertura, double saldo, double tipusInteres) {
        this.numeroCompte = numeroCompte;
        this.dataObertura = dataObertura;
        this.saldo = saldo;
        this.tipusInteres = tipusInteres;
        this.clients = new ArrayList<>();
    }

    /**
     * Afegeix un client titular al compte.
     *
     * @param client Client titular
     */
    public void afegirClient(Client client) {
        clients.add(client);
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }
}