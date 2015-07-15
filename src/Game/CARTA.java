package Game;

/**
 *
 * @author Anahuel
 */
public class CARTA {

    private int tipo;//0123
    private int numero;
    //private int modelo;  modelo (x,y) otra clse
    private int valor;

    public CARTA(int tipo, int numero, int valor) {
        this.tipo = tipo;
        this.numero = numero;
        this.valor = valor;
    }

    public int getTipo() {
        return tipo;
    }

    public int getNumero() {
        return numero;
    }

    public int getValor() {
        return valor;
    }

}
