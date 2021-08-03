package cursoemvideo.aulas.aula11;

public class Atividade {
    public static void main(String[] args) {

        int c = 0;
        while(c<=11){
            c += 1;
            if(c == 5){
                continue;
            }
            System.out.printf("%d ", c);
        }
    }
}
