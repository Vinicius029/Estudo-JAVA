package cursoemvideo.poo.controle;

public class ControleMain {
    public static void main(String[] args) {

        ControleRemoto c = new ControleRemoto();

        c.ligar();
        c.maisVolume();
        c.ligarMudo();
        c.abrirMenu();
        c.desligarMudo();
        c.desligar();
        c.menosVolume();
        c.abrirMenu();
    }
}
