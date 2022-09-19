package tech.antoniosgarbi.exercicio4e5e6;

import java.util.ArrayList;
import java.util.List;

public class Exercicio456 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 15);
        Pessoa p2 = new Pessoa("Leandro", 21);
        Pessoa p3 = new Pessoa("Paulo", 17);
        Pessoa p4 = new Pessoa("Jessica", 18);

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);

        //--------------------------------------------------------------------------------------------------------------

        System.out.println("\n\nExercício 4:\n");

        int maiorIdade = -1;
        Pessoa pessoaMaisVelha = new Pessoa();
        for(Pessoa pessoa : pessoas) {
            if(pessoa.getIdade() > maiorIdade) {
                pessoaMaisVelha = pessoa;
            }
        }
        System.out.println("A pessoa mais velha da lista é: " + pessoaMaisVelha.getNome());

        //--------------------------------------------------------------------------------------------------------------

        System.out.println("\n\nExercício 5:\n");

        int quantidadePessoasAntes = pessoas.size();
        List<Pessoa> pessoasMaiores = new ArrayList<>();

        for(Pessoa pessoa : pessoas) {
            if(pessoa.getIdade() >= 18) {
                pessoasMaiores.add(pessoa);
            }
        }
        int quantidadeMaiores = pessoasMaiores.size();
        System.out.println("Quantidade total de pessoas: " + quantidadePessoasAntes);
        System.out.println("Quantidade de maiores de idade: " + quantidadeMaiores);

        //--------------------------------------------------------------------------------------------------------------

        System.out.println("\n\nExercício 6:\n");

        for(Pessoa pessoa : pessoas) {
            if(pessoa.getNome().equals("Jessica")) {
                System.out.println("Jessica está na lista, sua idade é: " + pessoa.getNome());
            }
        }

    }
}
