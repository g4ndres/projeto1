/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetotutorial;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class ProjetoTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String primeiroNumero =
                JOptionPane.showInputDialog("Digite o primeiro numero inteiro");
        
        String segundoNumero =
                JOptionPane.showInputDialog("Digite o segundo numero inteiro");
        
        int numero1 = Integer.parseInt(primeiroNumero);
        int numero2 = Integer.parseInt(segundoNumero);
        
        int soma = numero1+numero2;
        
        JOptionPane.showMessageDialog(null, "a soma é "+ soma,"Soma dos inteiros",JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
