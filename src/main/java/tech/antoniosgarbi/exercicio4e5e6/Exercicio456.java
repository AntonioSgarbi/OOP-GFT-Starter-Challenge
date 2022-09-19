package tech.antoniosgarbi.exercicio4e5e6;

import java.util.ArrayList;
import java.util.Comparator;
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

        pessoas.stream().max(Comparator.comparingInt(Pessoa::getIdade))
                .ifPresent(maisVelho -> System.out.println("A pessoa mais velha da lista é: " + maisVelho.getNome()));

        //--------------------------------------------------------------------------------------------------------------

        System.out.println("\n\nExercício 5:\n");

        int quantidadePessoasAntes = pessoas.size();
        List<Pessoa> pessoasMaiores = pessoas.stream().filter(pessoa -> pessoa.getIdade() >= 18).toList();

        int quantidadeMaiores = pessoasMaiores.size();
        System.out.println("Quantidade total de pessoas: " + quantidadePessoasAntes);
        System.out.println("Quantidade de maiores de idade: " + quantidadeMaiores);

        //--------------------------------------------------------------------------------------------------------------

        System.out.println("\n\nExercício 6:\n");

        pessoas.forEach(pessoa -> {
            if(pessoa.getNome().equals("Jessica"))
                System.out.println("Jessica está na lista, sua idade é: " + pessoa.getIdade());

        });
    }
}
