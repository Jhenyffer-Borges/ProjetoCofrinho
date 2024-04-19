package Uninter;

public class Euro extends Moeda {

    public Euro(double valorIni) {//construtor do Dolar
        this.valor = valorIni;
    }
    @Override
    public void info() {
        System.out.println("Euro - " + valor);
    }

    @Override //Utilizando o metodo converter para que não precise multiplicar a moeda, o metodo já identifica o valor que inseri retornando usando o this.valor para identificar e mostrar para o usuario o valor em real que ele possui
    public double converter() {
        return this.valor * 5.39;

    }
    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Euro objDeEuro = (Euro) obj;

        if (this.valor != objDeEuro.valor) {
            return false;
        }
        return true;
    }
}