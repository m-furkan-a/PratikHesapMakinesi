import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1 Sayıyı giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("2 Sayıyı giriniz : ");
        int sayi2 = input.nextInt();
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n4 İşlemden Birini Seçin : ");
        int secim = input.nextInt();
        switch (secim){
            case 1: System.out.println("Sonuc : " + (sayi1 + sayi2)); break;
            case 2: System.out.println("Sonuc : " + (sayi1 - sayi2)); break;
            case 3: System.out.println("Sonuc : " + (sayi1 * sayi2)); break;
            case 4: System.out.println("Sonuc : " + (sayi1 / sayi2)); break;
            default: System.out.println("Geçersiz Seçim !");
        }
    }
}
