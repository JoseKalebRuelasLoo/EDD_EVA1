/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16.arreglo_de_arreglos;

/**
 *
 * @author jose kaleb
 */
public class EVA1_16_ARREGLO_DE_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarar un arreglo de dos dimenciones
        int iMatriz[][] = new int[3][3];
        System.out.println("Direccion de la matri: " + iMatriz);
        System.out.println("Tamaño de la primera dimencion: " + iMatriz.length);
        for (int i = 0; i < iMatriz.length; i++) {//Filas 
            System.out.println("iMatriz[" + i + "] = " + iMatriz[i]);
        }
    }
}
