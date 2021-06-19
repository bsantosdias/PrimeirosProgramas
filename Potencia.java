/* Objetivo: Criar um programa que leia dois valores inteiro X e Z, calcula e apresente na tela XZ (sem utilizar funções
ou operadores de potência prontos). */

import java.util.Scanner;

/**
 *
 * @author bsantosdias
 */

public class Potencia {

    public static void main(String[] args) {

        int p = 1;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o primeiro número inteiro: ");
        int x = entrada.nextInt();
        System.out.print("Insira o segundo número inteiro: ");
        int z = entrada.nextInt();

        if (z < 0) {
            System.out.println("Operação inválida");
        } else {
            for (int i = 1; i <= z; i++) {
                p = p * x;
            }
            System.out.println("O resultado é " + p);
        }

    }
}
