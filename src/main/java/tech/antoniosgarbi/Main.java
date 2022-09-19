package tech.antoniosgarbi;

import tech.antoniosgarbi.exercicio1.Exercicio1;
import tech.antoniosgarbi.exercicio2.main.Exercicio2;
import tech.antoniosgarbi.exercicio3.main.Exercicio3;
import tech.antoniosgarbi.exercicio4e5e6.Exercicio456;
import tech.antoniosgarbi.exercicio7.Exercicio7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);

            boolean continuar = true;
            do {
                System.out.print("""
                    Escolha o exercicio desejado:
                                   
                    1 - Exercicio 1
                    2 - Exercicio 2
                    3 - Exercicio 3
                    4 - Exercicio 4 5 6
                    7 - Exercicio 7
                    0 - Sair
                                   
                    Digite o número desejado:\040""");

                byte opcaoEscolhida = scan.nextByte();

                switch (opcaoEscolhida) {
                    case 1 -> Exercicio1.main(null);
                    case 2 -> Exercicio2.main(null);
                    case 3 -> Exercicio3.main(null);
                    case 4 -> Exercicio456.main(null);
                    case 7 -> Exercicio7.main(null);
                    case 0 -> {
                        continuar = false;
                        System.out.println("Programa encerrado");
                    }
                    default -> System.out.println("\n\n*** A opção escolhida não é válida! *** \n\n");
                }
            } while (continuar);
        } catch (InputMismatchException e) {
            System.out.println("\n *** Um numero deve ser inserido! *** \n\n");
        } finally {
            main(null);
        }
    }
}
