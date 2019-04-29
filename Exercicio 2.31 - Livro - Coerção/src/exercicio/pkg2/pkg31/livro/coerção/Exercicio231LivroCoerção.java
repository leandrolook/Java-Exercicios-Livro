package exercicio.pkg2.pkg31.livro.coerção;

import javax.swing.JOptionPane;

public class Exercicio231LivroCoerção
{

    public static void main(String[] args)
    {
        int coercao1 = 'A',coercao2 = 'B', coercao3 = 'C',
            coercao4 = 'a',coercao5 = 'b',coercao6 = 'c',
            coercao7 = '0',coercao8 = '1',coercao9 = '2',
            coercao10 = '$',coercao11 = '*',coercao12 = '+',
            coercao13 = '/',coercao14 = ' ';
        
        JOptionPane.showMessageDialog(null,"Valor de 'A' : " + coercao1);
        JOptionPane.showMessageDialog(null,"Valor de 'B' : " + coercao2);
        JOptionPane.showMessageDialog(null,"Valor de 'C' : " + coercao3);
        JOptionPane.showMessageDialog(null,"Valor de 'a' : " + coercao4);
        JOptionPane.showMessageDialog(null,"Valor de 'b' : " + coercao5);
        JOptionPane.showMessageDialog(null,"Valor de 'c' : " + coercao6);
        JOptionPane.showMessageDialog(null,"Valor de '0' : " + coercao7);
        JOptionPane.showMessageDialog(null,"Valor de '1' : " + coercao8);
        JOptionPane.showMessageDialog(null,"Valor de '2' : " + coercao9);
        JOptionPane.showMessageDialog(null,"Valor de '$' : " + coercao10);
        JOptionPane.showMessageDialog(null,"Valor de '*' : " + coercao11);
        JOptionPane.showMessageDialog(null,"Valor de '+' : " + coercao12);
        JOptionPane.showMessageDialog(null,"Valor de '/' : " + coercao13);
        JOptionPane.showMessageDialog(null,"Valor de ' ' : " + coercao14);
       
        System.exit( 0 );
    }
    
}
