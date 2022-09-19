package tech.antoniosgarbi.exercicio3.main;

import tech.antoniosgarbi.exercicio3.model.Guerreiro;
import tech.antoniosgarbi.exercicio3.model.Mago;
import tech.antoniosgarbi.exercicio3.model.Personagem;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("\n\nExercicio 3\n");
        Guerreiro guerreiro = new Guerreiro("Guerreiro", 20,10,10,10,20,1, new ArrayList<>());
        Mago mago = new Mago("Mago", 10,20,10,20,10,1, new ArrayList<>());

        System.out.println("\nguerreiro.aprenderHabilidade(\"arco e flecha\")");
        guerreiro.aprenderHabilidade("arco e flecha");
        System.out.println("\nmago.aprenderMagia(\"trovão\")");
        mago.aprenderMagia("\ntrovão");

        System.out.println("\nguerreiro.attack()");
        guerreiro.attack();
        System.out.println("\nmago.attack();");
        mago.attack();

        System.out.println("\nguerreiro.lvlUp()");
        guerreiro.lvlUp();
        System.out.println("\nmago.lvlUp()");
        mago.lvlUp();

        System.out.println("\nA quantidade de personagens criados é: " + Personagem.quantidadePersonagens);
    }

}
