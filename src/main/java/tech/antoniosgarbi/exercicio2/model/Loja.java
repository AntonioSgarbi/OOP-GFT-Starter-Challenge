package tech.antoniosgarbi.exercicio2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Loja {
    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGames;

    public void listaLivros() {
        if(this.livros.isEmpty()) {
            System.out.println("A loja não tem livros no seu estoque.\n");
        } else {
            System.out.println("A loja " + this.nome + " possui estes livros para venda:\n");
            this.livros.forEach(System.out::println);
        }
    }

    public void listaVideoGames() {
        if(this.videoGames.isEmpty()) {
            System.out.println("A loja não tem video-games no seu estoque\n");
        } else {
            System.out.println("A loja " + this.nome + ", possui estes video-games para venda: \n");
            this.videoGames.forEach(System.out::println);
        }
    }

    public double calculaPatrimonio() {
        double patrimonio = 0;

        patrimonio += livros.stream().mapToDouble(livro -> livro.getPreco() * livro.getQtd()).sum();

        patrimonio += videoGames.stream().mapToDouble(videoGame -> videoGame.getPreco() * videoGame.getQtd()).sum();

        System.out.printf("O patrimonio da loja: %s é de R$%.2f", this.nome, patrimonio);
        return patrimonio;
    }


}
