//2)	1'den 500'e kadar olan tamsayıların toplamını bulan programın java kodunu yazınız  ?

public class SumOfNumbers {
    public static void main(String[] args) {
        int n = 500; // Son sayı
        int sum = n * (n + 1) / 2; // Toplam formülü

        System.out.println("1'den 500'e kadar olan tamsayıların toplamı: " + sum);
    }
}
