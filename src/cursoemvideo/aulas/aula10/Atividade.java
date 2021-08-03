package cursoemvideo.aulas.aula10;

import java.util.Calendar;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int ano = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("Data de Nascimento: ");
        int ano_nasc = tec.nextInt();
        int idade = ano - ano_nasc;

        System.out.printf("Com %d anos...\n", idade);
        if(idade < 16){
            System.out.println("Não vota");
        }else{
            if(idade < 18 || idade >= 70){
                System.out.println("Voto não obrigatório");
            }else{
                System.out.println("Voto obrigatório");
            }
        }

    }
}
