package exercicio1.maincalculadora;

import exercicio1.logicacalculadora.LogicaCalculadora;

public class Calculadora {
    public static void main(String[] args) throws Exception {

        LogicaCalculadora calc = new LogicaCalculadora();
        calc.setA(3);
        calc.setB(2);
        calc.setOperador("+");
        System.out.println(calc.operar());
    }
}
