/*6. Crie um algoritmo em Java que solicita um número inteiro ao usuário.
 Em seguida, deve-se verificar se o número digitado é ou não é um número primo.*/
import java.util.Scanner;
public class Exemplo6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        System.out.print("Digite um valor inteiro: ");
        int valor = scanner.nextInt();

        if (valor > 1){
            for (int i = 1; i <= valor; i++){
                if (valor % i == 0 ){
                    contador += 1;
                }
            }
            if (contador == 2){
                System.out.print("O número é primo");
            }
            else{
                System.out.print("O número não é primo");
            }
        }
        else{
            System.out.print("O número não é primo");
        }
    }
}
