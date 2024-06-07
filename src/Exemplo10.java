/*10. Crie um algoritmo em Java contendo a lógica do jogo da forca.
O programa deve escolher aleatoriamente uma palavra de uma lista de palavras
e o usuário deve adivinhar a palavra, uma letra de cada vez. O usuário tem
um número fixo de tentativas para adivinhar a palavra.*/

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Exemplo10 {
    public static void main(String[] args){
        List<String> minhaLista = new ArrayList<>();
        Random aleatorio = new Random();

        minhaLista.add("casa");
        minhaLista.add("carro");
        minhaLista.add("banana");
        minhaLista.add("alegria");

        int indiceAleatorio = aleatorio.nextInt(minhaLista.size());
        String elementoAleatorio = minhaLista.get(indiceAleatorio);
        StringBuilder mensagem = new StringBuilder();
        boolean aux = false;

        String espacos = "";
        for (int i = 1; i < elementoAleatorio.length(); i++){
            mensagem.append(espacos = espacos + " _ ");
        }
        System.out.println(mensagem);
        System.out.println(elementoAleatorio.length() + " " + elementoAleatorio);
    }
}

