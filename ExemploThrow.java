import java.util.Scanner;

public class ExemploThrow {

        public static final String SENHASECRETA = "123456";

        public static void main(String[] args) {

            try {
                Scanner S = new Scanner(System.in);
                System.out.println("Digite a senha:");
                String senha = S.nextLine();
                if (!senha.equals(SENHASECRETA)){
                    throw new Exception("Senha invalida!!!");
                }
                System.out.println("Senha correta!!!/nBem vindo(a)!!!");
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }



    }
}
