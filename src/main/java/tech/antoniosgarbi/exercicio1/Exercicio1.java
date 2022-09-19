package tech.antoniosgarbi.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("\n\nExercicio 1\n");

        Scanner scanner = new Scanner(System.in);

        Veiculo veiculo = new Veiculo();
        System.out.println("\nO veiculo foi criado!");

        System.out.println("\nveicular.ligar()");
        veiculo.ligar();

        System.out.println("\nveiculo.acelerar()");
        veiculo.acelerar();

        System.out.println("\nveiculo.abastecer(20)");
        veiculo.abastecer(20);

        System.out.println("\nveiculo.pintar(\"preto\")");
        veiculo.pintar("preto");

        System.out.println("\nveiculo.desligar()");
        veiculo.desligar();

        System.out.println("\nveiculo.frear()");
        veiculo.frear();

        System.out.println("\nveiculo.desligar()");
        veiculo.desligar();
    }
}
