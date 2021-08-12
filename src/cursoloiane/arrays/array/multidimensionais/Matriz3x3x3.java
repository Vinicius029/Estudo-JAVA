package cursoloiane.arrays.array.multidimensionais;

public class Matriz3x3x3 {
    public static void main(String[] args) {

        //MATRIZ TRIDIMENSIONAL

        int[][][] matriz = new int[3][3][3];

        int soma = 0;
        int sPar = 0;
        int sImpar = 0;
        for(int i=0; i <matriz.length; i++){
            for(int j=0; j < matriz[i].length; j++){
                for(int k=0; k < matriz[i][j].length; k++){
                    matriz[i][j][k] = (i + j) * k;

                    soma += matriz[i][j][k];
                    if (matriz[i][j][k] % 2 ==0){
                        sPar += matriz[i][j][k];
                    }else{
                        sImpar += matriz[i][j][k];
                    }
                }
            }
        }

        System.out.println("Soma Total: " + soma);
        System.out.println("Soma Par: " + sPar);
        System.out.println("Soma Impar: " + sImpar);

    }
}
