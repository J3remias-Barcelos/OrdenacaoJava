package org.example;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println(" --------SelectionSort--------");
        int[] vetor1 = {5, 3, 2, 4, 7, 1, 0, 6};
        int[] vetor2 = {7, 3, 8, 2, 9, 5, 4, 1};

        int comparacao = 0;
        int troca = 0;

        // Primeiro SelectionSort da forma antiga - Com comparação e troca  - Não otimizado
        int j = 0;
        for (int i = 0; i < (vetor1.length - 1); i++) {
            for (j = i + 1; j < vetor1.length; j++) {
                comparacao++;
                if (vetor1[j] < vetor1[i]) {
                    int aux = vetor1[i];
                    vetor1[i] = vetor1[j];
                    vetor1[j] = aux;
                    troca++;
                }
            }
        }

        int comparacao2 = 0;
        int troca2 = 0;

        // Segunda SelectionSort da forma otimizada
        for (int i = 0; i < vetor2.length; i++) {
            int menor = i;

            for (j = i + 1; j < vetor2.length; j++) {
                comparacao2++;
                if (vetor2[j] < vetor2[menor]) {
                    menor = j;
                }
            }
            int aux = vetor2[menor];
            vetor2[menor] = vetor2[i];
            troca2++;
            vetor2[i] = aux;
        }



        // Mostrar os Array e as comparações e trocas
        for (int vetorDaVez : vetor1) {
            System.out.println(Arrays.toString(vetor1));
        }

        System.out.printf("\n Comparaçao: " + comparacao);
        System.out.printf("\n Troca: " + troca);

        System.out.println("\n -----------------");

        for (int vetorDaVez : vetor2) {
            System.out.println(Arrays.toString(vetor2));
        }

        System.out.printf("\n Comparaçao: " + comparacao2);
        System.out.printf("\n Troca: " + troca2);

        System.out.println("\n -----------------");
    }
}
