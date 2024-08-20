import java.util.List;

public class Loja {
    public String nome;
    public Cidade cidade;
    public List<Carro> estoque;

    public Loja(String nome, Cidade cidade, List<Carro> estoque) {
        this.nome = nome;
        this.cidade = cidade;
        this.estoque = estoque;
    }

}

/**
 * Criar uma classe chamada Cidade com os atributos de Cidade.
 */

