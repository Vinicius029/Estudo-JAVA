package cursoemvideo.excercicios;

import javax.swing.JOptionPane;

public class Ex12 {
    public static void main(String[] args) {

        //JOptionPane.showMessageDialog(null, "Ola mundo", "Janela",
               // JOptionPane.WARNING_MESSAGE);
        int n;
        int totV = 0;
        int tot = 0;
        int p = 0;
        int i = 0;
        int aCem = 0;

        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero: (0 Para Finalizar)"));
            tot += 1;
            totV += n;
            if(n%2==0){
                p += 1;
            }else if(n%2==1){
                i += 1;
            }else if(n > 100){
                aCem += 1;
            }
        } while(n != 0);

        JOptionPane.showMessageDialog(null,
                "<html> Resultado <br> " +
                        " Total de Valores: " + tot +
                        " <br>Total de Pares: " + p +
                        " <br>Total de Ímpares: " + i +
                        " <br>Acima de 100: " + aCem +
                        " <br>Média dos Valores: " + totV/tot +
                        " </html>");


    }
}
