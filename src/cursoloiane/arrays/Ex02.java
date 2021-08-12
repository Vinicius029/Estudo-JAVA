package cursoloiane.arrays;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];
        int[] vA = new int[15];
        double[]vB = new double[vA.length];

        /*for(int i = 0; i < vetorA.length; i++){
            System.out.printf("Entre com o valor da posição: (%d) ", i);
            vetorA[i] = tec.nextInt();

            vetorB[i] = vetorA[i] * 2;
        }

        System.out.print("Vetor A: ");
        for(int v : vetorA){
            System.out.print(v + " ");
        }

        System.out.println();

        System.out.print("Vetor B: ");
        for(int v: vetorB){
            System.out.print(v + " ");
        }*/

        for(int i = 0; i < vA.length; i++){
            System.out.printf("Entre com o valor da posição: (%d) ", i);
            vA[i] = tec.nextInt();

            vB[i] = Math.sqrt(vA[i]);
        }

        for(double c : vB){
            System.out.printf("%.2f ",c);
        }
    }
}
