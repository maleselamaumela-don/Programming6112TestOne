//Main class:
package com.mycompany.st10515042_prog6112_test_q2;

import java.util.Scanner;

public class ST10515042_PROG6112_Test_Q2 {//start of class

    public static void main(String[] args) {//start of main method
        
        //Scanner: for the user to be able to input data.
        Scanner input = new Scanner(System.in);
        
       int choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Select the beverage type"
                                + "\n1) PS5"
                                + "\n2) XBOX"
                                + "\n3) SWITCH ");
                        String ConsoleType = input.nextLine(); 
                        break;
                        
                    case 2:
                        System.out.println("Enter the store: ");
                        String Store = input.nextLine();
                        
                        System.out.println("Enter the total sales of " + "consoles" );
                        int TotalSales = input.nextInt();
                        break;
                        
                    case 3:
                        //Instatiating the ConsoleSales class:
//                        ConsoleSales sales = new ConsoleSales(Store, TotalSales);
//                        sales.printReport();
                        break;

                }
                
                //closing the scanner:
                input.close();

                
    }//end of main method
}//end of class
