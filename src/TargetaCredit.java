import java.time.LocalDate;

/**
 * Classe que representa una targeta de crèdit.
 */
public class TargetaCredit {
    private String tipus;
    private String numero;
    private Client titular;
    private LocalDate dataCaducitat;

    /**
     * Constructor de TargetaCredit.
     *
     * @param tipus         Tipus de targeta
     * @param numero        Número de targeta
     * @param titular       Titular de la targeta
     * @param dataCaducitat Data de caducitat
     */
    public TargetaCredit(String tipus, String numero, Client titular, LocalDate dataCaducitat) {
        this.tipus = tipus;
        this.numero = numero;
        this.titular = titular;
        this.dataCaducitat = dataCaducitat;
    }
}