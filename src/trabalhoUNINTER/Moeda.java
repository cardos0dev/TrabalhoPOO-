package trabalhoUNINTER;

// Essa é a classe mãe, a "base" de todas as moedas. Aqui fica o blueprint (molde) geral.
public abstract class Moeda {
    protected double valor; // Protegido porque só as filhas podem mexer nisso, sem exposição total.

    // Construtor que inicializa o valor da moeda.
    public Moeda(double valor) {
        this.valor = valor; // Guarda o valor da moeda. Simples e direto.
    }

    // Método abstrato que as subclasses (tipo Dolar, Euro, Real) precisam implementar.
    public abstract double converterParaReal(); 
    // A ideia é que cada moeda saiba como se transformar em reais.

    // Outro método abstrato pra cada moeda se descrever do seu jeitinho especial.
    public abstract String getDescricao();

    // Método comum pra pegar o valor da moeda. É igual pra todo mundo, então tá aqui mesmo.
    public double getValor() {
        return valor; // Só devolve o valor armazenado.
    }
}
