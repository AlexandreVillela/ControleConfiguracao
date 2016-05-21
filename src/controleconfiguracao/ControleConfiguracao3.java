
package controleconfiguracao;

import java.util.Scanner;

/**
 *
 * @author alexandre
 */
public class ControleConfiguracao3 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Digite a primeira Nota: ");
        double a = input.nextDouble ();
        
        System.out.println("Digite a Segunda Nota: ");
        double b = input.nextDouble ();
        
        System.out.println("Digite a Terceira Nota: ");
        double c = input.nextDouble ();
        
        System.out.println ("Digite a Quarta Nota: ");
        double d = input.nextDouble ();
        
        double media = (a+b+c+d) /4;
        
        System.out.println ("A média Final é: " +media);
        
        
    }
    
}