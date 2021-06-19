/* Objetivo: Criar um programa que leia a idade de um nadador e apresente a sua categoria de acordo com a tabela abaixo.*/

import java.util.Scanner;

/**
 *
 * @author bsantosdias
 */

public class Nadador {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        int idade = entrada.nextInt();

        if ((idade >= 5) && (idade <= 7)) {
            System.out.println("Categoria infantil A.");
        } else if ((idade >= 8) && (idade <= 10)) {
            System.out.println("Categoria infantil B.");
        } else if ((idade >= 11) && (idade <= 13)) {
            System.out.println("Categoria juvenil A.");
        } else if ((idade >= 14) && (idade <= 17)) {
            System.out.println("Categoria juvenil B.");
        } else if (idade >= 18) {
            System.out.println("Categoria adulto.");
        } else {
            System.out.println("Sem categoria.");
        }

    }
}
