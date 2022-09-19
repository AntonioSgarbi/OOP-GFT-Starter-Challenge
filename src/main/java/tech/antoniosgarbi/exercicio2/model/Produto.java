package tech.antoniosgarbi.exercicio2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Produto {
    private String nome;
    private double preco;
    private int qtd;

}
