package exercicio.pkg2.pkg18.livro.inteiro;

import javax.swing.JOptionPane;


public class Exercicio218LivroInteiro
{

    public static void main(String[] args)
    {
       
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Primeiro numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Segundo numero"));
        int numero3= Integer.parseInt(JOptionPane.showInputDialog("Entre com o Terceiro numero"));
        
        int soma = numero1 + numero2 + numero3;
        int media = soma / 3;
        
        JOptionPane.showMessageDialog(null,"Soma : " + soma);
        JOptionPane.showMessageDialog(null,"media : " + media);

        if ((numero1 > numero2)&&(numero1 > numero3))
        {
            JOptionPane.showMessageDialog(null," Maior numero é " + numero1);
        }
        if ((numero2 > numero1) && (numero2 > numero3))
        {
            JOptionPane.showMessageDialog(null," Maior numero é " + numero2);
        }if ((numero3 > numero1) && (numero3 > numero2))
        {
            JOptionPane.showMessageDialog(null," Maior numero é " + numero3);
        }
        
        System.exit( 0 );
                
        
        
    }
    
}
