package cursoloiane.orientacao.objeto.pratica.encapsulamento.pessoa;

public class Pessoa {

    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobNome){
        this.nome = nome;
        this.sobrenome = sobNome;
    }

    public String getNome(){
        return this.nome;
    }

    public void mudaNome(String nome){
        this.nome = nome;
        getNome();
    }


}
