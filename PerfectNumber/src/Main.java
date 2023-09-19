import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner getNumber = new Scanner(System.in);

        System.out.print("Please Enter a Number : ");

        int number = getNumber.nextInt();

        int sum = 0;

        if(number <= 0){

            System.out.println("Please Enter a Positive Number !!!");

        }

        for(int x = 1; x < number; x++){

            if(number % x == 0){

                sum += x;

            }

        }

        if (sum == number){
            System.out.println("This is a Perfect Number !!!");
        }
        else{
            System.out.println("This is not a Perfect Number....");
        }

    }

}
