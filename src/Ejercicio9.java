
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        char c;
        System.out.println("Digite caracter");
        c=teclado.nextLine().charAt(0);
        
         switch(c){
            case 'a':
                System.out.println("a");
            break;
            case 98:
                System.out.println("b");
            break;
            case 99:
                System.out.println("c");
            break;
            case 'd':
                System.out.println("d");
            break;
            
            default:
                System.out.println("Opcion Invalida");
        }
        
        
    }
    
}
