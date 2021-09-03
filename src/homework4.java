import java.util.Scanner;

public class homework4 {
    public static Scanner scanner = new Scanner(System.in);

    public static void task1(){
        for(int i = 1;i<100;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }

    public static void task2(){
        System.out.println("Enter number n");
        int n = scanner.nextInt();
        int fact=1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial:"+ fact);
    }

    public static void task3(){
        int i=1;
        while(i!=99)
        {
            if(i%2!=0){
                System.out.println(i);
            }
            i++;
        }

        System.out.println("Enter number n");
        int n = scanner.nextInt();
        int fact=1;
        int j=1;
        while(j<=n){
            fact*=j;
            j++;
        }
        System.out.println("Factorial:"+ fact);
    }

    public static void task4(){
        int i=1;
       do{
           if(i%2!=0){
               System.out.println(i);
           }
           i++;
       }while (i!=99);

        System.out.println("Enter number n");
        int n = scanner.nextInt();
        int fact=1;
        int j=1;
        do{
            fact*=j;
            j++;
        }while (j<=n);
        System.out.println("Factorial:"+ fact);
    }

    public static void task5(){
        System.out.println("Enter number x");
        double x=scanner.nextDouble();
        System.out.println("Enter number n");
        double n=scanner.nextDouble();
        System.out.println("Result: " + Math.pow(x,n));
    }

    public static void task6(){
        int count=0;
        for (int i=0;count<10;i-=5){
            System.out.println(i);
            count++;
        }
    }

    public static void task7(){
        System.out.println("Enter number");
        int x =scanner.nextInt();
        for (int i =1;i<10;i++){
            System.out.println(x+"x"+i+"="+x*i);
        }
    }

    public static void task8(){
        int[] arr=new int[10];
        int i=0;
        int j=0;
        while(i<arr.length){
            if(j%2!=0){
                arr[i]=j;
                if(i== arr.length-1){
                    System.out.println(arr[i]);
                    break;
                }
                System.out.print(arr[i]+",");
                i++;
            }
            j++;
        }
    }

    public static void task9(int[] arr){
        int min=Integer.MAX_VALUE;
        for (int num:arr) {
            if(num<min) min = num;
        }
        System.out.print("Min:");
        for (int num:arr) {
            if(num==min) System.out.println(num);
        }
    }

    public static void task10(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int num:arr) {
            if(num>max) max = num;
        }
        System.out.print("Max:");
        for (int num:arr) {
            if(num==max) System.out.println(num);
        }
    }

    public static void task11(){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int[] arr = new int[5];
        System.out.println("Fill the array");
        for (int i=0;i< arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        for (int num:arr) {
            if(num>max) max = num;
            if(num<min) min = num;
        }
        for (int num:arr) {
            if (num == max) num = min;
            else if (num == min) num = max;
            System.out.println(num);
        }
    }

    public static void task12(){
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

    public static void task13(){
        char[][] desk = new char[8][8];
        //System.out.println(desk.length);
        for(int i = 0;i < desk.length; i++){
            for (int j = 0;j<desk.length; j++){
                if(i%2==0){
                    if(j%2==0){
                        desk[i][j]='W';
                    }
                    else desk[i][j]='B';
                }
                else {
                    if(j%2==0){
                        desk[i][j]='B';
                    }
                    else desk[i][j]='W';
                }
                System.out.print(desk[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[0];
        int a;
        boolean pass = true;
        while(pass){
            System.out.println("Enter number of task, 0 to exit.");
            a = scanner.nextInt();
            switch (a){
                case 1:{
                    task1();
                    break;
                }
                case 2:{
                    task2();
                    break;
                }
                case 3:{
                    task3();
                    break;
                }
                case 4:{
                    task4();
                    break;
                }
                case 5:{
                    task5();
                    break;
                }
                case 6:{
                    task6();
                    break;
                }
                case 7:{
                    task7();
                    break;
                }
                case 8:{
                    task8();
                    break;
                }
                case 9:{
                    System.out.println("Enter number N");
                    int N=scanner.nextInt();
                    arr = new int[N];
                    System.out.println("Fill the array");
                    for (int i=0;i< arr.length;i++){
                        arr[i]=scanner.nextInt();
                    }
                    task9(arr);
                    break;
                }
                case 10:{
                    if(arr.length==0)
                    {
                        System.out.println("Array empty (сначала 9, будьте добры) (ಠ_ಠ)");
                        break;
                    }
                    task10(arr);
                    break;
                }
                case 11:{
                    task11();
                    break;
                }
                case 12:{
                    task12();
                    break;
                }
                case 13:{
                    task13();
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
