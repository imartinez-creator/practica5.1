import java.util.ArrayList;

/**
 * Classe principal que representa el banc.
 */
public class Banc {
    private ArrayList<Client> clients;
    private ArrayList<Empleat> empleats;
    private ArrayList<Sucursal> sucursals;

    /**
     * Constructor de Banc.
     */
    public Banc() {
        this.clients = new ArrayList<>();
        this.empleats = new ArrayList<>();
        this.sucursals = new ArrayList<>();
    }

    public void afegirClient(Client client) {
        clients.add(client);
    }

    public void afegirEmpleat(Empleat empleat) {
        empleats.add(empleat);
    }

    public void afegirSucursal(Sucursal sucursal) {
        sucursals.add(sucursal);
    }
}