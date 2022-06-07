public class Task3 {
    public static void main(String[] args){

        double a, b, c;
        double x1, x2;

        a = 2;
        b = 8;
        c = 4;

        double Discrimenant = b*b - 4 * a * c;

        if (Discrimenant == 0){
            x1 = (-b) / (2 * a);
            System.out.println("x1 = " + x1 );
        }
        else if (Discrimenant > 0){
            x1 = (-b + Math.sqrt(Discrimenant)) / (2 * a);
            x2 = (-b - Math.sqrt(Discrimenant)) / (2 * a);
            System.out.println("x1 = "  + x1);
            System.out.println("x2 = "  + x2);

        }
        else {
            System.out.println("Нет целого решения так как дискриминант < 0");
        }
        System.out.println("Конец программы!");
    }
}