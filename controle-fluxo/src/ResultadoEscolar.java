import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolar {
  public static void main(String[] args) {
    double nota;
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite a nota do Aluno: ");
    nota = scanner.nextDouble();
       
    if(nota >= 5 && nota < 7){
      System.out.println("Aluno em prova final");
    }else{
      String resultado = nota >= 7 ? "Aluno aprovado" : "Aluno reprovado";
      System.out.println(resultado);
    }
  }
}
