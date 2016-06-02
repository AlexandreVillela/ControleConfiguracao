
package controleconfiguracao;

import javax.swing.JOptionPane;

/**
 *
 * @author alexandre
 */
public class CalculoSalario {
    public static void main(String[] args){
    int quantidadeFuncionarios = 0;
    float salarioFuncionario = 0;
    float totalSalarios = 0;
    float mediaSalarial = 0;
    int contadora = 0;
    
    quantidadeFuncionarios = Integer.parseInt(JOptionPane.showInputDialog(null,
    "Digite a Quantidade de Funcionarios","Numero de Funcionarios",JOptionPane.QUESTION_MESSAGE));
    
    while (contadora < quantidadeFuncionarios){
    contadora++;
    salarioFuncionario = Float.parseFloat(JOptionPane.showInputDialog(null,
    "Digite o salário do Funcionario","Salário",JOptionPane.QUESTION_MESSAGE));
    totalSalarios = totalSalarios + salarioFuncionario;
}
    mediaSalarial = totalSalarios / quantidadeFuncionarios;
    System.out.println("Media Salarial= "+ mediaSalarial);
    System.exit(0);
}
}
