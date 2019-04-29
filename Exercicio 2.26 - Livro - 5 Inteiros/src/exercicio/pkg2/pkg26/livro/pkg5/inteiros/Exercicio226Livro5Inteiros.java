package exercicio.pkg2.pkg26.livro.pkg5.inteiros;

import javax.swing.JOptionPane;

public class Exercicio226Livro5Inteiros
{

    public static void main(String[] args)
    {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo numero"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o terceiro numero"));
        int num4 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o quarto numero"));
        int num5 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o quinto numero"));
        
        if ((num1 > num2) && (num1>num3) && (num1 > num4) && (num1 > num5))
        {
          JOptionPane.showMessageDialog(null,"Maior numero :" + num1);
        }
        if ((num2 > num1) && (num2 > num3) && (num2 > num4) && (num2 > num5))
        {
          JOptionPane.showMessageDialog(null,"Maior numero :" + num2);
        }
        if ((num3 > num2) && (num3 > num1) && (num3 > num4) && (num3 > num5))
        {
          JOptionPane.showMessageDialog(null,"Maior numero :" + num3);
        }
        if ((num4 > num2) && (num4 > num3) && (num4 > num1) && (num4 > num5))
        {
          JOptionPane.showMessageDialog(null,"Maior numero :" + num4);
        }
        if ((num5 > num2) && (num5 > num3) && (num5 > num4) && (num5 > num1))
        {
          JOptionPane.showMessageDialog(null,"Maior numero :" + num5);
        }
         if ((num1 < num2) && (num1 < num3) && (num1 < num4) && (num1 < num5))
        {
          JOptionPane.showMessageDialog(null,"Menor numero :" + num1);
        }
        if ((num2 < num1) && (num2 < num3) && (num2 < num4) && (num2 < num5))
        {
          JOptionPane.showMessageDialog(null,"Menor numero :" + num2);
        }
        if ((num3 < num2) && (num3 < num1) && (num3 < num4) && (num3 < num5))
        {
          JOptionPane.showMessageDialog(null,"Menor numero :" + num3);
        }
        if ((num4 < num2) && (num4 < num3) && (num4 < num1) && (num4 < num5))
        {
          JOptionPane.showMessageDialog(null,"Menor numero :" + num4);
        }
        if ((num5 < num2) && (num5 < num3) && (num5 < num4) && (num5 < num1))
        {
          JOptionPane.showMessageDialog(null,"Menor numero :" + num5);
        }
        
        System.exit( 0 );
        
    }
    
}
