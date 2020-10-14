public class TestesMatematica {
  public static void main(String... args) {
    double [] turma1 = {5, 5, 5};
    double [] turma2 = {1, 5, 9};
    double media1, media2, variancia1, variancia2, desvioPadrao1, desvioPadrao2;
    media1 = Matematica.media(turma1);
    media2 = Matematica.media(turma2);
    variancia1 = Matematica.variancia(turma1);
    variancia2 = Matematica.variancia(turma2);
    desvioPadrao1 = Matematica.desvioPadrao(turma1);
    desvioPadrao2 = Matematica.desvioPadrao(turma2);
    System.out.printf("Turma1: (Media: %.2f, Variancia: %.2f, Desvio Padrao: %.2f)\n", media1, variancia1, desvioPadrao1);
    System.out.printf("Turma2: (Media: %.2f, Variancia: %.2f, Desvio Padrao: %.2f)\n", media2, variancia2, desvioPadrao2);

    double n1 = 7.5;
    double n2 = 8.7;
    double n3 = 9.2;

    //melhor não, vamos usar o varargs
    try{
      double dp = Matematica.desvioPadrao(n1, n2, n3,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1, 1);
    }
    catch (QuantidadeMaiorDoQueEsperadaException e){
      System.out.println("Deu errado");
    }

   


  }
}
