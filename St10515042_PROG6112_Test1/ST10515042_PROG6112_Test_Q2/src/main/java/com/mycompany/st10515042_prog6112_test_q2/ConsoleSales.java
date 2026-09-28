//Subclass:
package com.mycompany.st10515042_prog6112_test_q2;

public class ConsoleSales extends Consoles{//start of class

    //Constructor:
    public ConsoleSales(String ConsoleType, String Store, int TotalSales) {
        super(ConsoleType, Store, TotalSales);
    }
    
    public void printReport(){
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("**************************************************");
        System.out.println("CONSOLE TYPE: " +  getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }

}//end of class
