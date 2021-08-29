package homework5;

public class Car {
    private final double volume;
    private double balance;
    private final double consumption;

    public Car(int volume,int balance,int consumption){
        this.volume = volume;
        this.balance = balance;
        this.consumption = consumption;
    }

    public double refuel(){
        return volume - balance;
    }

    public double FullFuel(){
        double a = volume - balance;
        this.balance = volume;
        return a;
    }

    public void Cons(double N){
        this.balance = volume - (consumption * (N/100));
    }

    public double getBalance(){
        return balance;
    }
}
