package exercicio.pkg2.pkg32.livro.digitos.separados;

import javax.swing.JOptionPane;

public class Exercicio232LivroDigitosSeparados
{

    public static void main(String[] args)
    {
       try
       {
       int numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero de 5 Digitos"));
       
       int resultado0 = numero / 10000;
       int resto0 = numero % 10000;
       int resultado1 = resto0 / 1000;
       int resto1 = numero % 1000;
       int resultado2 = resto1 / 100;
       int resto2 = numero % 100;
       int resultado3 = resto2 / 10;
       int resto3 = numero % 10;
       int resultado4 = resto3 / 1;
       
       JOptionPane.showMessageDialog(null, resultado0 + "  " + resultado1 + "  " + 
               resultado2 + "  " + resultado3 + "  " + resultado4);
       }
       catch(Exception DeuErro)
       {
           String mensagem = "Numero Invalido";
           JOptionPane.showMessageDialog(null, mensagem);
       }
       System.exit( 0 );
    }
    
}
