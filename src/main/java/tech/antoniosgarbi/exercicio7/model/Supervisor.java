package tech.antoniosgarbi.exercicio7.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Supervisor extends Funcionario {

    public Supervisor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double bonificacao() {
        return getSalario() + 5000.00;
    }
}
