import java.math.RoundingMode;
import java.util.Scanner;
import java.math.BigDecimal;
public class homework2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void avarage(){
        System.out.println("Enter two numbers");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        System.out.println("Result: "+ (a+b) / 2);
    }

    public static void avarageArr(){
        System.out.println("Enter amount of numbers");
        int size = scanner.nextInt();
        float[] arr = new float[size];
        double sum=0;
        System.out.println("Enter numbers");
        for (int i=0;i<size;i++){
            arr[i]=scanner.nextFloat();
            sum+=arr[i];
        }
        System.out.println("Result: "+ sum/size);
    }

    public static void offshore(){
        System.out.println("Enter amount of UAH");
        BigDecimal money = new BigDecimal(scanner.nextDouble());
        System.out.println("Enter percentage per annum");
        float perc = scanner.nextFloat();
        System.out.println("Enter duration of deposit");
        short dur = scanner.nextShort();
        for (int i=1;i<=dur;i++){
            System.out.println("For "+ i +" year:");
            BigDecimal calc = money.multiply(BigDecimal.valueOf(perc/100));
            calc = calc.setScale(2, RoundingMode.DOWN);
            money = money.add(calc);
            money = money.setScale(2, RoundingMode.DOWN);
            double add= calc.doubleValue();
            double result = money.doubleValue();
            System.out.println("Assessed: "+ add);
            System.out.println("On account: "+ result);
        }
    }

    public static void main(String[] args) {
        int a;
        boolean pass = true;
        while(pass){
            System.out.println("Enter number of task, 0 to exit.");
            a = scanner.nextInt();
            switch (a){
                case 1:{
                    avarage();
                    break;
                }
                case 2:{
                    avarageArr();
                    break;
                }
                case 3:{
                    offshore();
                    break;
                }
                case 0:{
                    pass = false;
                    break;
                }
                default:
                    System.out.println("Wrong input");
            }
        }
    }
}
