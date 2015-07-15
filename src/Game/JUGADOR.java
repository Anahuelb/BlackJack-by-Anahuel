package Game;

/**
 *
 * @author Anahuel
 */
public class JUGADOR extends ENTE {

    @Override
    public void pone_carta(CARTA carta) {
        int lugar = 0;
        while (getJugadas(lugar) != null) {
            lugar++;
        }
        setJugadas(lugar, carta);
    }

}
