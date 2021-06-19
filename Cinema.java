/*Um cinema possui capacidade de 20 lugares e está sempre com ocupação total. Certo dia, cada espectador respondeu a um questionário, na qual constava:
• sua idade; • sua opinião em relação ao filme, segundo as seguintes notas: A = Ótimo, B = Bom, C = Regular, D = Ruim e E = Péssimo. 

Objetivo: Criar um programa que, lendo estes dados, calcule e apresente:
• a quantidade de respostas Ótimo;
• a média de idade das pessoas que responderam Ruim;
• a porcentagem de respostas Péssimo e a maior idade que utilizou esta opção;
• a diferença de idade entre a maior idade que respondeu Ótimo e a maior idade que respondeu Ruim. */


import java.util.Scanner;

/**
 *
 * @author bsantosdias
 */

public class Cinema {

    public static void main(String[] args) {

        int otimo = 0;
        int bom = 0;
        int regular = 0;
        int ruim = 0;
        int pessimo = 0;
        int idadeotimo = 0;
        int idaderuim = 0;
        int idadepessimo = 0;
        int somaruim = 0;
        int porcentagempessimo = 0;

        Scanner entrada = new Scanner(System.in);

        for (int contador = 1; contador <= 20; contador++) {

            System.out.print("Quantos anos você tem? ");
            int idade = entrada.nextInt();

            System.out.print("Qual sua opnião em relação ao filme?\n A:Ótimo \n B:Bom \n C:Regular \n D:Ruim \n E:Péssimo \n Resposta: ");
            String opniao = entrada.next();

            if ("a".equalsIgnoreCase(opniao)) {
                otimo++;
                if ((otimo == 1) || (idade > idadeotimo)) {
                    idadeotimo = idade;
                }
            } else if ("b".equalsIgnoreCase(opniao)) {
                bom++;
            } else if ("c".equalsIgnoreCase(opniao)) {
                regular++;
            } else if ("d".equalsIgnoreCase(opniao)) {
                ruim++;
                somaruim = somaruim + idade;
                if ((ruim == 1) || (idade > idaderuim)) {
                    idaderuim = idade;
                }
            } else if ("e".equalsIgnoreCase(opniao)) {
                pessimo++;
                if ((pessimo == 1) || (idade > idadepessimo)) {
                    idadepessimo = idade;
                }
            } else {
                contador--;
                System.out.println("Opção inválida");
            }

        }
        if (otimo > 0) {
            System.out.println(otimo + " pessoa(s) acharam o filme ótimo.");
        } else {
            System.out.println("Ninguém achou o filme ótimo.");
        }
        if (ruim == 0) {
            System.out.println("Ninguém achou o filme ruim.");
        } else {
            System.out.println(somaruim / ruim + " anos é a idade média das pessoas que acharam o filme ruim.");
        }

        porcentagempessimo = (pessimo * 100) / 20;

        System.out.println(porcentagempessimo + "% das pessoas acharam o filme péssimo. A pessoa mais velha que votou nessa opção tinha " + idadepessimo + " anos.");

        if (idadeotimo > idaderuim) {
            System.out.println("A diferença de idade entre a pessoa mais velha que votou em ótimo e a mais velha que votou em ruim é de " + (idadeotimo - idaderuim) + " anos.");
        } else {
            System.out.println("A diferença de idade entre a pessoa mais velha que votou em ótimo e a mais velha que votou em ruim é de " + (idaderuim - idadeotimo) + " anos.");
        }

    }
}
