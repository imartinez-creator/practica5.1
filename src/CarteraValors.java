import java.util.ArrayList;

/**
 * Classe que representa una cartera de valors.
 */
public class CarteraValors {
    private ArrayList<Valor> valors;

    /**
     * Constructor de CarteraValors.
     */
    public CarteraValors() {
        this.valors = new ArrayList<>();
    }

    /**
     * Afegeix un valor a la cartera.
     *
     * @param valor Valor a afegir
     */
    public void afegirValor(Valor valor) {
        valors.add(valor);
    }
}