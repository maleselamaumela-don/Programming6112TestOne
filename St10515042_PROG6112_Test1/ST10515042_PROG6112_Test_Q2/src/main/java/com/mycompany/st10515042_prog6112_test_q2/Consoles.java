//Abstract class:
package com.mycompany.st10515042_prog6112_test_q2;

public abstract class Consoles implements IConsole{//start of class
    
    //Variables required:
    String ConsoleType;
    String Store;
    int TotalSales;
    
    //Constructor:
    public Consoles(String ConsoleType, String Store, int TotalSales) {
        this.ConsoleType = ConsoleType;
        this.Store = Store;
        this.TotalSales = TotalSales;
    }
    
    //Get mathod:
    @Override
    public String getConsoleType() {
        return ConsoleType;
    }

    @Override
    public String getStore() {
        return Store;
    }

    @Override
    public int getTotalSales() {
        return TotalSales;
    }
 
}//end of class
