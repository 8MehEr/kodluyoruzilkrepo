import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut =  2.14 ,elma = 2.67 ,domates = 1.11 ,muz = 0.95,patlican = 5.00,armutmiktari,elmamiktari,domatesmiktari,muzmiktari,patlicanmiktari,kilo,Total;


        System.out.print("Armut Kaç Kilo ? :");
        armutmiktari = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        elmamiktari = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        domatesmiktari = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        muzmiktari = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicanmiktari = input.nextDouble();

        Total = (armut * armutmiktari) + (elma + elmamiktari) + (domates * domatesmiktari) + (muz * muzmiktari) + (patlican * patlicanmiktari);

        System.out.print("Toplam Tutar :" + Total);

    }
}