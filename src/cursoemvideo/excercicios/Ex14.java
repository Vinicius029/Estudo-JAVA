package cursoemvideo.excercicios;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int vetor[] = new int[10];
        String res;
        int opc = 0;
        int i = 0;
        int r = 0;

        int valor = 0;
        do{
            System.out.println(" [1] - Adicionar\n [2] - Remover\n [3] - Listar");
            opc = tec.nextInt();
            if(opc == 1){
                System.out.print("Index: ");
                i = tec.nextInt();
                System.out.print("Valor: ");
                valor = tec.nextInt();
                vetor[i] = valor;
            }else if(opc == 2){
                System.out.print("Remover qual valor: ");
                r = tec.nextInt();
                for (int cont = 0; cont < vetor.length; cont++){
                    if(vetor[cont] == r){
                        vetor[cont] = 0;
                    }
                    System.out.println("Removido com sucesso!");
                }

            }else if(opc == 3){
                for(int c : vetor){
                    System.out.print(c + " ");
                }
            }
            System.out.print("\nQuer continuar? ");
            res = tec.next();
        } while(res.equals("s"));

        System.out.println("Programa Finalizado");


    }
}
