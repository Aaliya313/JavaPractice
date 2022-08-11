import java.util.Scanner;

//Exercise 1 - TimesTables
public class Exercise1TimesTables {
    public static void main(String[] args) { //Main method - must have it to run the code
        Scanner reader = new Scanner(System.in); //user input
            System.out.print("What Times Table would you like? "); //user enters a number lower than or equal to 12
        int timesTable = reader.nextInt(); //user enters timesTable number that they want
        for(int i=1;i<=12;i++) //for loop: start from 1 x timesTable to 12 x timesTable, display from values 1 upto 12 e.g. 1x2, 2x2, 3x2 etc, incrementing by 1 and goes up to 12
            System.out.println(i+" x " +timesTable+" = "+i*timesTable); //output to show  value x timesTable = value(timesTable), e.g. timesTable = 6 so, 1 x 6 = 6 or 12 x 6 = 72.
    }
}
