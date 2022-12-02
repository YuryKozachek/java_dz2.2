public class javaDz2_2 {
    public static void main(String[] args) {
        int balance = 100;
        int sumUp = 1100;
        int bonus;
        int total;
        if (sumUp >= 1000) {
            bonus = sumUp / 100;
            total = balance + sumUp + bonus;
            System.out.println("Итоговый счёт: " + total + " руб.");
            System.out.println("Количество бонусов: " + bonus + " руб.");
        } else if (sumUp <= 999) {
            total = balance + sumUp;
            System.out.println("Итоговый счёт: " + total + " руб.");
            System.out.println("Количество бонусов: " + 0);
        }
    }
}
