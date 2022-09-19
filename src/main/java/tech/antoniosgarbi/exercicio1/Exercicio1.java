package tech.antoniosgarbi.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Veiculo veiculo = new Veiculo();
        boolean continuar = true;
        System.out.println("O carro foi criado!");
        do {
            System.out.println("""
                    Açôes disponíveis:
                    
                    1 - ligar
                    2 - acelerar
                    3 - frear
                    4 - abastecer
                    5 - pintar
                    6 - desligar
                    0 - Sair
                    
                    """);
            System.out.print("Insira o número da ação: ");
            byte opcao = scanner.nextByte();

            switch (opcao) {
                case 1 -> veiculo.ligar();
                case 2 -> veiculo.acelerar();
                case 3 -> veiculo.frear();
                case 4 -> {
                    System.out.println("Deseja abastecer quantos litros: ");
                    veiculo.abastecer(scanner.nextInt());
                }
                case 5 -> {
                    System.out.println("Deseja pintar o carro de qual cor: ");
                    veiculo.pintar(scanner.nextLine());
                }
                case 6 -> veiculo.desligar();
                case 0 -> continuar = false;
                default -> System.out.println("A opção é inválida!");
            }
        } while (continuar);
    }
}
