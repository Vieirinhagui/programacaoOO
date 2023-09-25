package atividade6;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    @Override
    public double calcularSalario() {
        // Gerentes recebem um bônus de 20% sobre o salário base
        return super.calcularSalario() * 1.2;
    }

    public String getDepartamento() {
        return departamento;
    }
}