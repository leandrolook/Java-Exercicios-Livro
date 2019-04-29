package exercicio.pkg2.pkg28.livro.multiplos;

import javax.swing.JOptionPane;

public class Exercicio228LivroMultiplos
{

    public static void main(String[] args)
    {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com um numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com outro numero"));
        
        int multiplo = numero % numero2;
        
        if(multiplo == 0)
        {
            JOptionPane.showMessageDialog(null,"MULTIPLO DE : " + numero);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"NÂO È MULTIPLO DE :" + numero);
        }
        
        System.exit( 0 );
                
        
        
        
    }
    
}
