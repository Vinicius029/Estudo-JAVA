package cursoemvideo.excercicios;

import java.util.Calendar;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int ano = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("Ano de Nascimento: ");
        int ano_nasc = tec.nextInt();

        int idade = ano - ano_nasc;

        System.out.println("Você tem " + idade + " anos em " + ano);
    }
}
