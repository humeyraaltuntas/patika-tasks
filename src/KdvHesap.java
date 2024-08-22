import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args) {
        double tutar,kdvOran = 0.22,kdvTutar,kdvliTutar;

        Scanner hum = new Scanner(System.in);
        System.out.println("ücret tutarını giriniz : " );
        tutar = hum .nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar : "+tutar);
        System.out.println("KDV Oranı: "+kdvOran);
        System.out.println("KDV Tutarı: "+kdvTutar);
        System.out.println("KDVli Tutarı: "+kdvliTutar);

    }
}