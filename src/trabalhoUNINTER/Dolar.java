package trabalhoUNINTER;

// Essa classe representa o bom e velho Dólar, que também é uma moeda (herda de Moeda).
public class Dolar extends Moeda {

    // Construtor que recebe o valor em dólares e chama o construtor da mãe (Moeda).
    public Dolar(double valor) {
        super(valor); // Aqui estamos passando o valor pra classe mãe.
    }

    // Método que converte o valor de dólares pra reais.
    @Override
    public double converterParaReal() {
        return valor * 5.0; // Conversão usando uma taxa fixa (bem fake, mas tá valendo pro exemplo).
        // Se fosse pra vida real, esse valor seria dinâmico, pegando uma API de câmbio.
    }

    // Esse método devolve uma descrição fofinha do dólar com seu valor.
    @Override
    public String getDescricao() {
        return "Dólar: " + valor; // Algo como "Ei, sou um dólar e valho X".
    }
}
