package tech.antoniosgarbi.exercicio3.model;

import java.util.Random;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public static Random getRandom() {
        return random;
    }
}
