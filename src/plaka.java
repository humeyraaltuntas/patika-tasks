import java.util.Scanner;

public class plaka {
    public static void main(String[] args) {
        Integer plaka;
        Scanner input = new Scanner(System.in);

        System.out.println("plakayı giriniz: ");
        plaka = input.nextInt();
        if (plaka == 06){
            System.out.println("Ankara");
        }else if (plaka == 07){
            System.out.println("Antalya");
        }else if (plaka == 05){
            System.out.println("Amasya");
        }else {
            System.out.println("Türkiye");
        }
    }
}
