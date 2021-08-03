package cursoemvideo.excercicios;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = teclado.nextInt();

        System.out.println("Resto dividido por 2 é: " + num % 2);
        System.out.println("Elevado ao Cubo: " + Math.pow(num, 3));
        System.out.format("Raiz Quadrada: %.2f \n", Math.sqrt(num));
        System.out.format("Raiz Cubica: %.2f \n", Math.cbrt(num));
        System.out.println("Valor Absoluto: " + Math.abs(num));
    }
}
