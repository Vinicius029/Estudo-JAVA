package cursoloiane.orientacao.objeto.pratica;

public class Car {
    public static void main(String[] args) {

         Carro carro = new Carro();
         /*
         carro.marca = "Fiat";
         carro.modelo = "Uno";
         carro.numPassageiro = 5;
         carro.capCombustivel = 100;
         carro.consumoCombustivel = 0.2;
          */

         carro.setMarca("Fiat");
         carro.setModelo("Uno com Escada");
         System.out.println(carro.getModelo());





    }
}
