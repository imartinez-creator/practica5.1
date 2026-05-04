/**
 * Classe que representa una persona del sistema bancari.
 */
public class Persona {
    protected String dni;
    protected String nom;
    protected String adreca;
    protected String telefon;

    /**
     * Constructor de Persona.
     *
     * @param dni DNI de la persona
     * @param nom Nom de la persona
     * @param adreca Adreça de la persona
     * @param telefon Telèfon de la persona
     */
    public Persona(String dni, String nom, String adreca, String telefon) {
        this.dni = dni;
        this.nom = nom;
        this.adreca = adreca;
        this.telefon = telefon;
    }

    public String getDni() {
        return dni;
    }

    public String getNom() {
        return nom;
    }

    public String getAdreca() {
        return adreca;
    }

    public String getTelefon() {
        return telefon;
    }
}