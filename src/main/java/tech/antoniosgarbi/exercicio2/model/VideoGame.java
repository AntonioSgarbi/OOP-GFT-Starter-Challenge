package tech.antoniosgarbi.exercicio2.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import tech.antoniosgarbi.exercicio2.interfaces.Imposto;

@Data
@NoArgsConstructor
public class VideoGame extends Produto implements Imposto {
    private String marca;
    private String modelo;
    private boolean isUsado;

    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    @Override
    public double calcularImposto() {
        double imposto = 0;
        if(isUsado) {
            imposto = getPreco() * 0.25;
            System.out.printf("Imposto do " + getNome() + " usado, %.2f\n", imposto);
        } else {
            imposto = getPreco() * 0.25;
            System.out.printf("Imposto do " + getNome() + ", %.2f\n", imposto);
        }
        return imposto;
    }

    @Override
    public String toString() {
        return "Video-game: " + this.getNome() +
                ", preço: " + this.getPreco() +
                ", quantidade: " + this.getQtd() +
                " em estoque.";
    }
}
