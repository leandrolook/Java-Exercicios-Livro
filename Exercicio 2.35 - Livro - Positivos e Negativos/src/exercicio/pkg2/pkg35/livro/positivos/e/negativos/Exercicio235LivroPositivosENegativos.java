package exercicio.pkg2.pkg35.livro.positivos.e.negativos;

import javax.swing.JOptionPane;

public class Exercicio235LivroPositivosENegativos
{

    public static void main(String[] args)
    {
      int contador = 0;
      int numero = 0;
      int maior = 0;
      int menor = 0;
      int zero = 0;
      while(contador < 5)
      {
          numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Numero"));
          
          if (numero > 0)
          {
              maior++;
          }
          if (numero < 0)
          {
              menor++;
          }
          if (numero == 0)
          {
              zero++;
          }
          
          contador++;
      }
      JOptionPane.showMessageDialog(null,"Quantidade de Numeros Menores que zero : " + menor
              + "\n" + "Quantidade de Numeros iguais a Zero : " + zero + "\n" 
              + "Quantidade de Numeros Maiores que Zero : " + maior);
      System.exit( 0 );
    }
    
}
