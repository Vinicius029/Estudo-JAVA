package cursoemvideo.poo.banco;

public class Cliente {

    public static void main(String[] args) {

        Banco cliente = new Banco();

        cliente.numConta = 289035;

        cliente.abrirConta("cc");
        cliente.pagarMensal();

        System.out.println(cliente.getSaldo());

    }


}
