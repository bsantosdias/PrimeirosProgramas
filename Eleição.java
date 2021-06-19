/* Em uma eleição presidencial existem quatro candidatos. Os votos são informados por código. Os dados utilizados para a apuração obedecem à seguinte codificação:
• 1, 2, 3, 4 = voto para os respectivos candidatos;
• 5 = voto nulo;
• 6 = voto em branco.
Objetivo: Criar um programa que calcule e apresente:
• o total de votos para cada candidato e seu porcentual sobre o total;
• o total de votos nulos e seu porcentual sobre o total;
• o total de votos em branco e seu porcentual sobre o total.
Como finalizador do conjunto de votos, tem-se o valor 0. */


import java.util.Scanner;

/**
 *
 * @author bsantosdias
 */

public class Eleição {

    public static void main(String[] args) {

        int cand1 = 0;
        int cand2 = 0;
        int cand3 = 0;
        int cand4 = 0;
        int nulo = 0;
        int branco = 0;
        int total = 0;
        int x = -1;

        Scanner entrada = new Scanner(System.in);

        while (x != 0) {

            System.out.print("1, 2, 3 ou 4 para votar nos respectivos candidatos;\n 5 para votar nulo;\n 6 para votar em branco;\n 0 para encerrar sistema.\n Voto: ");
            x = entrada.nextInt();

            if (x == 1) {
                cand1++;
                total++;
            } else if (x == 2) {
                cand2++;
                total++;
            } else if (x == 3) {
                cand3++;
                total++;
            } else if (x == 4) {
                cand4++;
                total++;
            } else if (x == 5) {
                nulo++;
                total++;
            } else if (x == 6) {
                branco++;
                total++;
            } else if (x > 6 || x < 0) {
                System.out.println("Opção inválida");
            }

        }
        System.out.println("O candidato 1 recebeu " + cand1 + " votos e isso representa " + (cand1 * 100) / total + "% do total de votos.");
        System.out.println("O candidato 2 recebeu " + cand2 + " votos e isso representa " + (cand2 * 100) / total + "% do total de votos.");
        System.out.println("O candidato 3 recebeu " + cand3 + " votos e isso representa " + (cand3 * 100) / total + "% do total de votos.");
        System.out.println("O candidato 4 recebeu " + cand4 + " votos e isso representa " + (cand4 * 100) / total + "% do total de votos.");
        System.out.println(+nulo + " votos foram nulos e isso representa " + (nulo * 100) / total + "% do total de votos.");
        System.out.println(+branco + " votos foram brancos e isso representa " + (branco * 100) / total + "% do total de votos.");

    }
}
