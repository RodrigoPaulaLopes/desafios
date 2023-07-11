package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array e o valor alvo (n k): ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.print("Digite os elementos do array separados por espaço: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = countPairsWithDiffK(arr, k);
        System.out.println("Número de pares com diferença igual a " + k + ": " + count);

    }
    public static int countPairsWithDiffK(int[] arr, int k) {
        Arrays.sort(arr);
        int count = 0;
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            int diff = arr[j] - arr[i];
            if (diff == k) {
                count++;
                j++;
            } else if (diff > k) {
                i++;
            } else {
                j++;
            }
        }
        return count;
    }
}