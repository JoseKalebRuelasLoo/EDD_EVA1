/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose kaleb
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valOiginal = 5;
        System.out.println("ValOriginal en el main = " + valOiginal);
        incrementa(valOiginal);
        //valOiginal = incrementaQueSiFunciona(valOiginal);
        System.out.println("ValOriginal despues de llamar a incrementar = " + valOiginal);

        //demostracion de paso ppor referencia
        Prueba objPrueba = new Prueba();
        System.out.println("Valor de la x= " + objPrueba.x);
        System.out.println("ObjPrueba en el main =  " + objPrueba);
        incrementaObj(objPrueba);
        System.out.println("Valor de la x despues de incrementa = " + objPrueba.x);
    }

    //paso por valor ---> pasamos una copia del valor en una variable (variables locales primitivos)
    public static void incrementa(int val) {
        val++;     //incrementamos en uno val = val + 1; val +=1;
        System.out.println("Valor en Incrementa = " + val);
    }

    public static int incrementaQueSiFunciona(int val) {
        val++;
        return val;
    }

    //paso por referencia ---> pasan la dirreccion en la mamoria del objeto (objetos)
    public static void incrementaObj(Prueba val) {
        System.out.println("Objeto en el incrementaObj =  " + val);
        val.x++;
    }
}

class Prueba {

    public int x = 10;
}
