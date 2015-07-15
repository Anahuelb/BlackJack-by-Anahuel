
package Game;

import java.util.Random;



/**
 *
 * @author Anahuel
 */
public class MAZO {
    private CARTA[][] cartas;
    private int num_cartas_Pintas;
    
    public MAZO(int cant_mazos) {
        this.num_cartas_Pintas=cant_mazos*4;
        this.cartas = new CARTA [num_cartas_Pintas][13];
        Rellena_Mazo();
    }
    
    private int Resuelve_Pinta (int numero){//resuelve la pinta de la carta segun su posicion en el array
        int pinta=0;
        for (int i = 0; i < 4; i++) {// pinta del 0 al 3
            for (int j = i; j < num_cartas_Pintas; j=j+4) {
                if (j==numero) {
                    pinta= i;
                }
            }
        }
        return pinta;
    }
    
    private void Rellena_Mazo(){
        
        for (int i = 0; i < num_cartas_Pintas; i++) {//i pinta fila
            for (int j = 1; j < 14; j++) {//j numero columna
                CARTA carta;
                int pinta=Resuelve_Pinta(i);// 0 al 3
                if (j>9) {
                    carta = new CARTA (pinta,j,10);
                }else{
                    carta = new CARTA (pinta,j,j);
                } 
                Inserta_Carta(i,j-1,carta);
            }
        }
    }
    
    private void Inserta_Carta(int pinta_fila,int numero_columna,CARTA carta){//inserta carta en su posicion
        this.cartas[pinta_fila][numero_columna]=carta;
    }
    
    public CARTA Entrega_Carta(){//metodo devuelve random una carta del mazo
        int fila=Azar(0,num_cartas_Pintas-1);
        int columna=Azar(0,12);
        CARTA random;
        if (cartas[fila][columna]!=null) {
            random=cartas[fila][columna];
            cartas[fila][columna]=null;
        }else{
            random=Entrega_Carta();//recursividad en caso de que carta ya fuese entregada
        }
        return random;
    }
    
    private int Azar(int min,int max){
        Random R = new Random();
        int numero_azar= R.nextInt((max-min)+1)+min;//min y max incluidos en el resultado
        //System.out.println(""+numero_azar);
        return numero_azar;
    }
}//end clase mazo
