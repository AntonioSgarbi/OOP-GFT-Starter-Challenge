package tech.antoniosgarbi.exercicio7.model;

public class Supervisor extends Funcionario {

    public Supervisor() {
    }

    public Supervisor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double bonificacao() {
        return getSalario() + 5000.00;
    }
}