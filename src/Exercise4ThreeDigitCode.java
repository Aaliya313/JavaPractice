public class Exercise4ThreeDigitCode {
    public static void main(String[] args) { //Main method
        int totalNumberOfTDC = 0;
        for (int i = 1; i<=4; i++) { //for loops
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k<=4; k++) {
                   if (i != j && j != k && k != i) { //Select digits that are different. All have to be true to run the code below
                       int threeDigitCode = Integer.valueOf(String.valueOf(i) + String.valueOf(j)+ String.valueOf(k)); //prints i,j,k
                       System.out.println(threeDigitCode); //prints threeDigitiCode
                       totalNumberOfTDC++;
                   }






                }
            }
        }
        System.out.println("Total number of three digit variable: " + totalNumberOfTDC); //output should be 24
    }
}
