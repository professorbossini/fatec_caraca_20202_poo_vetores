import javax.swing.JOptionPane;
public class PreencherEExibir {
  public static void main(String[] args) {
    int [] v = new int[4];
    /*v[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
    v[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
    v[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
    v[3] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));*/
    //ArrayIndexOutOfBoundsException
    for (int x = 0; x < v.length; x++){
      v[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
    }

    /*int i = 0;
    while (i < v.length){
      JOptionPane.showMessageDialog(null, v[i]);
      i++;
    }*/
    StringBuilder sb = new StringBuilder ("");
    String s = "";
    for (int i = 0; i < v.length; ++i){
      sb.append(v[i]).append(" ");
      s += v[i] + " ";
    }
    JOptionPane.showMessageDialog(null, sb.toString());

  }
}
