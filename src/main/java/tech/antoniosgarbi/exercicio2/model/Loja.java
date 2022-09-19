package tech.antoniosgarbi.exercicio2.model;

import java.util.List;

public class Loja {
    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGames;

    public Loja() { }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public void listaLivros() {
        if(this.livros.isEmpty()) {
            System.out.println("A loja não tem livros no seu estoque.\n");
        } else {
            System.out.println("A loja " + this.nome + " possui estes livros para venda:\n");
            for(Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    public void listaVideoGames() {
        if(this.videoGames.isEmpty()) {
            System.out.println("A loja não tem video-games no seu estoque\n");
        } else {
            System.out.println("A loja " + this.nome + ", possui estes video-games para venda: \n");
            for(VideoGame videoGame : this.videoGames) {
                System.out.println(videoGame);
            }

        }
    }

    public double calculaPatrimonio() {
        double patrimonio = 0;
        for(Livro livro : this.livros) {
            patrimonio += (livro.getPreco() * livro.getQtd());
        }
        for (VideoGame videoGame : this.videoGames) {
            patrimonio += (videoGame.getPreco() * videoGame.getQtd());
        }
        System.out.printf("O patrimonio da loja: %s é de R$%.2f", this.nome, patrimonio);
        return patrimonio;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return this.livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return this.videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

}
