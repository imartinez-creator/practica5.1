import java.time.LocalDate;

/**
 * Classe que representa un fons d'inversió.
 */
public class FonsInversio {
    private String nom;
    private double importFons;
    private double rendibilitat;
    private LocalDate dataObertura;
    private LocalDate dataVenciment;

    /**
     * Constructor de FonsInversio.
     *
     * @param nom           Nom del fons
     * @param importFons    Import invertit
     * @param rendibilitat  Rendibilitat del fons
     * @param dataObertura  Data d'obertura
     * @param dataVenciment Data de venciment
     */
    public FonsInversio(String nom, double importFons, double rendibilitat,
            LocalDate dataObertura, LocalDate dataVenciment) {
        this.nom = nom;
        this.importFons = importFons;
        this.rendibilitat = rendibilitat;
        this.dataObertura = dataObertura;
        this.dataVenciment = dataVenciment;
    }
}