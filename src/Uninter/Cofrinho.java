package Uninter;

import java.util.ArrayList;

public class Cofrinho {
    private final ArrayList<Moeda> listaMoedas;

    // Construtor para inicializar o cofrinho com uma lista vazia de moedas
    public Cofrinho() {

        this.listaMoedas = new ArrayList<>();
    }

    // Método para adicionar uma moeda ao cofrinho
    public void adicionar(Moeda moeda) {

        this.listaMoedas.add(moeda);
    }

    // Método para remover uma moeda do cofrinho
    public void remover(Moeda moeda) {

        this.listaMoedas.remove(moeda);
    }

    // Método para listar todas as moedas no cofrinho
    public void listagemMoedas() {
        // Verifica se o cofrinho está vazio antes de listar as moedas
        if (this.listaMoedas.isEmpty()) {
            System.out.println("Não há moedas no cofrinho!");
            return;
        }

        for (Moeda moeda : this.listaMoedas) {
            moeda.info();
        }
    }


    // Método para calcular o valor total das moedas em uma unidade padrão
    public double totalConvertido() {
        if (this.listaMoedas.isEmpty()) {
            return 0;
        }

        double valorAcumulado = 0;

        // Itera sobre todas as moedas no cofrinho para calcular o valor total convertido
        for (Moeda moeda : this.listaMoedas) {
            valorAcumulado += moeda.converter();
        }

        return valorAcumulado;
    }
}
