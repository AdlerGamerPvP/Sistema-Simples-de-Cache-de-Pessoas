public class Pessoa {
    private String nome;
    private Integer id;
    private Integer idade;


    public Pessoa(String nome, Integer id, Integer idade){
        this.nome = nome;
        this.id = id;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", idade=" + idade +
                '}';
    }

    public Integer getId() {
        return id;
    }
}
