package atividade6;

public class Atendente extends Funcionario {
    public Atendente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        // Atendentes não têm bônus, o salário é o mesmo que o salário base
        return super.calcularSalario();
    }
}