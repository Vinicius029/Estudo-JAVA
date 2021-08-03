package cursoemvideo.aulas.aula15;

public class Operaçoes {
    public  String contador(int i, int f){
        String s = "";
        for (int c = i; c <= f; c++){
            s += c + " ";
        }
        return s;
    }
}
