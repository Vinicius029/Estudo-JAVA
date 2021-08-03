package cursoemvideo.aulas.aula06;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = teclado.nextLine();

        System.out.print("Primeira nota: ");
        float n1 = teclado.nextFloat();

        System.out.print("Segunda nota: ");
        float n2 = teclado.nextFloat();

        float media = (n1 + n2) / 2;

        if(media >= 7){
            System.out.println("Aluno aprovado!");
            System.out.println("Parabéns " + nome);
        }else{
            System.out.println("Aluno reprovado!");
        }
    }
}
