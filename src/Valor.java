/**
 * Classe que representa un valor financer dins d'una cartera.
 */
public class Valor {
    private String nomValor;
    private int nombreTitols;
    private double preuCotitzacio;

    /**
     * Constructor de Valor.
     *
     * @param nomValor Nom del valor
     * @param nombreTitols Nombre de títols
     * @param preuCotitzacio Preu de cotització
     */
    public Valor(String nomValor, int nombreTitols, double preuCotitzacio) {
        this.nomValor = nomValor;
        this.nombreTitols = nombreTitols;
        this.preuCotitzacio = preuCotitzacio;
    }
}