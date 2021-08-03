package cursoemvideo.aulas.aula14;

public class Atividade {
    public static void main(String[] args) {

        //VETOR
        /*int n[] = {5,8,9,4,6};
        String[] nomes = {"Vinicius","Ana","Laryssa","Sofia"};

        int c = 0;
        for(String nome : nomes){
            System.out.println(c + " - " + nome);
            c++;
        }

        for(int i : n){
            System.out.print(i*i + " ");
        }*/

        String mes[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho",
                        "Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        for(String mês: mes){
            System.out.print(mês + " ");
        }
        System.out.println("");
        for (int d:
             dias) {
            System.out.print(d + "         ");

        }
    }
}
