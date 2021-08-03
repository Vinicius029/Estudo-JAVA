package cursoemvideo.aulas.aula12;

import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int n = 0;
        int sum = 0;
        String r;
        do {
            System.out.print("Digite o um numero: ");
            n = tec.nextInt();
            sum += n;
            System.out.println("Quer continuar? [S/N] ");
            r = tec.next();
        }while(r.equals("s"));
        System.out.printf("A soma dos numeros digitados é %d", sum);

    }
}


