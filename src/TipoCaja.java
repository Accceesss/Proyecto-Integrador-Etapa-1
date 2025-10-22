/**
 * Enumeración para definir los tipos de caja permitidos (RF-02).
 * Usar un enum nos da "type safety" (tipado seguro) y evita
 * errores al comparar strings como "Rapida" vs "Rápida".
 */
public enum TipoCaja {
    REGULAR,
    RAPIDA 
    // Si la caja rápida tuviera un límite, se podría añadir aquí:
    // RAPIDA(10); 
    // private int limiteArticulos;
    // TipoCaja(int limite) { this.limiteArticulos = limite; }
    // public int getLimite() { return limite; }
}