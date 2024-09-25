/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxcalculate;

import java.util.Scanner;

/**
 *
 * @author Nhan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // src/main/java/com/example/Main.java



        Scanner scanner = new Scanner(System.in);
        TaxCalculator calculator = new TaxCalculator();

        // User input
        System.out.print("Enter salary: ");
        float salary = scanner.nextFloat();

        System.out.print("Enter tax-exempt amounts: ");
        float taxExempt = scanner.nextFloat();

        System.out.print("Enter number of dependents: ");
        int numDependents = scanner.nextInt();

        // Calculate tax
        float tax = calculator.fncPersonalIncomeTax(salary, taxExempt, numDependents);

        // Display result
        if (tax == -1) {
            System.out.println("Invalid salary.");
        } else if (tax == 0) {
            System.out.println("No tax to pay.");
        } else {
            System.out.printf("Calculated Tax: %.2f\n", tax);
        }

        scanner.close();
    }
}
   
    

