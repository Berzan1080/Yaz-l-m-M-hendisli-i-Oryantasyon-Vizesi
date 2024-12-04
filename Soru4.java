//4)	10 ile 1000 arasındaki tam kare sayıları ekrana yazdıran programın  java kodunu yazınız  ?

public class PerfectSquares {
    public static void main(String[] args) {
        System.out.println("10 ile 1000 arasındaki tam kare sayılar:");

        for (int i = 4; i * i <= 1000; i++) { // 4'ten başla çünkü 4^2 = 16 (10'dan büyük ilk tam kare)
            int square = i * i; // Sayının karesi
            if (square >= 10 && square <= 1000) { // 10 ile 1000 arasında mı?
                System.out.println(square); // Tam kareyi yazdır
            }
        }
    }
}
