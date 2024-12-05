package trabalhoUNINTER;

import java.util.ArrayList;

//A classe principal onde tudo acontece. É tipo o "cérebro" do programa que conecta as peças.
public class Cofrinho {
    private ArrayList<Moeda> moedas;

    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    // Método para adicionar moedas ao cofrinho
    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    // Método para remover moedas do cofrinho com base em valor e tipo
    public void removerMoedaPorValorETipo(double valor, String tipo) {
        boolean moedaRemovida = false; // Flag para indicar se a moeda foi removida

        // Percorrer as moedas para encontrar a moeda que deve ser removida
        for (int i = 0; i < moedas.size(); i++) {
            Moeda moeda = moedas.get(i);

            // Comparação de valores com uma margem de erro mais ampla (para 2 casas decimais)
            if (Math.abs(moeda.getValor() - valor) < 0.05 && tipo.equalsIgnoreCase(moeda.getClass().getSimpleName())) {
                moedas.remove(i); // Remove a moeda
                System.out.println("Moeda removida: " + moeda.getDescricao());
                moedaRemovida = true;
                break; // Interrompe o loop após a remoção
            }
        }

        // Mensagem caso a moeda não seja encontrada
        if (!moedaRemovida) {
            System.out.println("Moeda não encontrada no cofrinho.");
        }
    }

    // Método para listar todas as moedas no cofrinho
    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
        } else {
            for (Moeda moeda : moedas) {
                System.out.println(moeda.getDescricao());
            }
        }
    }

    // Método para calcular o total de moedas em reais
    public double calcularTotalEmReais() {
        double total = 0.0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }
}
