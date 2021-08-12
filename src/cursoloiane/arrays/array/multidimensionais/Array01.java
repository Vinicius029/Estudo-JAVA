package cursoloiane.arrays.array.multidimensionais;

import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        double[][] notas = new double[3][4];

        /*
        notas[0][0] = 10;
        notas[0][1] = 5;
        notas[0][2] = 8;
        notas[0][3] = 7;

        notas[0][0] = 9;
        notas[1][1] = 6;
        notas[1][2] = 8;
        notas[1][3] = 3;

        notas[2][0] = 10;
        notas[2][1] = 5;
        notas[2][2] = 4;
        notas[2][3] = 7;
        */

        for(int i=0; i < notas.length; i++){
            for(int j=0; j < notas[i].length; j++){
                System.out.printf("Nota do Aluno da posição (%d,%d): ", i, j);
                notas[i][j] = tec.nextDouble();
            }
        }

        for(int i=0; i< notas.length; i++){
            double media = 0;
            double tot = 0;
            System.out.print("Aluno " + i + ": ");
            for(int j=0; j < notas[i].length; j++){
                tot += notas[i][j];
                System.out.print(notas[i][j] + " ");
            }
            media = tot / notas[i].length;
            System.out.print(" A média do aluno é: " + media);
            if (media >= 7){
                System.out.println("\nAluno Aprovado!");
            }else{
                System.out.println("\nAluno Reprovado!");
            }
            System.out.println();
        }
    }
}
