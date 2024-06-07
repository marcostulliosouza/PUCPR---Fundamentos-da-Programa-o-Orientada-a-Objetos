/*1. Crie um algoritmo em Java que solicita três números decimais ao usuário.
Em seguida, a média destes números é calculada e mostrada na tela para o usuário.*/

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite o valor 1: ");
        float n1 = scanner.nextFloat();
        System.out.println("Digite o valor 2: ");
        float n2 = scanner.nextFloat();
        System.out.println("Digite o valor 3: ");
        float n3 = scanner.nextFloat();

        float media;

        media = (n1 + n2 + n3) / 3;

        System.out.println("A média é: " + media);
    }
}