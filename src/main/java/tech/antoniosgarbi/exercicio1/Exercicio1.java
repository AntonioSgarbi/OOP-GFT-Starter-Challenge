package tech.antoniosgarbi.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void play() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Veiculo veiculo = new Veiculo();
        boolean continuar = true;
        System.out.println("O carro foi criado!");
        do {
            System.out.println("""
                    Escolha uma ação:
                    
                    1 - ligar
                    2 - acelerar
                    3 - frear
                    0 - Sair
                    
                    """);
            byte opcao = scanner.nextByte();

            switch (opcao) {
                case 1 -> veiculo.ligar();
                case 2 -> veiculo.acelerar();
                case 3 -> veiculo.frear();
                case 0 -> continuar = false;
            }
        } while (continuar);

    }
}
