import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number;
        double exponentNumber4;
        double exponentNumber5;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        number = input.nextInt();

        for (double i = 0; i <= number; i++) {
            exponentNumber4 = Math.pow(i,4);
            exponentNumber5 = Math.pow(i,5);
            System.out.println(i + "'nin 4'ün kuvveti : " + exponentNumber4);
            System.out.println(i + "'nin 5'ün kuvveti : " + exponentNumber5 + "\n");
        }
    }
}
