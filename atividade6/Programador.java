package atividade6;

public class Programador extends Funcionario {
    private String linguagem;

    public Programador(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }
}