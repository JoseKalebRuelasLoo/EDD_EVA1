/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_23_numeros_primos;

import java.util.Scanner;

/**
 *
 * @author jose kaleb
 */
public class EVA1_23_NUMEROS_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int iVal = input.nextInt();
        boolean esPrimo = true;
        for (int i = 2; i < iVal; i++) {
            /* Divicion: iVal / i --->Divicion
            Modulo --> Calcula el residuo de una divicion
            En Java el modulo es % ---> Num1 % Num2
            7 % 5 = 2 Divicion con residuo diferente a cero
            15 & 3 = 0 Divicion Exacta
             */
            int iMod = iVal % i;
            if (iMod == 0) {//modulo es igual a 0, no es primo, hay que terminar
                esPrimo = false;
                break;//Detiene permanentemente el for
                //Continue; Detiene la iteracion actual
            }
            // Si la divicion es exacta ---> terminamos no es primo
            //si terminamos el for sin dividir exactamente: es primo
        }
        //Imprimir si es primo o no
        if (esPrimo) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }

}
