package tech.antoniosgarbi.exercicio2.model;

import tech.antoniosgarbi.exercicio2.interfaces.Imposto;

public class Livro extends Produto implements Imposto {
    private String autor;
    private String tema;
    private int qtdPag;

    public Livro() { }

    public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

    @Override
    public double calcularImposto() {
        double imposto = 0;
        if(tema.equals("educativo")) {
            System.out.println("Livro educativo não tem imposto: " + getNome());
        } else {
            imposto = getPreco() * 0.25;
            System.out.printf("R$ %.2f de impostos sobre o livro Senhor dos Anéis\n", imposto);
        }
        return imposto;
    }

    @Override
    public String toString() {
        return "Titulo: " + getNome() +
                ", preço: " + getPreco() +
                ", quantidade: " + getQtdPag() +
                " em estoque";
    }
}
