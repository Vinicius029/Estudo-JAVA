package cursoloiane.orientacao.objeto.pratica.sobrecarga.metodos;

public class MinhaCalculadora {

    public static int soma(int n1, int n2){
        return n1 + n2;
    }

    public static double soma(double n1, double n2){
        return n1 + n2;
    }

    public static int soma(int[] vetor){
        int tot = 0;

        for(int i=0; i < vetor.length; i++){
            tot += vetor[i];
        }
        return tot;
    }

    public static int fat(int n){
        /*
        int f = 1;
        for(int i=n; i > 1; i--){
            f *= i;
        }
        return f;
        */
        if(n == 0){
            return 1;
        }

        return  n * fat(n -1);

    }


}
