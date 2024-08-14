import java.util.List;

public class Loja {
    private String nome;
    private Cidade cidade;
    private List<Carro> estoque;

    public Loja(String nome, Cidade cidade, List<Carro> estoque) {
        this.nome = nome;
        this.cidade = cidade;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public List<Carro> getEstoque() {
        return estoque;
    }
}



/**
 * Criar uma classe chamada Cidade com os atributos de Cidade.
 */