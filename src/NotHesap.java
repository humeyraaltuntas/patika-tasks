import java.util.Scanner;

public class NotHesap {
    public static void main(String[] args) {
        int mat,kimya,fizik,biyoloji,turkce,muzik;


        Scanner input = new Scanner(System.in);

        System.out.print("mat notu: ");
        mat = input.nextInt();
        System.out.print("kimya notu: ");
        kimya = input.nextInt();
        System.out.print("fizik notu: ");
        fizik = input.nextInt();
        System.out.print("biyoloji notu: ");
        biyoloji = input.nextInt();
        System.out.print("turkce notu: ");
        turkce = input.nextInt();
        System.out.print("muzik notu: ");
        muzik = input.nextInt();

        int toplam = mat + kimya + fizik + biyoloji + turkce + muzik;
        double sonuc =  toplam / 6;
        System.out.println("ortalamaniz : " + sonuc);

        if (sonuc < 45){
            System.out.println("Maalesef sinifta kaldiniz");
        } else {
            System.out.println("Sinifi basariyla gectiniz");
        }
    }
}
