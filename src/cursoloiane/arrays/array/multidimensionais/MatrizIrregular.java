package cursoloiane.arrays.array.multidimensionais;

import java.util.Scanner;

public class MatrizIrregular {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Quantas pessoas serão entrevistada? ");
        int p_entrevista = tec.nextInt();

        String[][] filhos = new String[p_entrevista][];

        int qtdFilhos = 0;
        for(int i=0; i < filhos.length; i++){
            System.out.print("Quantos filhos você tem? ");
            qtdFilhos = tec.nextInt();

            filhos[i] = new String[qtdFilhos];

            for(int j=0; j < filhos[i].length; j++){
                System.out.println("Digite o nome do filho " + (j+1));
                filhos[i][j] = tec.next();
            }
        }

       for(int i=0; i < filhos.length; i++){
           System.out.printf("\nPessoa %d tem %d filhos.\n", i, filhos[1].length);
           System.out.print("Nomes: ");
           for(int j=0; j < filhos[1].length; j++){
               System.out.print(filhos[i][j]);
           }
       }


    }
}
