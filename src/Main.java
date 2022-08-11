

                                    //!!!!!!ALWAYS WRITE COMMENTS IN YOUR CODE!!!!!!!!!
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) { //must have main method AND write within the curly brackets, otherwise it won't run

    //OUTPUT STATEMENTS
        //System - class, out - output
        System.out.println("HelloWorld"); //print statement //has to be capital S from System //must use ; at the end
        System.out.println("This is line 2!");
        System.out.print("This is line 3 "); //to add a space, you need to type a space, to have a space between the line below
        System.out.print("This is to show that without 'println' and just 'print' you get the same string on the same line, not one below");
        System.out.println(" " + "Aaliya"); //the " " is to add a space between sentences or strings, this is called CONCATENATION
        System.out.println("Mary had a little lamb" + "and she ate it in her BBQ"); //no space between the strings, CONCATENATION OCCURRED
        System.out.println("Mary had a little lamb" + " " + "and she ate it in her BBQ"); // AND NOW YOU SEE, a space has been inserted between the two strings. YAY :)
        //seems awfully long to write out println each time so you can abbreviate to \n instead
        System.out.print("Mary had a little lamb, \n" + "and she ate it in her BBQ, \n" + "and then made haleem, \n"); //abbreviation of println, DO \n again and then adds another paragraph space

    //VARIABLES AND DATA TYPES
        //unlike python, you have to state the datatype.
        //you cannot interchange the datatype, unless you do something called casting. EXCEPTION:
        //an integer can be a float or a double but a float or double can never be an integer
        //Format: datatype VariableName = Value
        //String - must have a capital S
        //char - single character or letter
        //Boolean - true or false
        //int, float, double, short, byte - all carry numbers but different sizes
        //float and double are both for decimal numbers, but a float carries half size of what a double
        //float good for storing up to 6-7 decimal points
        //double - good for storing 15 decimal points
        //float Height = 8.5f; - must put f value in float

        String name = "Fred"; //CAPS S NEEDED FROM STRING
        System.out.println(name);

        String FirstName = "Joe"; //CamelCasing - breaking up multiple words in a variable e.g. FirstName
        String Surname = "Bloggs";
        System.out.println(FirstName + " " + Surname);

        boolean isOK = false;
        System.out.println(isOK);

        byte age = 18; //can store values: -127 to 127
        System.out.println("The Youngest age for an adult is " + age); //shift F10 to run

        short age1 = 300; //store: -32767 to 32767
        System.out.println(age1);

        int age2 = 33000; //store: bigger numbers
        System.out.println(age2);

        //long age3 = 2345678934567834L //HAVE TO PUT AN L AT THE END //store: biggest numbers

        float pi = 3.14234567823456784567f; //NEED TO PUT F AT THE END // only prints 7 decimal places
        System.out.println(pi);

        double pi2 = 3.14234567823456784567; // prints 14 decimal places, more then float
        System.out.println(pi2);


    //CASTING -Datatype switching
        String numbers = "42";
        int number = parseInt(numbers); //import static method for parseInt, converts numbers = 42 into an integer
        System.out.println(number * 2 + numbers); //can do mathematical operations on the 42 now converted into an integer. //concatenation with numbers is still going to print a String tho

        double decimalNumber = 4.254d; //put d after number, to symbolize it is a double
        int wholeNumber = (int) decimalNumber; //by putting int in brackets you are converting the double into an int, so output would be 4
        System.out.println(wholeNumber); //output will be 4

    //INPUTS - How to get user to interact with the software - Scanner method
        //Need to use a class, which is called a Scanner. User input needs to be converted into  a variable
        //Scanner methods nextLine - for String, nextBoolean etc
        //Need to import Scanner at the top of main method
        //need to creat instance of Scanner object
        //Scanner obj = new Scanner(System.in); //input for user
        //System.out.print("What is your name? ");
        //String name1 = obj.nextLine();
        //System.out.println("Your name is" + name1);
        //can use many different scanner methods, it will come p in a droplist
        //exception errors occur, when the user inserts a different datatype to what the code is for

        //different countries write decimal points differently. commas or dots. so can import a language library
        //at the top, before the main method, import java.util.locale; //then:
        // Scanner obj = new Scanner(System.in).userLocale(Locale.ITALY) //so now when the user types in 4,9 as a decimal, it won't come up as an error


    //LOGICAL OPERATORS
        // && - must both be true
        // ! - is NOT
        // !
        // Instead of variable 1 == variable 2, do variable1.equals(variable 2)


    //IF, ELSE-IF, ELSE STATEMENTS
        //if(expression) {
            //code to execute (if true)
            //sout("")
        //}

        Scanner scan = new Scanner(System.in); //input from use, use scanner method
        System.out.println("Enter the grade: ");
        int num = scan.nextInt();
        System.out.println(num);

        if(num >=90 && num<=100) {
            System.out.println("A");
        } else if (num>=80 && num<90) {
            System.out.println("B");
        } else if (num>=70 && num<80) {
            System.out.println("C");
        } else if (num>=65 && num<70) {
            System.out.println("D");
        } else if (num>=0 && num <65) {
            System.out.println("F");
        } else {
            System.out.println("This number is not in the range");
        }






    //FOR, WHILE, DO-WHILE LOOPS
        //WHILE LOOP - have to set a limit to condition, otherwise it will run forever
        //int i = 0;
        //while(i < 20) {
        //System.out.println(i);
        //i++;
        //}

        //FOR LOOP
        //for (int i = 0; i < 5; i++) {
            //System.out.println(i);
        //}

        //DO-WHILE LOOP
        //makes sure the code inside the loop is run at least once, regardless of whether or not the condition is met or not
        //int i = 0;
        //do { //code is run, then the condition is checked

            //System.out.println(i);
            //i++;

        } //while (i < 10);





        }

