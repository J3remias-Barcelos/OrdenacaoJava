package org.example;

import java.util.Scanner;

public class PesquisaBinaria {
    public static void main(String[] args) {
        // Para buscaBinaria ou Pesq.Binaria o Vetor precisa estar ordenado!
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int contador = 0;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        boolean achouNumero = false;

        System.out.println("Qual número deseja encontrar? ");
        Scanner scanner = new Scanner(System.in);
        int valorProcurado = scanner.nextInt();

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            contador++; // Pra saber quantas vezes foi feita a comparação
            if (vetor[meio] == valorProcurado) {
                System.out.println("Valor encontrado na posição: " + meio);
                achouNumero = true;
                break;
            } else if (vetor[meio] < valorProcurado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        if (achouNumero) {
            System.out.println("Número foi encontrado!");
        } else {
            System.out.println("Valor não encontrado!");
        }

        System.out.println("Quantidade de comparações: " + contador);
    }
}
