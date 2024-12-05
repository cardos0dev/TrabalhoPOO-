package trabalhoUNINTER;

// Essa classe é a "irmã" do Dólar, mas representa o Euro, que também é uma moeda.
public class Euro extends Moeda {

    // Construtor que recebe o valor em euros e manda isso pra classe mãe (Moeda).
    public Euro(double valor) {
        super(valor); // Basicamente diz pra mãe: "Tá aqui o valor desse euro".
    }

    // Método que converte o valor de euros pra reais.
    @Override
    public double converterParaReal() {
        return valor * 6.0; // Taxa de câmbio fixa, estilo "faz de conta".
        // Na vida real, isso também seria puxado de uma API de câmbio.
    }

    // Método pra descrever o euro e seu valor.
    @Override
    public String getDescricao() {
        return "Euro: " + valor; // Algo tipo: "Olá, sou um Euro e valho Y".
    }
}
