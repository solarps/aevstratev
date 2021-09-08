import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class homework6 {

    public static Scanner sc = new Scanner(System.in);
    /*public static void main(String[] args) {
        System.out.print("Введите сумму вклада в банк в гривнах: ");
        double sum = sc.nextDouble();
        System.out.print("Какой процент годовых? ");
        double percent = sc.nextDouble();
        System.out.print("Длительность вклада (лет): ");
        int term = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= term; i++) {
            double y = sum / 100 * percent;
            sum = sum + y;
            System.out.println("Накопленная сумма за" + i + "год составила: " + sum);
            System.out.println("Начисленные проценты в грн: " + y);
        }
    }*/

    public static void main(String[] args) {
        System.out.print("Введите сумму вклада в банк в гривнах: ");
        BigDecimal money = sc.nextBigDecimal();
        System.out.print("Какой процент годовых? ");
        float perc = sc.nextFloat();
        System.out.print("Длительность вклада (лет): ");
        short term = sc.nextShort();

        for (int i = 1; i <= term; i++) {
            BigDecimal calc = money.multiply(BigDecimal.valueOf(perc / 100));
            calc = calc.setScale(2, RoundingMode.DOWN);
            money = money.add(calc);
            money = money.setScale(2, RoundingMode.DOWN);
            double add = calc.doubleValue();
            double result = money.doubleValue();
            System.out.printf("Накопленная сумма за %s %s составила: %s", i, year(i), result);
            System.out.println("\nНачисленные проценты в грн: " + add);
        }
    }

    public static String year(int i) {
        String year = "";
        if (i == 1 || i == 21) {
            year = "год";
        } else if ((i >= 2 && i <= 4) || (i >= 21)) {
            year = "года";
        } else if (i >= 5) {
            year = "лет";
        }
        return year;
    }
}
