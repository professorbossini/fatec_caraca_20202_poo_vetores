import javax.swing.JOptionPane;

public class BuscaValorEmUmVetor {
  public static void main(String[] args) {
    int [] v = {1, 2, 5, 4, 3};//syntax sugar
    int valor = Integer.parseInt(JOptionPane.showInputDialog("Qual valor buscar?"));
    int i = 0;
    for ( ; i < v.length; i++){
      if (v[i] == valor)
        break;
    }
    JOptionPane.showMessageDialog(null, i < v.length ? " Sim, existe na posição " + i : "Não, não existe");
  }
}
