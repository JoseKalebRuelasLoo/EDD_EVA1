/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_heap;

/**
 *
 * @author jose kaleb
 */
public class EVA1_4_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiClase obj = new MiClase();
        System.out.println(obj.getmensaje());
        System.out.println(obj);
        MiClase obj2 = new MiClase();
        System.out.println(obj2);
        EVA1_4_HEAP objHeap = new EVA1_4_HEAP();
        System.out.println(objHeap);
    }

}

class MiClase { //Nuevo tipo de dato ---> tipos de datos abstractos

    private String mensaje; //Atributos--->Estado del objeto

    public MiClase() {//Metodos --> comportamiento 
        mensaje = "Hola mundo";
    }

    //getter /setter
    public String getmensaje() {
        return mensaje;
    }

    public void setmensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
