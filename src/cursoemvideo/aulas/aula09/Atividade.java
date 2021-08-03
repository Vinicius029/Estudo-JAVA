package cursoemvideo.aulas.aula09;

import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        float n1 = tec.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = tec.nextFloat();
        System.out.print("Terceira nota: ");
        float n3 = tec.nextFloat();
        System.out.print("Quarta nota: ");
        float n4 = tec.nextFloat();

        float media = (n1+n2+n3+n4)/4;

        if(media >= 7) System.out.println("Parabéns");
    }
}
