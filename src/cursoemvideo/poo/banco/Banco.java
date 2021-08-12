package cursoemvideo.poo.banco;

public class Banco {
    public int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public Banco(){
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if(t == "cc"){
            this.saldo = 50;
        }else if(t == "cp"){
            setSaldo(150);
        }
    }

    public void fecharConta(){
        if(this.saldo > 0){
            System.out.println("Conta esta com dinheiro");
        }else if(this.saldo < 0){
            System.out.println("Conta em débito");
        }else{
            this.status = false;
            System.out.println("Conta fechada");
        }
    }

    public void depositar(double v){
        if(this.status == true){
            setSaldo(v);
        }else{
            System.out.println("Não pode fazer deposito com conta fechada");
        }
    }

    public void sacar(double v){
        if(this.status == true){
            if(this.saldo >= v){
                this.saldo -= v;
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel sacar");
        }
    }

    public void pagarMensal(){
        double v = 0;
        if(this.tipo == "cc"){
            v = 12;
        }else if( this.tipo == "cp"){
            v = 20;
        }
        if(this.status == true){
            if(this.saldo > v){
                this.saldo -= v;
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel pagar");
        }
    }

    public void setNumConta(int n){
        this.numConta = n;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setDono(String d){
        this.tipo = d;
    }

    public String getDono(){
        return this.dono;
    }

    public void setSaldo(double s){
        this.saldo += s;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean s){
        this.status = s;
    }

    public boolean getStatus(){
        return this.status;
    }



}
