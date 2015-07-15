package Game;

/**
 *
 * @author Anahuel
 */
public class ENTE {

    private CARTA[] jugadas;

    public ENTE() {
        jugadas = new CARTA[11];
        rellena_mesa();
    }

    private void rellena_mesa() {
        for (int i = 0; i < 11; i++) {
            jugadas[i] = null;
        }
    }

    public void pone_carta(CARTA carta) {
        int lugar = 0;
        while (jugadas[lugar] != null) {
            lugar++;
        }
        jugadas[lugar] = carta;
    }

    public int Cuenta_Cartas() {
        int suma = 0;
        int recorrido = 0;
        do {
            suma += jugadas[recorrido].getValor();
            recorrido++;
        } while ((recorrido < 11) && jugadas[recorrido] != null);
        return suma;
    }

    public int Cuenta_opcion() {
        int suma = 0;
        if (jugadas[2] == null) {
            if (jugadas[0].getValor() == 1) {
                suma = 11;
                if ((jugadas[1] != null) && (jugadas[1].getNumero() == 13) && (jugadas[1].getTipo() == jugadas[0].getTipo())) {
                    suma = 21;
                }
            } else if (jugadas[0].getNumero() == 13) {
                if ((jugadas[1] != null) && jugadas[1].getValor() == 1 && (jugadas[1].getTipo() == jugadas[0].getTipo())) {
                    suma = 21;
                }
            }
        }
        return suma;
    }

    public CARTA getJugadas(int x) {
        return jugadas[x];
    }

    public void setJugadas(int lugar, CARTA carta) {
        this.jugadas[lugar] = carta;
    }

}
