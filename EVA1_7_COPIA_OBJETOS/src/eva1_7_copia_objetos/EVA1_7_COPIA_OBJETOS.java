/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_7_copia_objetos;

/**
 *
 * @author jose kaleb
 */
public class EVA1_7_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba objl = new Prueba();
        System.out.println(objl);
        Prueba obj2 = objl;
        System.out.println(obj2);
        System.out.println("valor de la x = " + objl.x);
        obj2.x++;
        System.out.println("valor de la x = " + objl.x);
    }

}

class Prueba {

    int x = 10;
}
