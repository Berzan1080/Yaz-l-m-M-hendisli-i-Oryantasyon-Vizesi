import java.util.Scanner;

public class ProjectileRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan ilk hız ve açı bilgilerini al
        System.out.print("İlk hızı (m/s) giriniz: ");
        double v0 = scanner.nextDouble();

        System.out.print("Atış açısını (derece) giriniz: ");
        double theta = scanner.nextDouble();

        // Açıyı radyan cinsine çevir
        double thetaRad = Math.toRadians(theta);

        // Yerçekimi ivmesi (m/s²)
        double g = 9.8;

        // Maksimum menzili hesapla
        double range = (Math.pow(v0, 2) * Math.sin(2 * thetaRad)) / g;

        // Sonucu ekrana yazdır
        System.out.printf("Topun maksimum menzili: %.2f metre\n", range);

        scanner.close();
    }
}
