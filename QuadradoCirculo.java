/* Objetivo: Criar um programa que leia dois números L e R. O programa deve verificar a maior área entre um quadrado
de lado L e um círculo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Circulo". */ 


import java.util.Scanner;

/**
 *
 * @author bsantosdias
 */

public class QuadradoCirculo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira número L: ");
        double l = entrada.nextDouble();

        System.out.print("Insira número R: ");
        double r = entrada.nextDouble();

        double quadrado = (l * l);
        double circulo = (3.14 * (r * r));

        if (quadrado > circulo) {
            System.out.println("Quadrado é maior que circulo.");
        } else {
            System.out.println("Circulo é maior que quadrado.");
        }

    }
}
