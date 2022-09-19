package tech.antoniosgarbi.exercicio7.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public double bonificacao() {
        return this.salario;
    }

}
