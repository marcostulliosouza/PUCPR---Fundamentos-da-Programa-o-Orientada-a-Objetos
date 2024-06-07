/*7. Crie um algoritmo em Java que peça ao usuário a temperatura em
 graus Celsius e converta-a para graus Fahrenheit. Além disso, o programa
 deve imprimir se está frio (abaixo de 32°F), moderado (entre 32°F e 80°F)
 ou quente (acima de 80°F).*/

import java.util.Scanner;
public class Exemplo7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        float tempFahrenheit;

        System.out.print("Forneça a temperatura em graus Celsius: ");
        float tempCelsius = scanner.nextFloat();

        tempFahrenheit = tempCelsius + 32;

        System.out.println("A temperatura em Fahrenheit: " + tempFahrenheit + "ºF");
        if (tempFahrenheit < 32){
            System.out.println("Está frio");
        }
        else if (tempFahrenheit > 80){
            System.out.println("Está quente");
        }
        else{
            System.out.println("Está moderado");
        }

    }
}
