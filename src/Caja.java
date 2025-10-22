/**
 * Representa una caja individual en el supermercado.
 * Almacena su ID y su tipo (RF-02).
 * En el futuro, esta clase será fundamental: contendrá la cola
 * (Queue<Cliente>) y gestionará al cliente actual.
 */
public class Caja {
    
    private final int id;
    private final TipoCaja tipo;

    public Caja(int id, TipoCaja tipo) {
        this.id = id;
        this.tipo = tipo;
        // this.colaClientes = new LinkedList<>(); // (Para el futuro)
    }

    public int getId() {
        return id;
    }

    public TipoCaja getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Caja #" + id + " [Tipo: " + tipo + "]";
    }
}