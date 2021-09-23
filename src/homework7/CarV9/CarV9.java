package homework7.CarV9;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringJoiner;

public class CarV9 {
    private String location;
    private BigDecimal tripDistance;
    private final BigDecimal volume;
    private BigDecimal balance;
    private final BigDecimal consumption;
    private BigDecimal totalSentMoney;

    public CarV9(String location) {
        this.location = location;
        this.volume = BigDecimal.valueOf(Math.random() * 20 + 30).setScale(2, RoundingMode.CEILING);
        this.balance = volume.subtract(BigDecimal.valueOf(Math.random() * 20 + 10).setScale(2, RoundingMode.CEILING));
        this.consumption = BigDecimal.valueOf(Math.random() * 10 + 5).setScale(2, RoundingMode.CEILING);
        this.totalSentMoney = new BigDecimal(0).setScale(2, RoundingMode.CEILING);
    }

    public void setTripDistance(double tripDistance) {
        this.tripDistance = new BigDecimal(tripDistance).setScale(2, RoundingMode.CEILING);
    }

    public void fillFullTank(double fuelPrice) {
        this.balance = volume;
        totalSentMoney = totalSentMoney.add(volume.multiply(BigDecimal.valueOf(fuelPrice)));
    }

    public BigDecimal getFuelInTank() {
        return balance.setScale(2, RoundingMode.CEILING);
    }

    public void drive(double tripDistance, String str) {
        this.tripDistance = this.tripDistance.add(BigDecimal.valueOf(tripDistance));
        this.location = str;
        BigDecimal cons = new BigDecimal(tripDistance / 100).multiply(consumption);
        this.balance = balance.subtract(cons);
        if (getFuelInTank().compareTo(BigDecimal.valueOf(0)) == -1) {
            double balance = this.balance.doubleValue();
            balance = Math.abs(balance);
            BigDecimal distance = new BigDecimal(balance * 100).divide(consumption, RoundingMode.CEILING);
            this.tripDistance = this.tripDistance.subtract(distance);
            this.location = "Поляна";
            this.balance = BigDecimal.valueOf(0);
            printTripReport();
            throw new RuntimeException("Бензин закончился");
            //System.out.println("Бензин закончился");
            //System.exit(0);
        }
    }

    public void fillTank(double liters, double fuelPrice) {
        if (balance.add(BigDecimal.valueOf(liters)).compareTo(volume) == 1) {
            fillFullTank(fuelPrice);
        } else {
            this.balance = balance.add(BigDecimal.valueOf(liters));
            this.totalSentMoney = totalSentMoney.add(BigDecimal.valueOf(fuelPrice));
        }
    }

    public void printTripReport() {
        System.out.println("Место прибытия: " + this.location);
        System.out.println("Остаток в баке: " + getFuelInTank()+ "L");
        System.out.println("Всего потрачено: " + this.totalSentMoney.setScale(2, RoundingMode.CEILING) + " UAH");
        System.out.println("Всего проехано: " + this.tripDistance.setScale(2,RoundingMode.CEILING) + " km");
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CarV9.class.getSimpleName() + "[", "]")
                .add("location='" + location + "'")
                .add("volume=" + volume)
                .add("balance=" + balance)
                .add("consumption=" + consumption)
                .toString();
    }
}
