/*2. Crie um algoritmo em Java que verifica se um número inteiro é positivo, negativo ou zero.*/
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if(numero > 0){
            System.out.println("É positivo");
        }
        else if(numero < 0){
            System.out.println("É negativo");
        }
        else{
            System.out.println("É zero");
        }
    }
}
