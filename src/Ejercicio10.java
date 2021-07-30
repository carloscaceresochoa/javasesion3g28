
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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String nombre;
        System.out.println("Digite Nombre");
        nombre=teclado.nextLine();
        
         switch(nombre.toLowerCase()){
            case "carlos":
                System.out.println("Escogistes carlos");
            break;
            case "pedro":
                System.out.println("Escogistes Pedro");
            break;
            case "juan":
                System.out.println("Escogistes Juan");
            break;       
            
            default:
                System.out.println("NO escogistes Ninguna Persona");
        }
        
        
    }
    
}
