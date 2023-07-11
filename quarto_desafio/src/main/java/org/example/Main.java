package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de casos de teste: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a frase desembaralhada: ");
            String linha = scanner.nextLine();
            String fraseOriginal = desembaralharFrase(linha);
            System.out.println("Frase original: " + fraseOriginal);
        }

    }

    public static String desembaralharFrase(String linha) {
        int tamanho = linha.length();
        String metadeEsquerda = linha.substring(0, tamanho / 2);
        String metadeDireita = linha.substring(tamanho / 2, tamanho);
        StringBuilder fraseOriginal = new StringBuilder();

        for (int i = tamanho / 2 - 1; i >= 0; i--) {
            fraseOriginal.append(metadeEsquerda.charAt(i));
        }

        for (int i = tamanho - 1; i >= tamanho / 2; i--) {
            fraseOriginal.append(metadeDireita.charAt(i - tamanho / 2));
        }

        return fraseOriginal.toString();
    }
}