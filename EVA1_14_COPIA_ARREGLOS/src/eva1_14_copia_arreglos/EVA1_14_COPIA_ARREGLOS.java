/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_copia_arreglos;

/**
 *
 * @author jose kaleb
 */
public class EVA1_14_COPIA_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] iArreglo = new int[3];
        System.out.println("Direccion de iArreglo = " + iArreglo);
        iArreglo[0] = 1000;
        iArreglo[1] = 2000;
        iArreglo[2] = 3000;
        //iArreglo[3] = 3; error: ArrayIndexOutOfBounds ---> nos pasamos de los limites del arreglo
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("Cuenta " + i + " = $" + iArreglo[i]);
        }
        //Quiero una copia de los datos del arreglo
        int[] icopia = new int[3]; //¿Esto Esta bien para crear una copia del arreglo?
        System.out.println("Direccion de icopia = " + icopia);
        for (int i = 0; i < iArreglo.length; i++) {
            icopia[i] = iArreglo[i];
        }
        icopia[0] = 1000000;
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("Cuenta (original) " + i + " = $" + iArreglo[i]);
        }
        for (int i = 0; i < icopia.length; i++) {
            System.out.println("Cuenta (copia) " + i + " = $" + icopia[i]);
        }
    }

}
