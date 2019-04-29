package exercicio.pkg2.pkg34.livro.nome.sobrenome;

import javax.swing.JOptionPane;

public class Exercicio234LivroNomeSobrenome
{

    public static void main(String[] args)
    {
       String nome = JOptionPane.showInputDialog("Entre com o Nome");
       String sobrenome = JOptionPane.showInputDialog("Entre com o Sobrenome");
       
       JOptionPane.showMessageDialog(null,nome + " " + sobrenome);
       
       System.exit( 0 );
       
    }
    
}
