package tech.antoniosgarbi.exercicio3;

import tech.antoniosgarbi.exercicio1.Veiculo;

import java.util.Comparator;

public class PessoaComparator implements Comparator<Veiculo> {
    @Override
    public int compare(Veiculo o1, Veiculo o2) {
        if(o1.getPreco() > o2.getPreco()) {
            return o1.getPreco().intValue();
        }
        return o2.getPreco().intValue();
    }
}
