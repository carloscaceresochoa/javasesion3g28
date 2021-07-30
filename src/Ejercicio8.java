
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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n=2;
        System.out.println("Digite n");
        n=teclado.nextInt();
        
         switch(n){
            case 1:
                System.out.println("I");
            break;
            case 2:
                System.out.println("II");
            break;
            case 3:
                System.out.println("III");
            break;
            default:
                System.out.println("Opcion Invalida");
        }
        
        
    }
    
}
