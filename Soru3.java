//3)	Klavyeden girilen bir sayının negatif, pozitif veya 0 olup olmadığını bulan programın java kodunu yazınız  ?


import java.util.Scanner; // Kullanıcıdan giriş almak için Scanner sınıfı

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner nesnesi oluştur
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt(); // Kullanıcının girdiği sayıyı al

        // Sayıyı kontrol et
        if (number > 0) {
            System.out.println("Girdiğiniz sayı pozitiftir.");
        } else if (number < 0) {
            System.out.println("Girdiğiniz sayı negatiftir.");
        } else {
            System.out.println("Girdiğiniz sayı sıfırdır.");
        }
        
        scanner.close(); // Kaynakları serbest bırak
    }
}
