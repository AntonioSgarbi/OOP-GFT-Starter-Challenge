package tech.antoniosgarbi.exercicio3.model;

import java.util.List;

public class Guerreiro extends Personagem {
    private List<String> habilidades;

    public Guerreiro() {
    }

    public Guerreiro(String nome, int vida, int mana, int xp, int inteligencia, int forca, int level, List<String> habilidades) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.habilidades = habilidades;
    }

    @Override
    public void lvlUp() {
        int xpAtual = getXp();
        setXp((int) (xpAtual * 1.10));

        int manaAtual = getMana();
        int inteligenciaAtual = getInteligencia();

        setMana(manaAtual * 2);
        setInteligencia(inteligenciaAtual * 2);

        int vidaAtual = getVida();
        int forcaAtual = getForca();

        setVida(vidaAtual * 3);
        setForca(forcaAtual * 3);

        int levelAtual = getLevel();
        setLevel(levelAtual + 1);
    }

    public void attack() {
        long forcaDoAttack = (long) getForca() * getLevel() + Personagem.getRandom().nextInt(0, 300);
        System.out.println("Ataque realizado -- força: " + forcaDoAttack);
    }

    public void aprenderHabilidade(String habilidade) {
        System.out.println("Habilidade liberada: " + habilidade);
        this.habilidades.add(habilidade);
        System.out.println("Habilidades disponíveis: " + this.habilidades);
    }

}
