import java.util.List;

/**
 * Clase Simulador (Motor de Simulación)
 * Almacena los parámetros de configuración y contiene la lógica
 * principal para ejecutar la simulación.
 */
public class Simulador {

    // Parámetros de configuración (RF-01 y RF-02)
    private List<Caja> cajas;
    
    // Parámetro de configuración (RF-03)
    private int numClientesTotal;

    // Parámetro de configuración (RF-04)
    private int duracionMaximaMinutos;

    /**
     * Constructor para inicializar el simulador con los parámetros
     * definidos por el usuario.
     */
    public Simulador(List<Caja> cajas, int numClientesTotal, int duracionMaximaMinutos) {
        this.cajas = cajas;
        this.numClientesTotal = numClientesTotal;
        this.duracionMaximaMinutos = duracionMaximaMinutos;
    }

    /**
     * Método principal que inicia la ejecución de la simulación.
     * (Actualmente solo muestra la configuración).
     */
    public void iniciar() {
        System.out.println("Simulador iniciado con la siguiente configuracion:");
        System.out.println("==================================================");
        
        System.out.println("Clientes a simular (RF-03): " + this.numClientesTotal);
        System.out.println("Duracion Maxima (RF-04): " + this.duracionMaximaMinutos + " minutos.");
        
        System.out.println("Configuracion de Cajas (RF-01 y RF-02): " + this.cajas.size() + " en total.");
        for (Caja caja : this.cajas) {
            System.out.println("  -> " + caja.toString());
        }

        System.out.println("\n(Parte 2)");
        
        // TODO: En futuras fases, aquí se implementará:
        // 1. El bucle de tiempo (hasta 'duracionMaximaMinutos').
        // 2. La generación dinámica de clientes (hasta 'numClientesTotal').
        // 3. La lógica de decisión del cliente (elegir cola más corta).
        // 4. El procesamiento de clientes en las cajas (probablemente con hilos).
    }
}