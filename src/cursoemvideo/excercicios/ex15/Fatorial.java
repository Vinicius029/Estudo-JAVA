package cursoemvideo.excercicios.ex15;

public class Fatorial {
    public static void main(String[] args) {

        CalculaFatorial fat = new CalculaFatorial();
        fat.setValor(5);
        System.out.println(fat.getFat());
        System.out.println(fat.getFormula());
    }
}
