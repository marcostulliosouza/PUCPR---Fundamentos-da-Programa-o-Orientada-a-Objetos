/*4. Crie um algoritmo em Java que peça ao usuário para que se digite um número inteiro
(exemplo: 14). Em seguida, o algoritmo deve mostrar a tabuada do número
digitado utilizando o “for”.*/
import java.util.Scanner;
import java.util.SortedMap;

public class Exemplo4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
