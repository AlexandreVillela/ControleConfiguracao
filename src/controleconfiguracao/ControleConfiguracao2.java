package controleconfiguracao;

import java.util.Scanner;

/**
 *
 * @author alexandre
 */
public class ControleConfiguracao2 {
    public static void main  (String [] args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite o Primeiro numero Inteiro: ");
        double a = input.nextDouble ();
        
        System.out.println("Digite o Segundo numero Inteiro: ");
        double b = input.nextDouble();
        
        System.out.println("Digite o Terceiro numero Inteiro: ");
        double c = input.nextDouble();
        
        double AltA = ((2*a+b/2));
        double AltB = Math.pow (a,3)+c;
        double AltC = Math.pow (c,3);
        
        System.out.println("Alternativa A: "+ AltA);
        System.out.println("Alternativa B: "+ AltB);
        System.out.println("Alternativa C: "+ AltC);
}
}