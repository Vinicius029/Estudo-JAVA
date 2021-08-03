package cursoemvideo.excercicios;

import javax.swing.JOptionPane;

public class Ex13 {
    public static void main(String[] args) {

        int i = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Quer contar de: "));
        int f = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Até: "));
        int p = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Passo: "));

        if(i > f){
            for(int c = i; c >= f; c -= p) {
               if(c==f){
                   System.out.print(c + "");
               }else{
                   System.out.print(c + " -> ");
               }
            };
        }else if(i < f){
            for(int c = i; c <= f; c += p) {
                if(c==f){
                    System.out.print(c + "");
                }else{
                    System.out.print(c + " -> ");
                }

            }
        }
    }
}
