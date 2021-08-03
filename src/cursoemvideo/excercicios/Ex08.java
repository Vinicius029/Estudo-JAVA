package cursoemvideo.excercicios;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int num = (int) (1 + Math.random() * (10-1));

        System.out.println("JOGO DE ADIVINHAÇÃO!");
        System.out.printf("Digite um numero 1 a 10: ");
        int jogador = tec.nextInt();

        String res = (jogador == num)? "Parabéns você acertou!" :
                "Você errou! O numero sorteado era " + num;


        System.out.println(res);
    }
}
