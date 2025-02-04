package OverAllJavaProgram;

import java.util.Scanner;

public class ComputerShopYearlyRevenue {
	
    public static void main(String[] args) {
		
        int unitsSold = 100000;
        int monthlyMiscFee = 50000;
        String[] customerNames = new String[3];
        int[] customerUnits = new int[3];
        int totalSales = 0;
        int vatableSales = 0;

        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the names of the three customers
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the name of customer " + (i+1) + ": ");
            customerNames[i] = scanner.nextLine();
        }

        // Ask the user to enter the number of units purchased by each customer
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the number of units purchased by " + customerNames[i] + ": ");
            customerUnits[i] = scanner.nextInt();
        }

        // Calculate the total sales and vatable sales
        for (int i = 0; i < 3; i++) {
            int unitPrice = 10000; // Assume the unit price is 10000 pesos
            double discount = 0; // Assume there are no discounts
            int sales = (int)(customerUnits[i] * unitPrice * (1 - discount));
            totalSales += sales;
            if (customerUnits[i] < 3000) { // Assume VAT is only applicable to customers who purchase less than 3000 units per month
                vatableSales += sales;
            }
        }

        // Calculate the VAT
        int vat = (int)(vatableSales * 0.12);

        // Calculate the total revenue for the year
        int totalRevenue = totalSales - vat + (12 * monthlyMiscFee);

        // Display the results
        System.out.println("Total sales: " + totalSales);
        System.out.println("VATable sales: " + vatableSales);
        System.out.println("VAT: " + vat);
        System.out.println("Total revenue: " + totalRevenue);
    }
}
