package Uninter;

import java.util.Scanner;

public class Entrada {

    private Scanner scan;
    private Cofrinho cofrinho;
    //Criando um construtor da classe Entrada, sem receber nenhum parametro
    public Entrada() {
    scan = new Scanner(System.in); //Para receber informações do usuário
    cofrinho = new Cofrinho();
    }
    public void exibirMenuEntrada() {
        //Criando um menu de Entrada
        System.out.println("---Cofrinho---");
        System.out.println("1 - Adicionar Moeda");
        System.out.println("2 - Remover Moeda");
        System.out.println("3 - Listar moedas");
        System.out.println("4 - Calcular total convertido para Real ");
        System.out.println("0 - Encerrar");

        String escolhido =  scan.next(); //criando uma variável para aparecer a opção escolhida do usuário, guardando valor.
        System.out.println(escolhido);

        switch (escolhido) {
            case "0":
                System.out.println("Sistema Encerrado");
                break;

            case "1":
                exibirSubmenuAddMoedas();
                exibirMenuEntrada();
                break;

            case "2":
                exibirSubmenuRemoverMoedas();
                exibirMenuEntrada();
                break;

            case "3":
                cofrinho.listagemMoedas();
                exibirMenuEntrada();
                break;

            case "4":
                double valorTotalConvertido = cofrinho.totalConvertido();
                String valorTotalConvertidoTxt = String.format("%.2f", valorTotalConvertido);
                valorTotalConvertidoTxt = valorTotalConvertidoTxt.replace(".", ",");
                System.out.println("Total convertido para real: " + valorTotalConvertidoTxt);
                exibirMenuEntrada();
                break;

            default:
                System.out.println("Opção inálida. Tente novamente.");
                exibirMenuEntrada();
                break;
        }
    }

    private void exibirSubmenuAddMoedas() {
        System.out.println("Escolha uma moeda:");
        System.out.println("1 - Real:");
        System.out.println("2 - Euro:");
        System.out.println("3 - Dólar:");

        int opcaoMoeda = scan.nextInt();
        System.out.println("Digite o Valor: ");
        String valorTxtMoeda = scan.next();
        valorTxtMoeda = valorTxtMoeda.replace(",", ".");

        double valorMoeda = Double.parseDouble(valorTxtMoeda);

        Moeda moeda = null;

        if (opcaoMoeda == 1) {
            moeda = new Real(valorMoeda);
        } else if (opcaoMoeda == 2) {
            moeda = new Dolar(valorMoeda);
        } else if (opcaoMoeda == 3) {
            moeda = new Euro(valorMoeda);
        } else {
            System.out.println("Moeda Inexistente");
            exibirMenuEntrada();
        }

        cofrinho.adicionar(moeda);
        System.out.println("Moeda adicionada com sucesso!");
        System.out.println("Valor da moeda Adicionada: " + moeda.converter());

    }
    private void exibirSubmenuRemoverMoedas() {
        System.out.println("Escolha uma moeda:");
        System.out.println("1 - Real:");
        System.out.println("2 - Euro:");
        System.out.println("3 - Dólar:");

        int opcaoMoeda = scan.nextInt();
        System.out.println("Digite o Valor: ");
        String valorTxtMoeda = scan.next();
        valorTxtMoeda = valorTxtMoeda.replace(",", ".");

        double valorMoeda = Double.parseDouble(valorTxtMoeda);

        Moeda moeda = null;

        if (opcaoMoeda == 1) {
            moeda = new Real(valorMoeda);
        } else if (opcaoMoeda == 2) {
            moeda = new Dolar(valorMoeda);
        } else if (opcaoMoeda == 3) {
            moeda = new Euro(valorMoeda);
        } else {
            System.out.println("Moeda Inexistente");
            exibirMenuEntrada();
        }

        cofrinho.remover(moeda);
    }
}
