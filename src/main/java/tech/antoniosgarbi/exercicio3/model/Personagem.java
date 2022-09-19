package tech.antoniosgarbi.exercicio3.model;

import lombok.Data;

import java.util.Random;

@Data
public abstract class Personagem {
    private String nome;
    private int vida;
    private int mana;
    private int xp;
    private int inteligencia;
    private int forca;
    private int level;

    public static int quantidadePersonagens;

    public Personagem() {
        quantidadePersonagens++;
    }

    public Personagem(String nome, int vida, int mana, int xp, int inteligencia, int forca, int level) {
        quantidadePersonagens++;
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.xp = xp;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.level = level;
    }

    private static Random random = new Random();

    public abstract void lvlUp();

    public static Random getRandom() {
        return random;
    }
}
