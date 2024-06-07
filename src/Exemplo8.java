/*8. Desenvolva um algoritmo em Java que peça ao usuário um número inteiro n e
gere um padrão de asteriscos. Por exemplo, se n for 5, o padrão seria assim:*/
import java.util.Scanner;
public class Exemplo8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringBuilder mensagem = new StringBuilder();

        String resultado = "";
        System.out.print("Digite um valor inteiro: ");
        int valor = scanner.nextInt();

        if (valor > 0) {
            for (int i = 0; i < valor; i++) {
                mensagem.append(resultado = resultado + "*").append('\n');
            }
            System.out.println(mensagem);
        }
        else{
            System.out.println("Valor Inválido!");
        }
    }
}
