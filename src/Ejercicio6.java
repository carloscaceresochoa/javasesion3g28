
import java.text.DecimalFormat;
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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double presupuesto,pgin,pped,ptraum;
        double ggin,gped,gtraum;
        DecimalFormat fm = new DecimalFormat("0000.00");
        System.out.println("Digite el presupuesto");
        presupuesto=teclado.nextDouble();
        pgin=presupuesto*0.3975;
        ptraum=presupuesto*0.3165;
        pped=presupuesto*0.286;
        System.out.println("Presupuesto ginecologia "+fm.format(pgin));
        System.out.println("Presupuesto traumatologia "+fm.format(ptraum));
        System.out.println("Presupuesto Pediatria "+fm.format(pped));
        System.out.println("******************************************");
        System.out.println("Digite el Gasto de Pediatria");
        gped=teclado.nextDouble();
        System.out.println("Digite el Gasto de Ginecologia");
        ggin=teclado.nextDouble();
        System.out.println("Digite el Gasto de Traumatologia");
        gtraum=teclado.nextDouble();
        if(gped<=pped){
            System.out.println("Se administro bien el presupuesto Pediatria");
        }
        else{
            System.out.println("Excedio el Gasto Pediatria");
        }
        if(gtraum<=ptraum){
            System.out.println("Se administro bien el presupuesto Traumatologia");
        }
        else{
            System.out.println("Excedio el Gasto Traumatologia");
        }
        if(ggin<=pgin){
            System.out.println("Se Administro bien el presupuesto de ginecologia");
        }
        else{
            System.out.println("Excedio el Gasto Ginecologia");
        }
        
        
        
    }
    
}
