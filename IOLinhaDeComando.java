import java.util.Scanner;
public class IOLinhaDeComando{
  public static void main(String... args){
    //declaração de variáveis
    int a, b;
    int resultado;
    Scanner leitor = new Scanner(System.in);
    //entrada
    System.out.println("Digite o primeiro valor");
    a = leitor.nextInt();
    System.out.println("Digite o segundo valor");
    b = leitor.nextInt();
    //processamento
    resultado = a + b;
    //saída
    //2 + 3 = 5
    System.out.printf(
      "%d + %d = %d\n",
      a, b, resultado
    );
  }
}