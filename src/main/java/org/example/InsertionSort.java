package org.example;

public class InsertionSort {
        public static void main(String[] args) {
            int[] vetor = {5, 3, 2, 4, 7, 1, 0, 6, 8};
//            int comparacao = 0;
//            int troca = 0;

            // Posso criar as variáveis aqui fora
            int j, x;
            for (int i = 1; i < vetor.length; i++) {
                x = vetor[i];
                j = i -1;
                while ((j >= 0) && (vetor[j] > x)) {
                    // comparacao++;
                    vetor[j+1] = vetor[j];
                    j = j - 1;
                }
                vetor[j + 1] = x;
                // troca++;
            }

            System.out.println("-----InsertionSort-----");
            for (int vetorDaVez : vetor) {
                System.out.println(vetorDaVez);
            }

//            System.out.println("Comparações: " + comparacao);
//            System.out.println("Trocas: " + troca);
        }
    }