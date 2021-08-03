package cursoemvideo.aulas.aula13;

public class Atividade {
    public static void main(String[] args) {

        for (int n = 10; n >= 1; n -= 1){
            System.out.println(n);
        }

        int n = 1;
        for(int c = 0; c < 3; c++){
            for(int l = 0; l < 3; l++){
                System.out.printf(" [ %d ] ",n++);
            }
            System.out.println("");
        }
    }
}
