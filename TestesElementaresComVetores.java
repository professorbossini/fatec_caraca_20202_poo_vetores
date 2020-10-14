import javax.swing.JOptionPane;

public class TestesElementaresComVetores{
  public static void main(String[] args) {
    int [] v1;
    int v2 [];
    int [] v3 = new int[4];
    v3[0] = 2;
    System.out.println(v3[0]);
    System.out.println(v3[2]);
    v3[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
    System.out.println(v3.length);
    v3[0] = 2;
    v3[1] = 3;
    int r = v3[0] + v3[1];
    System.out.println(v3[3 - 2]);
    System.out.println(v3[3 - v3.length + 2]);
    System.out.println(v3[4]);
    System.out.println(v3[v3.length]);
    System.out.println(v3[v3.length - v3.length]);
    int a = 0;
    System.out.println(v3[a--]);
    
    a = 0;
    System.out.println(v3[--a]);

  }
}