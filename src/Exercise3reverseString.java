import java.util.Scanner;
public class Exercise3reverseString {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //user input
        System.out.println("Input a string ");
        char [] letters = reader.nextLine().toCharArray(); //array of user input
        int length = letters.length; //length of word user entered
        char [] reverseletters = new char[length]; //creating new array with a known length from the user input
        for (int i = 0; i < length; i++) { //for loop
            reverseletters[i] = letters[length-(i+1)]; //reversing the letters
            System.out.print(reverseletters [i]);//printing the reversed letters

        }



    }
}

