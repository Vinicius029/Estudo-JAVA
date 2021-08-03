package cursoemvideo.aulas.aula08;

public class Atividade {
    public static void main(String[] args) {

        int n1 = 3;
        int n2 = 5;
        String r = (n1 == n2)? "Verdadeiro" : "Falso";
        System.out.println(r);

        String name1 = "Ana";
        String name2 = "Ana";
        String name3 = new String("Ana");
        String res = (name1.equals(name3))? "Igual" : "Diferente";
        System.out.println(res);

    }
}
