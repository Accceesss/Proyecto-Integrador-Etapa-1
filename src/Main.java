import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- CONFIGURACION DEL SIMULADOR DE SUPERMERCADO ---");

        System.out.print("RF-01: Introduce el numero total de cajas: ");
        int numCajas = scanner.nextInt();

        List<Caja> cajasConfiguradas = new ArrayList<>();
        System.out.println("RF-02: Define el tipo de cada caja (1=REGULAR, 2=RAPIDA):");
        for (int i = 0; i < numCajas; i++) {
            System.out.print("  - Tipo para Caja " + (i + 1) + ": ");
            int tipoInput = scanner.nextInt();
            
            TipoCaja tipo = (tipoInput == 2) ? TipoCaja.RAPIDA : TipoCaja.REGULAR;
            
            // Creamos el objeto Caja y lo añadimos a la lista
            cajasConfiguradas.add(new Caja(i + 1, tipo));
        }

        System.out.print("RF-03: Introduce el numero total de clientes a simular: ");
        int numClientes = scanner.nextInt();

        System.out.print("RF-04: Introduce la duracion maxima (minutos): ");
        int duracionMaxima = scanner.nextInt();

        System.out.println("\n--- CONFIGURACION COMPLETA ---");

        // Creamos la instancia del Simulador con los parámetros recolectados
        Simulador simulador = new Simulador(cajasConfiguradas, numClientes, duracionMaxima);
        
        simulador.iniciar();

        scanner.close();
    }
}
