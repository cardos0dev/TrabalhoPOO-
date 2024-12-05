package trabalhoUNINTER;

// A classe Real herda de Moeda, porque sim, real é uma moeda (faz todo sentido né?).
public class Real extends Moeda {

    // Constructor que recebe o valor da moeda. Ele chama o constructor da mãe (super) pra configurar isso.
    public Real(double valor) {
        super(valor); // "super" é tipo aquele amigo que resolve tudo com a mãe antes de seguir a vida.
    }

    // Aqui é um método que converte a moeda pra reais.
    // Como já estamos falando de reais, o método só devolve o valor mesmo.
    @Override
    public double converterParaReal() {
        return valor; // Nada pra converter aqui, o valor já tá em casa.
    }

    // Esse método aqui é só pra deixar a moeda bonitona com uma descrição.
    @Override
    public String getDescricao() {
        return "Real: " + valor; // Basicamente, só fala "Oi, sou um Real e valho X".
    }
}
