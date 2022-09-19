package tech.antoniosgarbi.exercicio1;

import lombok.Data;

@Data
public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private double preco;


    public void ligar() {
        if (!this.isLigado) {
            System.out.println("Ligando o carro...");
            this.isLigado = true;
        }
        System.out.println("Sucesso!\nO veículo está ligado");
    }

    public void acelerar() {
        if(this.isLigado) {
            this.velocidade += 20;
            System.out.println("Velocidade atual: " + this.velocidade);
        } else {
            System.out.println("Não é possível acelerar o carro parado");
        }
    }

    public void frear() {
        if (this.velocidade == 0)
            System.out.println("O freio não funciona com o veículo parado!");
        else if (this.velocidade <= 20) {
            this.velocidade = 0;
            System.out.println("O freio foi pressionado e o carro está parado agora");
        } else {
            this.velocidade -= 20;
            System.out.println("O freio foi pressionado e o carro está na velocidade " + this.velocidade + " agora.\n");
        }
    }

    public void abastecer(int combustivelAdicionado) {
        int LIMITE_TANQUE = 60;
        if (this.litrosCombustivel + combustivelAdicionado > LIMITE_TANQUE) {
            int volumeDisponivel = LIMITE_TANQUE - this.litrosCombustivel;
            System.out.println("A quantidade informada ultrapassa a capacidade do tanque,\n" +
                    "ainda é possível abastecer: " + volumeDisponivel + " litros.\n");
        } else {
            this.litrosCombustivel += combustivelAdicionado;
            System.out.println("O veiculo foi abastecido e está com: " + this.litrosCombustivel + " litros.\n");
        }
    }

    public void pintar(String cor) {
        this.cor = cor;
        System.out.println("O veiculo foi pintado e agora é " + this.cor + "\n");
    }

    public void desligar() {
        if (this.velocidade != 0)
            System.out.println("O veículo não pode ser desligado enquanto estiver em movimento!\n");
        else {
            this.isLigado = false;
            System.out.println("O veiculo foi desligado.\n");
        }
    }

}
