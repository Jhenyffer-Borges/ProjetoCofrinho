package Uninter;


public class Real extends Moeda {

    public Real(double princValor) {
        this.valor = princValor;
    }

    @Override
    public void info() {
        System.out.println("Real - " + this.valor);
    }

    @Override
    public double converter() {
        return this.valor;

    }
    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Real objDeReal = (Real) obj;

        if (this.valor != objDeReal.valor) {
            return false;
        }
        return true;
    }
}
