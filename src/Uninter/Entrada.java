package Uninter;

import java.util.Scanner;

import static java.time.temporal.TemporalAdjusters.next;

public class Entrada {

    private Scanner scan;
    private Cofrinho cofrinho;
    //Criando um construtor da classe Entrada, sem receber nenhum parametro
    public Entrada() {
    scan = new Scanner(System.in); //Para receber informações do usuário
    cofrinho = new Cofrinho();
    }
    public void exibirMEnuEntrada() {
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
                System.out.println("Escolha uma moeda:");
                System.out.println("1 - Real:");
                System.out.println("2 - Euro:");
                System.out.println("3 - Dólar:");

                int opcaoMoeda = scan.nextInt();
                System.out.println("Digite o Valor: ");
                String valorTxtMoeda = scan.next();
                valorTxtMoeda = valorTxtMoeda.replace(",",".");

                System.out.println("O valor da moeda é:" + valorTxtMoeda);



                exibirMEnuEntrada(); //chamando o metodo dentro dele mesmo
                break;
            default:
                System.out.println("Opção inálida. Tente novamente.");
                exibirMEnuEntrada();
                break;

        }
    }

}
