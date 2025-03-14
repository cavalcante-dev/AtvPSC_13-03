import java.util.Scanner;

public class Atv3 {
    
    public static void main(String[] args) {
        
        String nome = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome de Usuário:");

        while (nome != "q") {
            
            nome = sc.next();
            System.out.println("Bem-vindo usuário: " + nome);

        }

        sc.close();

    }

}
