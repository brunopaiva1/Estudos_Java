import java.util.Scanner;

public class Media {
   public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float soma = 0;
        for(int i = 0; i < 3; i++){           
            System.out.println("Digite sua nota:");
            double n = scanner.nextDouble();
            soma += n;
        }
        double media = soma / 3;
        System.out.println("Sua média é " + media);
   } 
}
