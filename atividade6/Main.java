package atividade6;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Alice", 5000.0, "TI");
        Programador programador = new Programador("Bob", 3000.0, "Java");
        Atendente atendente = new Atendente("Carol", 2500.0);

        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("Departamento: " + gerente.getDepartamento());
        System.out.println("Salário: " + gerente.calcularSalario());

        System.out.println();

        System.out.println("Programador: " + programador.getNome());
        System.out.println("Linguagem: " + programador.getLinguagem());
        System.out.println("Salário: " + programador.calcularSalario());

        System.out.println();

        System.out.println("Atendente: " + atendente.getNome());
        System.out.println("Salário: " + atendente.calcularSalario());
    }
}