
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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * equilatero 3 lados iguales
         * Isosceles 2 lados iguales 1 diferente
         * Escaleno 3 Lados Diferentes
         */
       Scanner teclado = new Scanner(System.in);
       int l1,l2,l3;
       System.out.println("Digite Lado 1");
       l1=teclado.nextInt();
       System.out.println("Digite Lado 2");
       l2=teclado.nextInt();
       System.out.println("Digite Lado 3");
       l3=teclado.nextInt();
       if(l1==l2 && l2==l3){
           System.out.println("Triangulo Equilatero");
       }
       else if(l1!=l2 && l1!=l3 && l2!=l3){
           System.out.println("Triangulo Escaleno");
       }
       else{
           System.out.println("Triangulo Isosceles");
       }
    }
    
}
