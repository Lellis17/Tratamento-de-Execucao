import java.util.Scanner;
public class ExmploFinnaly {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        try {
            int dividendo, divisor;
            System.out.println("Digite o valor do dividendo: ");
            dividendo = S.nextInt();
            System.out.println("Digite o valor do divisor: ");
            divisor = S.nextInt();

            if (divisor == 0){
                throw new Exception("Nao eh permitido fazer uma divisao por zero!");
            }
            System.out.println(dividendo+ " / " +divisor+ " = " +(dividendo / divisor));
        }catch (Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        } finally {
            System.out.println("Bloco Finally.");
        }
    }




}
