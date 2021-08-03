package cursoemvideo.aulas.aula07;

public class Atividade {
    public static void main(String[] args) {

        float v = 3.6f;

        int baixo = (int) Math.floor(v);
        System.out.println(baixo);

        int cima = (int) Math.ceil(v);
        System.out.println(cima);

        int red = (int) Math.round(v);
        System.out.println(red);

        //GERADOR DE NUMEROS
        double sort = Math.random();
        int n = (int) (5 + sort * (10 - 5));
        System.out.println("Numero sorteado: " + n);


    }
}
