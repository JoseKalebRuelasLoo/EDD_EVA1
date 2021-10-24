/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose kaleb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iVal = Integer.MAX_VALUE; //Demostracion del tamaño int (32 Bits = 4 Bytes)
        System.out.println("Valor más grande: " + iVal);
        iVal += 1;  //overflow ---> Stackoverflow
        System.out.println("Valor más pequeño: " + iVal);
        iVal = Integer.MIN_VALUE;
        System.out.println("Valor más pequeño: " + iVal);

        for (int i = 0; i < 10; i++) {
            String mensaje = "Hola mundo ";
            System.out.println(mensaje + i);
        }
        System.out.println(mensaje + i); //Demostracion de lalcanzce de las variables 

    }

}
