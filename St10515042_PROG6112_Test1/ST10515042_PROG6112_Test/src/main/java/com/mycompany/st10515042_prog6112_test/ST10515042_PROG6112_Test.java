
package com.mycompany.st10515042_prog6112_test;

public class ST10515042_PROG6112_Test {//start of class

    public static void main(String[] args) {//start of main method

        //Populating the array:
        String GamingConsole[]={"PS5","XBOX","SWITCH"};//single array
        String City[]={"CAPE TOWN","PORT ELIZABETH","PRETORIA"};//single array
        int NumberOfSales[][]={{1000,2000,3000},
                               {2000,3000,4000},
                               {1500,1100,1200}};//2D-array
        
        //HEADER:
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------------------------------------------------------");
        
        //FOR LOOP: that will display the GamingConsole[]
        for (int i = 0; i < GamingConsole.length; i++) {
            System.out.print("" + "\t" + GamingConsole[i]);
        }
        System.out.println("");
        
        //NESTED LOOP: that will display the City[] AND NumberOfSales[][]
        for (int i = 0; i < 3; i++) {
            System.out.print("" + City[i]+ "\t");
            for (int j = 0; j < 3; j++) {
                int total =0;
                System.out.print("" + "\t" + NumberOfSales[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        
        //HEADER:
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------------------------------------------------------");
        
        //NESTED LOOP: that will display the City[] AND Total
        for (int i = 0; i < 3; i++) {
            int total =0;
            for (int j = 0; j < 3; j++) {
                total += NumberOfSales[i][j];
            }
            System.out.println(City[i] + "\t"+  total);
        }
        System.out.println("");
        
        
        //NESTED LOOP: that will display the City[] AND Total
        int max = NumberOfSales[0][0];
        String HighestCity="";
        int highest=0;
        
        for (int i = 0; i < 3; i++) {
            int total =0;
            for (int j = 0; j < 3; j++) {
                total += NumberOfSales[i][j];
                int current = NumberOfSales[i][j];
                
                //Selection statement:
                if(current>max){
                max=current;
                HighestCity=City[i];

                }
            } 
        }
        
        System.out.print("CITY WITH THE MOST SALES: " +  HighestCity + "\n");
        System.out.println("----------------------------------------------------------------------------------------");
    }//end of main method
}//end of class
