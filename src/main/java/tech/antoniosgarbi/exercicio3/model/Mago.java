package tech.antoniosgarbi.exercicio3.model;

import java.util.List;

public class Mago extends Personagem {
    private List<String> magias;

    public Mago() {
    }

    public Mago(String nome, int vida, int mana, int xp, int inteligencia, int forca, int level, List<String> magias) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.magias = magias;
    }

    @Override
    public void lvlUp() {
        int xpAtual = getXp();
        setXp((int) (xpAtual * 1.10));

        int manaAtual = getMana();
        int inteligenciaAtual = getInteligencia();

        setMana(manaAtual * 3);
        setInteligencia(inteligenciaAtual * 3);

        int vidaAtual = getVida();
        int forcaAtual = getForca();

        setVida(vidaAtual * 2);
        setForca(forcaAtual * 2);

        int levelAtual = getLevel();
        setLevel(levelAtual + 1);
    }

    public void attack() {
        long forcaDoAttack = (long) getInteligencia() * getLevel() + Personagem.getRandom().nextInt(0, 300);
        System.out.println("Ataque realizado -- força: " + forcaDoAttack);
    }

    public void aprenderMagia(String magia) {
        System.out.println("Magia liberada: " + magia);
        magias.add(magia);
        System.out.println("Magias disponíveis: " + magias);
    }

    public List<String> getMagias() {
        return magias;
    }

    public void setMagias(List<String> magias) {
        this.magias = magias;
    }
}
