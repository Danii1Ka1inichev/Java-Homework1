public class Task1 {
    public static void main(String[] args) {

        int x = 1;
        if (x >= 1 && x <= 12) {
            if (x == 12 || x == 1 || x == 2) {
                System.out.println("Зима");
            }
            if (x == 3 || x == 4 || x == 5) {
                System.out.println("Весна");
            }
            if (x == 6 || x == 7 || x == 8) {
                System.out.println("Лето");
            }
            if (x == 9 || x == 10 || x == 11) {
                System.out.println("Осень");
            } else {
                System.out.println("Время года");
            }
            System.out.println("Конец программы!");
        }
    }
}