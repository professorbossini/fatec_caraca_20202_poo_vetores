import java.util.Random;
public class CalcularMediaDeElementosEmUmVetor {
  public static void main(String[] args) {
    Random gerador = new Random();

    double [] v = new double [100];

    for (int i = 0; i < v.length; i++){
      v[i] = 3 + gerador.nextDouble() * 5 ;
    }

    double soma = 0;
    for (int i = 1; i <= v.length; i++){
      soma += v[i - 1];
    }
    double media = soma / v.length;
  }
}
