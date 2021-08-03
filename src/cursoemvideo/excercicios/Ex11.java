package cursoemvideo.excercicios;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Fatorial de qual numero: ");
        int fat = tec.nextInt();
        int c = fat;
        int f = 1;
        while (c>=1){
            if(c == 1){
                System.out.print(c + " = ");
            }else{
                System.out.print(c + " x ");
            }

            f *= c;
            c--;

        }
        System.out.print(f);
        System.out.printf("\nO fatorial de %d é %d!", fat, f);
    }
}
