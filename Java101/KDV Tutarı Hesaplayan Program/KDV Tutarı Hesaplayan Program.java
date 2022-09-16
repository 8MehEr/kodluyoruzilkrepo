import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Fiyat,KDV = 0.18,KDVFiyat,KDVS;
        boolean KDVYuzde;

        System.out.print("Fiyatı Giriniz :");
        Fiyat = input.nextDouble();

        KDVYuzde = (Fiyat < 1000) || (Fiyat > 1000);
        KDV = KDVYuzde ? 0.18 : 0.8;
        KDVS = Fiyat * KDV;
        KDVFiyat = KDVS + Fiyat;

        System.out.println("KDV'siz Fiyat :" + Fiyat );
        System.out.println("KDV'li Fiyat :" + KDVFiyat);
        System.out.println("KDV Oranı :" + KDV);
        System.out.print("KDV :" + KDVS);

    }
}