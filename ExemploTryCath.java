import java.util.Scanner;

public class ExemploTryCath {
    public static void main(String[] args) {
        Scanner S =  new Scanner (System.in);
        try {
            System.out.println("Digite um valor inteiro:");
            int numero1 = S.nextInt();
            System.out.println("Digite um valor inteiro:");
            int numero2 = S.nextInt();

            System.out.println(numero1+ "+" + numero2 + "=" + (numero1+numero2));

        } catch (Exception ex){
            System.out.println("ERRO - Valor digitado nao e um numero inteiro!");
        }
    }



}
