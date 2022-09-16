import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r,a;
        double pi = 3.14,Alan;

        System.out.print("Yarıçapını Giriniz :");
        r = input.nextInt();

        System.out.print("Merkez Açısını Giriniz :");
        a = input.nextInt();

        Alan = (pi*(r * r)*a)/360;

        System.out.print("Alan :" + Alan);

    }
}