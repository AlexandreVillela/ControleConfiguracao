package controleconfiguracao;

import javax.swing.JOptionPane;

/**
 *
 * @author alexandre
 */
public class ValorProdutos {
    public static void main(String[] args){
        int codigoTaxaAumento = 0;
        float valorProduto;
        
        valorProduto= Float.parseFloat(JOptionPane.showInputDialog(null,"R$",
        "Valor do Produto",JOptionPane.QUESTION_MESSAGE));
        
        switch (codigoTaxaAumento){
            case 1: valorProduto = valorProduto + (valorProduto * 10/100);
                    JOptionPane.showMessageDialog(null,"R$ " + valorProduto,"Valor do Produto com taxa de aumento"
                    ,JOptionPane.PLAIN_MESSAGE);
                    break;
            case 3: valorProduto = valorProduto + (valorProduto * 25/100);
            JOptionPane.showMessageDialog(null,"R$ "+ valorProduto,"Valor do produto com taxa de aumento",JOptionPane.
            PLAIN_MESSAGE);
            
            case 4: valorProduto = valorProduto + (valorProduto * 30/100);
            JOptionPane.showMessageDialog(null,"R$ "+ valorProduto,"Valor do produto com taxa de aumento",JOptionPane.
            PLAIN_MESSAGE);
            
            case 5: valorProduto = valorProduto + (valorProduto * 50/100);
            JOptionPane.showMessageDialog(null,"R$ "+ valorProduto,"Valor do produto com taxa de aumento",JOptionPane.
            PLAIN_MESSAGE);
            
            default: JOptionPane.showMessageDialog(null,"Código" + codigoTaxaAumento,"Código de taxa de aumento desconhecido",
            JOptionPane.PLAIN_MESSAGE);
            
            break;
        }
            System.exit(0);
    }
}
