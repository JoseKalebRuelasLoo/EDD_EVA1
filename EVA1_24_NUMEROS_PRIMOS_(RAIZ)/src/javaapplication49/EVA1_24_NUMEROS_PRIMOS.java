/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication49;

import java.util.Scanner;

/**
 *
 * @author jose kaleb
 */
public class EVA1_24_NUMEROS_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int iVal = input.nextInt();
        double raiz = Math.sqrt(iVal);
        boolean esPrimo = true;
        int iMod;
        for (int i = 2; i < raiz; i++) {
            iMod = iVal % i;
            if (iMod == 0) {//modulo es igual a 0, no es primo, hay que terminar
                esPrimo = false;
                break;//Detiene permanentemente el for
            }
        }
        //Imprimir si es primo o no
        if (esPrimo) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }

}
