package cursoemvideo.aulas.aula15;

public class Atividade {

    static String myName(String name, double p){
        return ("Meu nome é " + name + ", E peso " + p + "kg");
    }

    public static void main(String[] args) {

        Calcular.soma(5,10);
        int r = Calcular.mult(5,5);
        System.out.println(r);
        System.out.println(myName("Vinicius", 65.5));
    }
}

class Calcular{

    static void soma(int a, int b){
        int s = a + b;
        System.out.println(s);
    }

    static int mult(int a, int b){
        int s = a * b;
        return s;
    }
}
