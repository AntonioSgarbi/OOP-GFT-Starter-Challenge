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
        if(isLigado) {
            velocidade += 20;
            System.out.println("Velocidade atual: " + velocidade);
        }
    }

    public void frear() {
        if (velocidade == 0)
            System.out.println("O freio não funciona com o veículo parado!");
        else if (velocidade <= 20) {
            velocidade = 0;
            System.out.println("O freio foi pressionado e o carro está parado agora");
        } else {
            velocidade -= 20;
            System.out.println("O freio foi pressionado e o carro está na velocidade " + velocidade + " agora.\n");
        }
    }

    public void abastecer(int combustivelAdicionado) {
        int LIMITE_TANQUE = 60;
        if (litrosCombustivel + combustivelAdicionado > LIMITE_TANQUE) {
            int volumeDisponivel = LIMITE_TANQUE - litrosCombustivel;
            System.out.println("A quantidade informada ultrapassa a capacidade do tanque,\n" +
                    "ainda é possível abastecer: " + volumeDisponivel + " litros.\n");
        } else {
            litrosCombustivel += combustivelAdicionado;
            System.out.println("O veiculo foi abastecido e está com: " + litrosCombustivel + " litros.\n");
        }
    }

    public void pintar(String cor) {
        this.cor = cor;
        System.out.println("O veiculo foi pintado e agora é " + cor + "\n");
    }

    public void desligar() {
        if (velocidade != 0)
            System.out.println("O veículo não pode ser desligado enquanto estiver em movimento!\n");
        else {
            isLigado = false;
            System.out.println("O veiculo foi desligado.\n");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
