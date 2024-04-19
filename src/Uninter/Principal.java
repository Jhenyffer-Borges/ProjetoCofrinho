package Uninter;

import java.util.ArrayList;
import java.util.LinkedList;

public class Principal {
    public static void main(String[] args) {
        //Criando a variável entrada para exibir o Menu de Entrada
        Entrada entrada = new Entrada();
        entrada.exibirMEnuEntrada();

        Cofrinho cofrinho = new Cofrinho();
        cofrinho.listagemMoedas();
    }

}