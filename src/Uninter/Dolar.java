package Uninter;

public class Dolar extends Moeda {

    public Dolar(double valorIni) {//construtor do Dolar
        this.valor = valorIni;
    }
    @Override
    public void info() {
        System.out.println("Dolar - " + valor);
    }

    @Override //Utilizando o metodo converter para que não precise multiplicar a moeda, o metodo já identifica o valor que inseri retornando usando o this.valor para identificar e mostrar para o usuario o valor em real que ele possui
    public double converter() {
        return this.valor * 5.38;

    }
}