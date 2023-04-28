import javax.swing.JOptionPane;
public class Divide2 {
    public static void main(String[] args) {
        int dividendo, divisor;
        while (true){
   try {
       dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo:"));
       divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor:"));
       divide (dividendo,divisor);
       break;
   }catch (ArithmeticException e1){
       JOptionPane.showInternalMessageDialog(null,"Nao pode dividir por zero e2");
   }catch (NumberFormatException e2){
       JOptionPane.showInternalMessageDialog(null,"Favor informar apenas numeros inteiros!");
   }
        }
        }

}
