import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz Girin :");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuzu Girin :");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuzu Girin :");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuzu Girin :");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuzu Girin :");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuzu Girin :");
        muzik = inp.nextInt();
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6.0;
        boolean kosul1 = ortalama >= 60;
        String str = kosul1 ? "Geçtiniz." : "Kaldınız.";
        System.out.print(str);
    }
}
