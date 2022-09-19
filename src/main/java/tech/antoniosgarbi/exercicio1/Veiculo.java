package tech.antoniosgarbi.exercicio1;

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

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKm() {
        return this.km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean isLigado() {
        return this.isLigado;
    }

    public void setLigado(boolean ligado) {
        this.isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return this.litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
