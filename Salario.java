/* Objetivo: Criar um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, calcular e imprimir o total a receber no final do mês.*/


import java.util.Scanner;

/**
 *
 * @author bsantosdias
 */

public class Salario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = entrada.next();

        System.out.print("Insira seu salário fixo: ");
        double salario = entrada.nextFloat();

        System.out.print("Insira o total de vendas (em dinheiro) realizadas nesse mês: ");
        double vendas = entrada.nextFloat();

        double n1 = ((vendas * 15) / 100);
        double n2 = salario + n1;
        //função usada somente para arredondar as casas decimas do salário. 
        n2 = Math.round(n2 * 100) / 100.0;

        System.out.println("" + nome + ", seu salario nesse mês será de: " + n2);

    }
}
