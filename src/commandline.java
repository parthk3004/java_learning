import java.util.Scanner;
public class commandline {

    public static void addingNumbers(double numOne,double numTwo,double numThree) {
        double numTotal = numOne + numTwo + numThree;
        System.out.println("Sum: " + numTotal);
    }
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            double firstNumber;
            double secondNumber;
            double thirdNumber;
            System.out.println("Enter Three numbers: ");
            firstNumber = scan.nextDouble();
            secondNumber = scan.nextDouble();
            thirdNumber = scan.nextDouble();
            commandline obj = new commandline();
            obj.addingNumbers(firstNumber, secondNumber, thirdNumber);
        }
        catch(Exception e) {

            System.out.println("ERROR: " + e);
            System.out.println("The program execution finished with an ERROR");
        }
    }


}

