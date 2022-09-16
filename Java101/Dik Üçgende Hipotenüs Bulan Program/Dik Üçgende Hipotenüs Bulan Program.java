import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A,B,C,U;
        double Alan;

        System.out.print("A Kenarını Girin :");
        A = input.nextInt();

        System.out.print("B Kenarını Giriniz :");
        B = input.nextInt();

        System.out.print("C Kenarını Giriniz :");
        C = input.nextInt();

        U = ((A+B+C)/(2));
        Alan = Math.sqrt(U*(U-A)*(U-B)*(U-C));

        System.out.print("Alan : " + Alan);

    }
}