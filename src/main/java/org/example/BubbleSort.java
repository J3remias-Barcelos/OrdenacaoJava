package org.example;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor1 = {5, 3, 2, 4, 7, 1, 0, 6};
        int[] vetor2 = {7, 3, 8, 2, 9, 5, 4, 1, 10};

        int comparacao = 0;
        int troca = 0;

        for (int i = 0; i < vetor1.length; i++) {
            for (int j = 0; j < vetor1.length - 1; j++) {
                if (vetor1[j] > vetor1[j + 1]) {
                    int aux = vetor1[j];
                    vetor1[j] = vetor1[j + 1];
                    vetor1[j + 1] = aux;
                }
            }
        }

        // Criar outro BubbleSort igual para exibir comparação e troca
        for (int i = 0; i < vetor2.length; i++) {
            for (int j = 0; j < vetor2.length - 1; j++) {
                comparacao++;
                if (vetor2[j] > vetor2[j + 1]) {
                    int aux = vetor2[j];
                    vetor2[j] = vetor2[j + 1];
                    vetor2[j + 1] = aux;
                    troca++;
                }
            }
        }

        System.out.println("-----BubbleSort-----");
        System.out.println(Arrays.toString(vetor1));

        System.out.println("-------------------------------");

        System.out.printf("-------BubbleSort2-------\n");
        System.out.println(Arrays.toString(vetor2));

        // Mostrar comparação e quantidade de trocas!
        System.out.println("Comparações: " + comparacao);
        System.out.println("Trocas: " + troca);
    }

}
