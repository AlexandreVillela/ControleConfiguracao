/*
 * Converter C° em F°
 */
package controleconfiguracao;

import java.util.Scanner;

/**
 *
 * @author alexandre
 */
public class ControleConfiguracao6 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite a temperatura em Farenheit: ");
        double Faren = input.nextDouble ();
        
        double Celcius= (5*(Faren-32)/9);
        
        System.out.println("O valor em Celcius é: "+Celcius);
        
    }
    
}
