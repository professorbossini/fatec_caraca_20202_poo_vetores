public class Matematica {
  public static double media (double [] valores){
    double r = 0;
    for (double valor : valores){
      r += valor;
    }
    return r / valores.length;
  }

  public static double variancia (double [] valores){
    double m = media (valores);
    double variancia = 0;
    for (double valor : valores){
      variancia += Math.pow(valor - m, 2);
    }
    return variancia / (valores.length - 1);
  }

  public static double desvioPadrao (double... valores){
    if (valores.length > 40)
      throw new QuantidadeMaiorDoQueEsperadaException ("Não vale passar mais de 40 notas");
    return Math.sqrt(variancia(valores));
  }
}

class QuantidadeMaiorDoQueEsperadaException extends RuntimeException{
  QuantidadeMaiorDoQueEsperadaException (String s){
    super (s);
  }
}
