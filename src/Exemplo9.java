/* 9. Crie um algoritmo em Java que solicita ao usuário para que insira um número inteiro
entre 1 e 1000 e converta-o em um número romano. Por exemplo, se o usuário inserir 58,
o programa deve imprimir "LVIII".*/
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;
public class Exemplo9 {
    public static String converteRomano(int num){
        LinkedHashMap<Integer, String> numeros = new LinkedHashMap<>();
        numeros.put(1000, "M");
        numeros.put(900, "CM");
        numeros.put(500, "D");
        numeros.put(400, "CD");
        numeros.put(100, "C");
        numeros.put(50, "L");
        numeros.put(40, "XL");
        numeros.put(10, "X");
        numeros.put(9, "IX");
        numeros.put(5, "V");
        numeros.put(4, "IV");
        numeros.put(1, "I");

        StringBuilder mensagem = new StringBuilder();

        for (Map.Entry<Integer, String> entry: numeros.entrySet()){
            int key = entry.getKey();
            String valorRomano = entry.getValue();
            while (num >= key){
               mensagem.append(valorRomano);
               num -= key;
            }
        }
        return mensagem.toString();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um valor inteiro: ");
        int valorInteiro = scanner.nextInt();
        System.out.println(converteRomano(valorInteiro));
    }
}
