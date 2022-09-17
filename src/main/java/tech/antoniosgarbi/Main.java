package tech.antoniosgarbi;

import tech.antoniosgarbi.exercicio1.Exercicio1;
import tech.antoniosgarbi.exercicio2.main.Excercicio2;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        boolean continuar = true;
        do {
            System.out.print("""
               Escolha o exercicio desejado:
               
               1 - Exercicio1
               2 - Exercicio2
               3 - Exercicio3
               4 - Exercicio4
               5 - Exercicio5
               6 - Exercicio6
               7 - Exercicio7
               0 - Sair
               
               Digite o número desejado:\040""");

            byte opcaoEscolhida = Byte.parseByte(JOptionPane.showInputDialog("Escolha a opção desejada!"));

            switch (opcaoEscolhida) {
                case 1 -> Exercicio1.play();
                case 2 -> Excercicio2.play();
                case 0 -> {
                    continuar = false;
                    System.out.println("Programa encerrado");
                }
                default -> System.out.println("\n\n*** A opção escolhida não é válida! *** \n\n");
            }
        } while (continuar);


    }

}
