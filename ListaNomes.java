// Nome: Bianca Santos Dias.
/*Criar um programa para o gerenciamento de uma lista de nomes. Os nomes devem ser armazenados em um vetor do
tipo String de tamanho 50. O programa deve possuir o seguinte menu:
1 - Adicionar um novo nome
2 - Apresentar os nomes
3 - Pesquisar um nome
4 - Remover um nome
0 - Sair
 */
package Ex;

import java.util.Scanner;

/**
 *
 * @author bsant
 */
public class ListaNomes{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String lista[] = new String[50];
        Boolean sair = false;

        do {
            Boolean listavazia = false;
            Boolean nomeduplicado = false;
            Boolean nomeEncontrado = false;
            Boolean nomeTrocado = false;

            System.out.print(" 1: Adicionar um novo nome.\n 2: Apresentar os nomes.\n 3: Pesquisar um nome.\n "
                    + "4: Remover um nome.\n 0: Sair.\n Escolha: ");
            int escolha = entrada.nextInt();

            // Sair
            if (escolha == 0) {
                sair = true;
            } // Adicionar nome.
            else if (escolha == 1) {
                System.out.print("Adicione nome: ");
                String nome = entrada.next();

                for (int i = 0; i < lista.length; i++) {
                    if (lista[i] == null) {
                        lista[i] = nome;
                        listavazia = true;
                        break;
                    } else {
                        if (lista[i].equalsIgnoreCase(nome)) {
                            nomeduplicado = true;
                            listavazia = true;
                            break;
                        }
                    }

                }
                if (listavazia == false) {
                    System.out.println("A lista está cheia. Nome não cadastrado.");
                }
                if (nomeduplicado == true) {
                    System.out.println("Nome já cadastrado.");
                }

            } // Apresentar nomes.
            else if (escolha == 2) {
                if (lista[0] == null) {
                    System.out.println("A lista está vazia.");
                } else {
                    for (int i = 0; i < lista.length; i++) {
                        if (lista[i] != null) {
                            System.out.println(lista[i]);
                        }
                    }
                }

            }// Pesquisar nome.
            else if (escolha == 3) {

                System.out.print("Pesquisar nome: ");
                String pesquisa = entrada.next();

                int i = 0;
                for (i = 0; i < lista.length; i++) {
                    if (lista[i] != null) {
                        if (lista[i].equalsIgnoreCase(pesquisa)) {
                            nomeEncontrado = true;
                            break;

                        }
                    }
                }
                if (nomeEncontrado == true) {
                    System.out.println("Nome encontrado na " + (i + 1) + "º posição ");
                } else {
                    System.out.println("Nome não encontrado.");
                }

            } // Remover nome.
            else if (escolha == 4) {
                System.out.print("Nome que deseja remover: ");
                String remover = entrada.next();

                for (int i = 0; i < lista.length; i++) {
                    if (nomeTrocado == true) {
                        if (lista[i] != null) {
                            lista[i - 1] = lista[i];
                            lista[i] = null;
                        }
                    } else if (lista[i].equalsIgnoreCase(remover)) {
                        lista[i] = null;
                        nomeTrocado = true;
                    }
                }
                if (nomeTrocado == true) {
                    System.out.println("Nome removido.");
                } else {
                    System.out.println("Nome não encontrado.");
                }
            } else {
                System.out.println("Opção inválida");
            }

        } while (sair == false);
    }

}
