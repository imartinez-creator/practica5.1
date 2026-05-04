/**
 * Classe que representa un empleat del banc.
 */
public class Empleat extends Persona {
    private Sucursal sucursal;

    /**
     * Constructor d'Empleat.
     *
     * @param dni      DNI de l'empleat
     * @param nom      Nom de l'empleat
     * @param adreca   Adreça de l'empleat
     * @param telefon  Telèfon de l'empleat
     * @param sucursal Sucursal on treballa
     */
    public Empleat(String dni, String nom, String adreca, String telefon, Sucursal sucursal) {
        super(dni, nom, adreca, telefon);
        this.sucursal = sucursal;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }
}