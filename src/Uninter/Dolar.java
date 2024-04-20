package Uninter;

public class Dolar extends Moeda {
    public Dolar(double valorIni) {
        this.valor = valorIni;
    }

    @Override
    public void info() {
        // Mostra a informação sobre o dólar no console
        System.out.println("Dólar - " + valor);  // Exibe o tipo da moeda e seu valor
    }

    @Override
    public double converter() {
        return this.valor * 5.38;
    }

    @Override
    public boolean equals(Object obj) {
        // Verifica se o objeto passado é da mesma classe
        if (this.getClass() != obj.getClass()) {
            return false;  // Se não for da mesma classe, retorna false
        }

        // Faz o casting para a classe Dolar
        Dolar objDeDolar = (Dolar) obj;  // Converte o objeto para o tipo Dolar

        // Compara os valores para determinar se são iguais
        return this.valor == objDeDolar.valor;  // Retorna true se os valores forem iguais, senão retorna false
    }
}
