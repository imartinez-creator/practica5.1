/**
 * Classe que representa una sucursal bancària.
 */
public class Sucursal {
    private String identificador;
    private String adreca;

    /**
     * Constructor de Sucursal.
     *
     * @param identificador Identificador de la sucursal
     * @param adreca        Adreça de la sucursal
     */
    public Sucursal(String identificador, String adreca) {
        this.identificador = identificador;
        this.adreca = adreca;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getAdreca() {
        return adreca;
    }
}