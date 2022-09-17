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
    private Double preco;


    public void acelerar() {
        this.velocidade += 20;

    }

    public void abastecer(int combustivel) {
        this.verificarDisponibilidadeTanque(combustivel);
        this.litrosCombustivel += combustivel;
    }

    public void frear() {
        if (this.velocidade == 0)
            System.out.println("O freio não funciona com o veículo parado!");
//            throw new RuntimeException("O freio não funciona com o veículo parado!");
        else if (this.velocidade <= 20) {
            this.velocidade = 0;
            System.out.println("O freio foi pressionado e o carro está parado agora");
        } else {
            this.velocidade -= 20;
            System.out.printf("O freio foi pressionado e o carro está na velocidade: %s agora%n", this.velocidade);
        }
    }

    public void pintar(String cor) {
        this.cor = cor;
        System.out.printf("O carro foi pintado e agora é da cor: %s%n", cor);
    }

    public void ligar() throws InterruptedException {
        if (!this.isLigado) {
            System.out.print("Ligando o carro");
            Thread.sleep(400);
            System.out.print(".");
            Thread.sleep(400);
            System.out.print(".");
            Thread.sleep(400);
            System.out.println(".");
            Thread.sleep(200);
            this.isLigado = true;
        }
        System.out.println("Sucesso!\nO veículo está ligado");
    }

    public void desligar() {
        if (velocidade != 0)
            throw new RuntimeException("O veículo não pode ser desligado enquanto estiver em movimento");
        else {
            this.isLigado = false;
            System.out.println("O veiculo foi desligado");
        }
    }

    private void verificarDisponibilidadeTanque(int quantidadeCombustivel) {
        int LIMITE_TANQUE = 60;
        if (this.litrosCombustivel + quantidadeCombustivel > LIMITE_TANQUE) {
            int volumeDisponivel = LIMITE_TANQUE - this.litrosCombustivel;
            throw new RuntimeException("A quantidade informada ultrapassa a capacidade do tanque,\n" +
                    "ainda é possível abastecer: " + volumeDisponivel + " litros.");
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
