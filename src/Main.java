import Financeiro.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cofrinho cofre = new Cofrinho();
        Moeda moeda = null;
        int opcao;
        int opcaoMoeda = 0;
        double valor;
        String tipo;

        // chamado para exibição do menu
        cofre.menuCofrinho();
        opcao = scanner.nextInt();

        // opcao digitada pelo usuario
        while(opcao != 0) {

            // reiniciando a variável opcaoMoeda
            opcaoMoeda = 0;

            switch (opcao) {
                case 1:
                    System.out.println("Opção 1 selecionada: Adicionar Moedas");
                    while(opcaoMoeda > 3 || opcaoMoeda == 0) {
                        Moeda.manuMoeda();
                        opcaoMoeda = scanner.nextInt();
                    }

                    if(opcaoMoeda == 1) {
                        System.out.println("Digite o valor a ser adicionado: ");
                        valor = scanner.nextDouble();
                        tipo = "Dolar";
                        moeda = new Dolar(valor, tipo);
                    } else if (opcaoMoeda == 2) {
                        System.out.println("Digite o valor a ser adicionado: ");
                        valor = scanner.nextDouble();
                        tipo = "Euro";
                        moeda = new Euro(valor, tipo);
                    } else if (opcaoMoeda == 3) {
                        System.out.println("Digite o valor a ser adicionado: ");
                        valor = scanner.nextDouble();
                        tipo = "Real";
                        moeda = new Real(valor, tipo);
                    }

                    cofre.adicionar(moeda);
                    break;

                case 2:
                    System.out.println("Opção 2 selecionada: Remover Moedas");
                    while(opcaoMoeda > 3 || opcaoMoeda == 0) {
                        Moeda.manuMoeda();
                        opcaoMoeda = scanner.nextInt();
                    }

                    if (opcaoMoeda == 1) {
                        System.out.println("Digite o valor a ser removido: ");
                        valor = scanner.nextDouble();
                        tipo = "Dolar";
                        moeda = new Dolar(valor, tipo);
                    } else if(opcaoMoeda == 2) {
                        System.out.println("Digite o valor a ser removido: ");
                        valor = scanner.nextDouble();
                        tipo = "Euro";
                        moeda = new Euro(valor, tipo);
                    } else if (opcaoMoeda == 3){
                        System.out.println("Digite o valor a ser removido: ");
                        valor = scanner.nextDouble();
                        tipo = "Real";
                        moeda = new Real(valor, tipo);
                    }

                    cofre.remover(moeda);
                    break;

                case 3:
                    System.out.println("Opção 3 selecionada: Listar Moedas");
                    cofre.listar();
                    break;

                case 4:
                    System.out.println("Opção 4 selecionada: Mostrar total do valor em Real");
                    cofre.totalConvertido();
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

            // mostrar menu novamente
            cofre.menuCofrinho();
            opcao = scanner.nextInt();
        }

        scanner.close();
    }
}
