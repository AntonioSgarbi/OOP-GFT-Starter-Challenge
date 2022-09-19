package tech.antoniosgarbi.exercicio7.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Vendedor extends Funcionario {

    public Vendedor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double bonificacao() {
        return getSalario() + 3000.00;
    }
}
