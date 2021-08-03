package cursoemvideo.aulas.aula14;

import java.util.Arrays;

public class Atividade02 {
    public static void main(String[] args) {

        int[] num = {5,6,4,3,9,7,2};

       // System.out.println(Arrays.sort(num));



        String s = "CURSOEMVIDEO";
        char[] r = new char[12];

        for(int c=s.length()-1; c>=0; c--){
            r[c] = s.charAt(c);
        }
        for(char l : r) {
            System.out.print(l);
        }
    }
}
