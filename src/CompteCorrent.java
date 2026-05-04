import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Classe que representa un compte corrent.
 */
public class CompteCorrent extends CompteBancari {
    private ArrayList<TargetaCredit> targetes;
    private ArrayList<FonsInversio> fonsInversio;
    private ArrayList<CarteraValors> carteresValors;

    /**
     * Constructor de CompteCorrent.
     *
     * @param numeroCompte Número del compte
     * @param dataObertura Data d'obertura
     * @param saldo        Saldo inicial
     * @param tipusInteres Tipus d'interès
     */
    public CompteCorrent(String numeroCompte, LocalDate dataObertura, double saldo, double tipusInteres) {
        super(numeroCompte, dataObertura, saldo, tipusInteres);
        this.targetes = new ArrayList<>();
        this.fonsInversio = new ArrayList<>();
        this.carteresValors = new ArrayList<>();
    }

    public void afegirTargeta(TargetaCredit targeta) {
        targetes.add(targeta);
    }

    public void afegirFonsInversio(FonsInversio fons) {
        fonsInversio.add(fons);
    }

    public void afegirCarteraValors(CarteraValors cartera) {
        carteresValors.add(cartera);
    }
}