import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SciCal
{
    private static final Logger logger= LogManager.getLogger(SciCal.class);
    public SciCal(){}
    public static void main(String [] args)
    {
        SciCal obj=new SciCal();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;

        do {
            System.out.println("DevOps_Calculator, Choose to perform operation");
            System.out.print("Press 1 - Square Root\nPress 2 - Factorial\nPress 3 - Natural Log\nPress 4 - Power\n" +
                    "Press 5 to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice)
            {
                case 1:
                    // do Square root
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Square root of "+number1+" is : " + obj.sqrt(number1));
                    System.out.println("\n");
                    break;

                case 2:
                    // do Factorial
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Factorial of "+number1+" is : " + obj.factorial(number1));
                    System.out.println("\n");
                    break;

                case 3:
                    // do Natural Log
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Natural Log of "+number1+" is : " + obj.naturallog(number1));
                    System.out.println("\n");
                    break;

                case 4:
                    // do Power
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println(number1+" raised to the power "+number2+" is : " + obj.power(number1,number2));
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }
    public double sqrt(double number1) {
        logger.info("[SQUARE ROOT] - " + number1);
        double sqr = Math.sqrt(number1);
        double result = sqr;
        logger.info("[RESULT - SQUARE ROOT] - " + result);
        return result;
    }

    public double factorial(double number1){
        logger.info("[FACTORIAL] - " + number1);
        double result = (number1==1 || number1==0) ? 1:number1*factorial(number1-1);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double naturallog(double number1){
        logger.info("[NATURAL LOGARITHM] - " + number1);
        double result = Math.log(number1);
        logger.info("[RESULT - NATURAL LOGARITHM - " + result);
        return result;
    }
    public double power(double number1, double number2){
        logger.info("[POWER FUNCTION] - " + number1 + "RAISED TO THE POWER" + number2);
        double result = Math.pow(number1, number2);
        logger.info("[RESULT - POWER FUNCTION - " + result);
        return result;
    }
}
