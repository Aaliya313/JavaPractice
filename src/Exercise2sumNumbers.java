import java.util.Scanner;

public class Exercise2sumNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //user input
            System.out.println("Input the number to sum to: ");
        int sumTo = reader.nextInt(); //user int
        int sumTotal = 0;
        int addValue = 1;
        while(addValue <= sumTo) { //while loop
            sumTotal = sumTotal + addValue; // addvalue = 1
            addValue++; //addvalue = 2 etc (loops round to how many times user int


        }
        System.out.print(sumTotal); //prints sumTotal after while loop finishes
    }
}
