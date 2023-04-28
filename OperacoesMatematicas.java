import javax.swing.*;
import java.util.jar.JarEntry;

public class OperacoesMatematicas {

    public static void main(String[] args) {
        System.out.println("Inicio do programa");
        try {
            int a= Integer.parseInt(JOptionPane.showInputDialog("a:"));
            int b= Integer.parseInt(JOptionPane.showInputDialog("b:"));
            System.out.println("Divisao = " + (a / b));
            System.out.println("Multiplicao = " + (a * b));
            System.out.println("Soma = " + (a + b));
            System.out.println("Subtracao = " + (a - b));

        }catch (ArithmeticException e1){
            System.out.println("Nao pode dividir por zero!");
        }catch (NumberFormatException e2){
            System.out.println("Digite um numero válido!");
        }
        System.out.println("Fim do programa.");
    }
}
