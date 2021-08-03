package cursoemvideo.aulas.aula10;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Primeiro valor: ");
        int a = tec.nextInt();
        System.out.println("Segundo valor: ");
        int b = tec.nextInt();
        System.out.println("Operação: ");

        String nome = tec.nextLine();
        int r;

        switch (nome){
            case "+":
                r = a + b;
                break;
            case "-":
                r = a - b;
                break;
            case "*":
                r = a * b;
                break;
            default:
                r = 0;
                break;

        }
        System.out.println(r);
    }
}
