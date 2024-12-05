package trabalhoUNINTER;

import java.util.Scanner;

// A classe principal onde tudo acontece. É tipo o "cérebro" do programa que conecta as peças.
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner pra capturar as escolhas do usuário.
        Cofrinho cofrinho = new Cofrinho(); // Nosso glorioso cofrinho que vai guardar as moedas.
        int opcao; // Variável pra armazenar o que o usuário quer fazer.

        do {
            // Mostrando o menu. Clássico "aperte 1, 2, 3...".
            System.out.println("\nMenu do Cofrinho:");
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover Moeda");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Calcular Total em Reais");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            // Aqui vem a mágica: o switch decide o que fazer com base na opção do usuário.
            switch (opcao) {
                case 1:
                    System.out.println("Escolha a moeda: 1- Dólar, 2- Euro, 3- Real");
                    int tipoMoeda = scanner.nextInt(); // Qual moeda o usuário quer adicionar?
                    System.out.print("Informe o valor: ");
                    double valor = scanner.nextDouble(); // E qual é o valor dessa moeda?

                    // Dependendo da escolha, criamos uma moeda e jogamos ela no cofrinho.
                    if (tipoMoeda == 1) {
                        cofrinho.adicionarMoeda(new Dolar(valor)); // Um dólar fresquinho.
                    } else if (tipoMoeda == 2) {
                        cofrinho.adicionarMoeda(new Euro(valor)); // Um euro de respeito.
                    } else if (tipoMoeda == 3) {
                        cofrinho.adicionarMoeda(new Real(valor)); // Moeda da casa: o Real.
                    } else {
                        System.out.println("Opção inválida!"); // Ops, digitou coisa errada.
                    }
                    break;

                case 2:
                    System.out.println("Escolha o tipo da moeda para remover: Dolar, Euro ou Real");
                    String tipoMoedaRemover = scanner.next(); // Que tipo de moeda remover?
                    System.out.print("Informe o valor da moeda a ser removida: ");
                    double valorMoedaRemover = scanner.nextDouble(); // Qual valor?
                    cofrinho.removerMoedaPorValorETipo(valorMoedaRemover, tipoMoedaRemover); 
                    // Remove a moeda combinando tipo e valor.
                    break;

                case 3:
                    // Listar todas as moedas. Hora de ver o que está dentro do cofrinho.
                    cofrinho.listarMoedas();
                    break;

                case 4:
                    // Calcula tudo que tem no cofrinho em reais. Conversão inclusa.
                    double total = cofrinho.calcularTotalEmReais();
                    System.out.println("Total no cofrinho em reais: " + total); // Olha aí o saldo final!
                    break;

                case 0:
                    // O usuário quer sair. Até mais!
                    System.out.println("Saindo...");
                    break;

                default:
                    // Algo deu errado na escolha. Mensagem de erro padrão.
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0); // Continua até o usuário mandar sair (opção 0).

        scanner.close(); // Fechando o scanner bonitinho.
    }
}
