package Uninter;

import java.sql.SQLOutput;

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
}
