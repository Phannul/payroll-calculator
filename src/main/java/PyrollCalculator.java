import java.sql.SQLOutput;
import java.util.Scanner;

public class PyrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        userInput(myScanner);

    }


    static void userInput(Scanner inputScanner) {
        System.out.println("Please Enter Your Name: ");
        String Input = inputScanner.nextLine();

        System.out.println("Hello " + Input + ",Please Provide How many Hours you've Worked: ");
        Input= inputScanner.nextLine();
        double numberOfHours = Double.parseDouble(Input);



        System.out.println("And What is Your Base Salary in USD: ");
        Input = inputScanner.nextLine();
        double baseSalary = Double.parseDouble(Input);
        calculate(Input, numberOfHours, baseSalary);

    }

    static void calculate(String Input, double numberOfHours, double baseSalary) {

        double grossSalary = numberOfHours * baseSalary;
        double overtimeHours = numberOfHours - 40;
        double overTimeSalary = grossSalary + (overtimeHours * 1.5 * baseSalary);
        if (Input.isEmpty() == false && numberOfHours > 40) {
            System.out.printf("you have worked overtime for %.1f hours, so your total salary will be %.2f", overtimeHours, overTimeSalary);
        } else if (Input.isEmpty() == false) {
            System.out.printf("you Worked for %.2f Hours, Considering your base salary of %.2f, your gross salary is: %.2f", numberOfHours, baseSalary, grossSalary);

        } else {
            System.out.println("You Don't Work here Do you? 🤔");
        }
    }
}
