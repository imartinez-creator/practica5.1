import java.time.LocalDate;

/**
 * Classe que representa un compte a termini.
 */
public class CompteTermini extends CompteBancari {
    private int mesosObertura;

    /**
     * Constructor de CompteTermini.
     *
     * @param numeroCompte  Número del compte
     * @param dataObertura  Data d'obertura
     * @param saldo         Saldo inicial
     * @param tipusInteres  Tipus d'interès
     * @param mesosObertura Nombre de mesos que estarà obert
     */
    public CompteTermini(String numeroCompte, LocalDate dataObertura, double saldo, double tipusInteres,
            int mesosObertura) {
        super(numeroCompte, dataObertura, saldo, tipusInteres);
        this.mesosObertura = mesosObertura;
    }

    public int getMesosObertura() {
        return mesosObertura;
    }
}