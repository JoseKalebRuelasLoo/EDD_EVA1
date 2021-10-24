
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jose kaleb
 */
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[][] aiGrupos;
        System.out.println("¿Cuantos grupos son?");
        int iNoGrupos = input.nextInt();
        
        //los grupos representan las filas
        aiGrupos = new int[iNoGrupos][];
        for (int i = 0; i < aiGrupos.length; i++) {
            System.out.println("Para el grupo " + i + " ¿Cuantos estudiantes son?");
            int iNoEstu = input.nextInt();
            aiGrupos[i] = new int[iNoEstu];
        }
        
        //Preguntar edades
        for (int i = 0; i < aiGrupos.length; i++) {//Primera dimencion filas grupos
            for (int j = 0; j < aiGrupos[i].length; j++) {//Segunda dimencion, para cada grupo, cuantos alumnos hay
                System.out.print("["+"]");//print imprime en la misma linea
            }
            System.out.println("");//Print line hace un salto de linea
        }
    }

}
