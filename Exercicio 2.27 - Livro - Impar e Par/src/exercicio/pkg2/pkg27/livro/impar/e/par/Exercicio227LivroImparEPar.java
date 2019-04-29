package exercicio.pkg2.pkg27.livro.impar.e.par;

import javax.swing.JOptionPane;

public class Exercicio227LivroImparEPar
{
    public static void main(String[] args)
    {
       int numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Numero"));
       
       int resultado = numero % 2;
       
       if(resultado != 0)
       {
           JOptionPane.showMessageDialog(null, "IMPAR!!");
       }
       else 
       {
           JOptionPane.showMessageDialog(null, "PAR!!");

       }
       
       System.exit(0);
    }
    
}
