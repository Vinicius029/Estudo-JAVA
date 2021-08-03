package cursoemvideo.excercicios;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Segmento A: ");
        int a = tec.nextInt();
        System.out.print("Segmento B: ");
        int b = tec.nextInt();
        System.out.print("Segmento C: ");
        int c = tec.nextInt();

        if(a<b+c && b<a+c && c<a+b){
            System.out.print("FORMA TRIÂNGULO: ");
            if(a==b && b==c){
                System.out.println("Equilátero");
            }else if(a!=b && b!=c && a!=c){
                System.out.println("Escaleno");
            }else{
                System.out.println("Isósceles");
            }
        }else{
            System.out.println("Nao Forma!");
        }
    }
}
