

//Calcular o peso ideal
package controleconfiguracao;

import java.util.Scanner;

/**
 *
 * @author alexandre
 */
public class ControleConfiguracao5 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Digite a sua Altura: ");
        double peso = input.nextDouble();
        
        double ideal = (72.7 * peso)-58;
        
        System.out.println("o seu peso ideal é: "+ ideal);
    }
}

