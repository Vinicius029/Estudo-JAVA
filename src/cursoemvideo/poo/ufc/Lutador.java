package cursoemvideo.poo.ufc;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double peso;
    private double altura;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empate;
    private String linha = "\033[1;30m---------------------------------\033[m";

    public Lutador(String n, String nal,
                   int i, double p,
                   double al,
                   int v, int d, int e) {
        this.nome = n;
        this.nacionalidade = nal;
        this.idade = i;
        setPeso(p);
        this.altura = al;
        this.vitorias = v;
        this.derrotas = d;
        this.empate = e;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    private void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public double getAltura() {
        return altura;
    }

    private void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Invalido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Medio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpate() {
        return empate;
    }

    private void setEmpate(int empate) {
        this.empate = empate;
    }

    public void apresentar(){
        System.out.println(linha);
        System.out.printf("\033[1;34mNome: %s \n", this.nome);
        System.out.printf("Nacionalidade: %s \n", this.nacionalidade);
        System.out.printf("Idade: %d \n", this.idade);
        System.out.printf("Peso: %.1f \n", this.peso);
        System.out.printf("Altura: %.1f \n", this.altura);
        System.out.printf("Categoria: %s \n", this.categoria);
        System.out.printf("Vitorias: %d \n", this.vitorias);
        System.out.printf("Derrotas: %d \n", this.derrotas);
        System.out.printf("Empate: %d \033[m\n", this.empate);
        System.out.println(linha
        );
    }

    public void status(){
        System.out.println(linha);
        System.out.println("\033[1;33mLutador " + this.nome);
        System.out.printf("Vitorias: %d \n", this.vitorias);
        System.out.printf("Derrotas: %d \n", this.derrotas);
        System.out.printf("Empate: %d \033[m\n", this.empate);
        System.out.println(linha);
    }

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        setVitorias(getDerrotas() + 1);
    }

    public void empatarLuta(){
        setEmpate(getEmpate() + 1);
    }
}
