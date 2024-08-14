//Encapsular a classse Cidade,
//implementar construtor e métodos getter
public class Cidade {
    private String nome;
    private String cep;
    private Integer populacao;
    private Estado estado;

    public Cidade(String nome, String cep, Integer populacao, Estado estado) {
        this.nome = nome;
        this.cep = cep;
        this.populacao = populacao;
        this.estado = estado;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCep(){
        return this.cep;
    }

    public Integer getPopulacao(){
        return this.populacao;
    }

    public Estado getEstado(){
        return this.estado;
    }
}
