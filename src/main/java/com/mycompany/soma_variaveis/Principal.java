import javax.swing.JOptionPane;
public class Principal {

    public static void main(String[] args) {
    int num1 , num2 , soma;
    num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor: "));
    num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro valor: "));
    soma = num1 + num2;
    JOptionPane.showMessageDialog(null,"O valor é " + soma);
   
    
    }
}
