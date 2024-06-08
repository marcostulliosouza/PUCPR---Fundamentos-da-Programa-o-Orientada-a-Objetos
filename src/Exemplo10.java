import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exemplo10 {
    public static void main(String[] args) {
        String[] palavras = {"carro", "uva", "alegria", "strogonoff"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String palavraSelecionada = palavras[random.nextInt(palavras.length)];
        int tentativas = 6;
        StringBuilder palavraAdivinhada = new StringBuilder();

        for (int i = 0; i < palavraSelecionada.length(); i++) {
            palavraAdivinhada.append('_');
        }

        Set<Character> letrasAdivinhadas = new HashSet<>();

        System.out.println("Bem-vindo ao jogo da Forca!");
        System.out.println("Tente adivinhar a palavra!");

        while (tentativas > 0) {
            System.out.println("Palavra: " + palavraAdivinhada);
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.print("Digite uma letra: ");

            char letra = scanner.nextLine().toLowerCase().charAt(0);

            if (letrasAdivinhadas.contains(letra)) {
                System.out.println("Você já tentou essa letra. Tente outra.");
                continue;
            }

            letrasAdivinhadas.add(letra);
            boolean letraAdivinhada = false;

            for (int i = 0; i < palavraSelecionada.length(); i++) {
                if (palavraSelecionada.charAt(i) == letra) {
                    palavraAdivinhada.setCharAt(i, letra);
                    letraAdivinhada = true;
                }
            }

            if (!letraAdivinhada) {
                tentativas--;
            }

            if (palavraAdivinhada.toString().equals(palavraSelecionada)) {
                System.out.println("Parabéns, você adivinhou a palavra correta: " + palavraSelecionada);
                break;
            }
        }

        if (tentativas == 0) {
            System.out.println("Game Over! A palavra era: " + palavraSelecionada);
        }

        scanner.close();
    }
}
