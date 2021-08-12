package cursoloiane.arrays;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        /*
        VETOR A E VETOR B COM O MESMO TAMANHO, E COM O MESMO VALOR
         */
        Scanner tec = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for(int i = 0; i < vetorA.length; i++){
            System.out.printf("Entre com o valor da posição: (%d) ", i);
            vetorA[i] = tec.nextInt();

            vetorB[i] = vetorA[i];
        }

        System.out.print("Vetor A: ");
        for(int v : vetorA){
            System.out.print(v);
        }

        System.out.println();

        System.out.print("Vetor B: ");
        for(int v: vetorB){
            System.out.print(v);
        }
    }
}
