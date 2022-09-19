package tech.antoniosgarbi.exercicio7;

import tech.antoniosgarbi.exercicio7.model.Gerente;
import tech.antoniosgarbi.exercicio7.model.Supervisor;
import tech.antoniosgarbi.exercicio7.model.Vendedor;

public class Exercicio7 {
    public static void main(String[] args) {
        System.out.println("\n\nExercicio 7\n");
        Gerente gerente = new Gerente("Gerente", 35, 8000.00);
        Supervisor supervisor = new Supervisor("Supervisor", 30, 4000.00);
        Vendedor vendedor = new Vendedor("Vendedor", 25, 2000.00);

        System.out.println("A bonificação do gerente é: " + gerente.bonificacao());
        System.out.println("A bonificação do supervisor é: " + supervisor.bonificacao());
        System.out.println("A bonificação do vendedor é: " + vendedor.bonificacao());

    }




}
