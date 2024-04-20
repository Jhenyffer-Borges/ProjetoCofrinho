package Uninter;

import java.util.ArrayList;
import java.util.LinkedList;

public class Principal {
    public static void main(String[] args) {
        // Criando a instância de Entrada para exibir o menu inicial
        Entrada entrada = new Entrada();

        // Exibe o menu de entrada para que o usuário interaja
        entrada.exibirMenuEntrada();

        // Criando uma instância de Cofrinho
        Cofrinho cofrinho = new Cofrinho();

        // Listagem das moedas no cofrinho, para mostrar o que foi adicionado até agora
        cofrinho.listagemMoedas();
    }
}
