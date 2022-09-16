import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo,length,BMI;

        System.out.print("Lütfen Boyunuzu Giriniz :");
        length = input.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz :");
        kilo = input.nextDouble();

        BMI = kilo / (length * length) ;

        System.out.print("Vücut Kitle İndeksi :" + BMI);

    }
}