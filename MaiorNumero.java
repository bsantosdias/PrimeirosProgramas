/*Objetivo: Criar um programa que leia três números inteiros e apresente na tela o maior deles. */


import java.util.Scanner;

/**
 *
 * @author bsantosdias
 */

public class MaiorNumero {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int n1 = entrada.nextInt();

        System.out.print("Insira o segundo número: ");
        int n2 = entrada.nextInt();

        System.out.print("Insira o terceiro número: ");
        int n3 = entrada.nextInt();

        if ((n1 > n2) && (n1 > n3)) {
            System.out.println("O número " + n1 + " é o maior dos três");
        } else if ((n2 > n1) && (n2 > n3)) {
            System.out.println("O número " + n2 + " é o maior dos três");
        } else if ((n3 > n1) && (n3 > n2)) {
            System.out.println("O número " + n3 + " é o maior dos três");
        } else {
            System.out.println("Operação inválida.");
        }

    }

}
