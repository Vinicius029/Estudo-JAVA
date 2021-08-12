package cursoemvideo.poo;

public class MainCaneta {
    public static void main(String[] args) {

        Caneta c1 = new Caneta("Bic", "Amarelo", 0.5);

        c1.status();

        Caneta c2 = new Caneta("Bic02","Vermelho", 0.7);
        c2.status();
    }
}
