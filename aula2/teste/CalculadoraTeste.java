package aula2.teste;

import aula2.revisao.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) throws Exception {

        Calculadora calc = new Calculadora();
        calc.setA(3);
        calc.setB(2);
        calc.setOperador("+");
        System.out.println(calc.operar());

    }
}
