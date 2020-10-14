import javax.swing.JOptionPane;
public class SomarElementosDeUmVetor {
  public static void main(String[] args) {
    //syntax sugar
    double [] v = {2.5, 6.4, 7.5, 1, 1, 2, 7, 5};
    System.out.println(v.length);
    double soma = 0;
    /*soma = soma +  v[0];
    soma = soma + v[1];
    soma = soma + v[2];*/
    int i = 0;
    for ( ;i < v.length; ){
      soma += v[i];
      i++;
    }
    JOptionPane.showMessageDialog(null, "Soma: " + soma);
  }
}
