/*5. Crie um algoritmo em Java que peça ao usuário para que se digite um ano (exemplo: 2032).
Em seguida, o algoritmo deve verificar se o ano informado é ou não bissexto.*/
import java.util.Scanner;
public class Exemplo5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        if (ano % 4 == 0){
            if (ano % 100 == 0){
                if (ano % 400 == 0){
                    System.out.println("O ano é bissexto (tem 366 dias)");
                }
                else{
                    System.out.println("O ano não é bissexto (tem 365 dias)");
                }
            }
            else{
                System.out.println("O ano é bissexto (tem 366 dias)");
            }
        }
        else{
            System.out.println("O ano não é bissexto (tem 365 dias)");
        }
    }
}
