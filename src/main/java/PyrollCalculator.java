import java.sql.SQLOutput;
import java.util.Scanner;

public class PyrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please Enter Your Name: ");
        String Input = myScanner.nextLine();

        System.out.println("Hello " + Input + ",Please Provide How many Hours you've Worked: ");
        Input = myScanner.nextLine();

        double numberOfHours = Double.parseDouble(Input);

        System.out.println("And What is Your Base Salary in USD: ");
        Input = myScanner.nextLine();
        double baseSalary = Double.parseDouble(Input);

        double grossSalary = numberOfHours * baseSalary;
        if (Input.isEmpty() == false){
            System.out.printf("you Worked for %.2f Hours, Considering your base salary of %.2f, your gross salary is: %.2f", numberOfHours ,baseSalary ,grossSalary);
        }
        else{
            System.out.println("You Don't Work here Do you? 🤔");
        }







    }
}
