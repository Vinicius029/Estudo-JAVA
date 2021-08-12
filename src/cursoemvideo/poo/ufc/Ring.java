package cursoemvideo.poo.ufc;

public class Ring {
    public static void main(String[] args) {

        String[] l = new String[5];

        

        Lutador lutador = new Lutador("Vinicius","Brasileiro",
                                    20,73.5,1.84,5,2,1);
        lutador.ganharLuta();
        lutador.status();
        lutador.apresentar();
    }
}
