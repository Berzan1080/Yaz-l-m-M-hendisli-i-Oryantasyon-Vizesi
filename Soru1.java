public class NumberDifference {
    public static void main(String[] args) {
        int oddSum = 0; // Tek sayıların toplamı
        int evenSum = 0; // Çift sayıların toplamı

        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                evenSum += i; // Çift sayı ise evenSum'a ekle
            } else {
                oddSum += i; // Tek sayı ise oddSum'a ekle
            }
        }

        int difference = oddSum - evenSum; // Farkı hesapla

        if (difference > 0) {
            System.out.println("Fark pozitif: " + difference);
        } else if (difference < 0) {
            System.out.println("Fark negatif: " + difference);
        } else {
            System.out.println("Fark sıfır.");
        }
    }
}
