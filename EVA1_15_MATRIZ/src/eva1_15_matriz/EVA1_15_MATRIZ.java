/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_matriz;

/**
 *
 * @author jose kaleb
 */
public class EVA1_15_MATRIZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //crear un arreglo de dos dimenciones 5 filas * 3 columnas (puros enteros)
        int iMatriz[][] = new int[5][3];
        //Acceder a un elemento 
        iMatriz[0][0] = 1000; //Primera posicion
        iMatriz[4][2] = 2000; //Ultima posicion
        System.out.println("TAMAÑO DEL ARREGLO: " + iMatriz.length);
        //ciclos x cada dimencion
        //ciclos anidados (ciclo dentro de otro ciclo)
        for (int i = 0; i < iMatriz.length; i++) {//Filas iMatriz.length
            for (int j = 0; j < 3; j++) {//Columnas
                iMatriz[i][j] = 1000;
            }
        }
        for (int i = 0; i < iMatriz.length; i++) {//Filas iMatriz.length
            for (int j = 0; j < 3; j++) {//Columnas
                System.out.print("[" + iMatriz[i][j] + "]");
            }
            System.out.println("");
        }

    }

}
