import java.util.Scanner;

public class Atv1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numSala; 

        System.out.println("Digite o número da sala: ");
        numSala = sc.nextInt();

        if (numSala == 317) {
            System.out.println("Você está no caminho certo.");
        } else {
            System.out.println("Você está perdido(a), se encontre. ");
        }

        sc.close();

    }

}