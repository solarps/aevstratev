package homework5;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        int vol,bal;
        double cons;
        double price = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter volume of the tank");
        vol=scanner.nextInt();
        System.out.println("Enter tank residue");
        bal=scanner.nextInt();
        System.out.println("Enter fuel consumption");
        cons=scanner.nextDouble();

        Car toyota = new Car(vol, bal, cons);
        System.out.println("Need to refuel:" + toyota.refuel());
        price += toyota.FullFuel() * 30;
        System.out.println("Refueling cost:"+ price + " UAH");
        toyota.Cons(179); //остановка в озере
        price += toyota.FullFuel() * 30;
        toyota.Cons(153); //остановка в жашкове
        price += toyota.FullFuel() * 30;
        toyota.Cons(150); //прибытие в киев
        System.out.println("Tank residue:" + toyota.getBalance());
        System.out.printf("Total spent: %.2f UAH",price);
    }
}
