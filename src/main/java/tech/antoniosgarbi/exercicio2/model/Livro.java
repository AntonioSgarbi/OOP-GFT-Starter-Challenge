package tech.antoniosgarbi.exercicio2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.antoniosgarbi.exercicio2.interfaces.Imposto;

@Data
@NoArgsConstructor
public class Livro extends Produto implements Imposto {
    private String autor;
    private String tema;
    private int qtdPag;

    public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }

    @Override
    public double calcularImposto() {
        double imposto = 0;
        if(this.tema.equals("educativo")) {
            System.out.println("Livro educativo não tem imposto: " + getNome());
        } else {
            imposto = getPreco() * 0.25;
            System.out.printf("R$ %.2f de impostos sobre o livro Senhor dos Anéis\n", imposto);
        }
        return imposto;
    }

    @Override
    public String toString() {
        return "Titulo: " + this.getNome() +
                ", preço: " + this.getPreco() +
                ", quantidade: " + this.getQtdPag() +
                " em estoque";
    }
}
