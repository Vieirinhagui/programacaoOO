package exercicio1.logicacalculadora;

public class LogicaCalculadora {
    private Integer a;
    private Integer b;
    private String operador;

    public Integer getA() {
        return this.a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return this.b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public String getOperador() {
        return this.operador;
    }

    public void setOperador(String op) throws Exception {
        Boolean err = true;
        switch (op) {
            case "+":
                err = false;
                break;
            case "-":
                err = false;
                break;
            case "*":
                err = false;
                break;
            case "/":
                err = false;
                break;

            default:
                err = true;
                break;
        }
        if (err) {
            throw new Exception("Operador invalido!");
        }
        this.operador = op;
    }

    public Integer operar() {
        Integer ret = 0;
        switch (this.operador) {
            case "+":
                ret = this.a + this.b;
                break;
            case "-":
                ret = this.a - this.b;
                break;
            case "*":
                ret = this.a * this.b;
                break;
            case "/":
                ret = this.a / this.b;
                break;
        }
        return ret;
    }
}
