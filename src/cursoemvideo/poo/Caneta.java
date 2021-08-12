package cursoemvideo.poo;

public class Caneta {

    public String modelo;
    public String cor;
    private  double ponta;
    protected int carga;
    protected boolean tampada;

    public Caneta(String m, String c, double p){// METODO CONSTRUTOR
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERROR! Não posso rabiscar");
        }else{
            System.out.println("Rabiscando...");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getCor(){
        return this.cor;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public void setCor(String c){
        this.cor = c;
    }




}
