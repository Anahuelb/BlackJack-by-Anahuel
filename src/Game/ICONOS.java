package Game;

import javax.swing.ImageIcon;

/**
 *
 * @author Anahuel
 */
public class ICONOS {
    //ImageIcon t=new ImageIcon(getClass().getResource("/IMG/icon deck_1.png"));// test

    private ImageIcon[][] imagenes;

    public ICONOS() {
        this.imagenes = new ImageIcon[4][13];
        rellena_IMG();
    }

    private void rellena_IMG() {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 14; j++) {
                imagenes[i][j - 1] = new ImageIcon(getClass().getResource("/IMG/" + j + "_" + i + ".png"));// idea pinta 0a3 num 1a13

            }
        }
    }

    public ImageIcon getImagenes(int x, int y) {
        return imagenes[x][y - 1];
    }

}
