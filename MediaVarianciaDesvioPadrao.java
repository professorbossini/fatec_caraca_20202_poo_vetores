public class MediaVarianciaDesvioPadrao {
  public static void main(String[] args) {
    double [] notas = {1, 5, 9};

    double media = 0;
    //for each
    ///enhanced for
    //foreach e 
    for (double nota : notas){
      media += nota;
    }
    media /= notas.length;

    double variancia = 0;
    for (int i =0; i < notas.length; i++){
      variancia += Math.pow(notas[i] - media, 2);
    }
    variancia /= (notas.length - 1);

    double desvioPadrao = Math.sqrt(variancia);

    System.out.printf ("Media: %.2f, Variancia: %.2f, Desvio Padrao: %.2f\n", media, variancia, desvioPadrao);
  }
}
