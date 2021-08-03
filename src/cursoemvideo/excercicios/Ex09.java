package cursoemvideo.excercicios;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Valor de A: ");
        int a = tec.nextInt();
        System.out.print("Valor de B: ");
        int b = tec.nextInt();
        System.out.print("Valor de C: ");
        int c = tec.nextInt();

        double res = Math.pow(b, 2) - 4 * a * c;

        System.out.println("Calculo de Delta");

        if(res < 0){
            System.out.println("Não Exitem Raizes Reais");
        }else{
            System.out.println("Exitem Raizes Reais");
        }
    }
}
