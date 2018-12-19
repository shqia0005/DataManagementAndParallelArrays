/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data.management.and.parallel.arrays;
import java.util.Scanner;

/**
 *
 * @author jeqia0005
 */
public class DataManagementAndParallelArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        String userInput;
        int entries = 0;
        int choice = 0;
        boolean valid =false;
        
        while (valid == false)
        {
            System.out.println("Enter the number of teams: ");
            userInput = keyedInput.nextLine();
            System.out.println("");
            
            try
            {
                entries = Integer.parseInt(userInput);
                valid = true;
            }
            
            catch (NumberFormatException e)
            {
                System.out.println("Sorry, that was not valid input.");
                System.out.println("");
            }
        }
        
        String productName [ ] = new String [entries];
        double subtotal [ ] = new double [entries];
        double tax[ ] = new double [entries];
        double grandtotal [ ] = new double [entries];
        
        
        System.out.println("-----DATA ENTRY-----");
        for(int i = 0; i < entries; i = i + 1)
        {
            System.out.println("");
            System.out.println("Enter the name for product " + (i + 1) + ": ");
            productName[i] = keyedInput.nextLine();
            
            valid = false;
            while (valid == false)
            {
                System.out.println("Enter the subtotal for " + productName[i] + ": ");
                userInput = keyedInput.nextLine();
                
                try
                {
                    subtotal[i] = Double.parseDouble(userInput);
                    valid = true;
                }
                
                catch (NumberFormatException e)
                {
                    System.out.println("Sorry, that was not valid input.");
                }
                
            }
            
            valid = false;
            while (valid == false)
            {
                System.out.println("Enter the tax for" + productName[i] + ": ");
                userInput = keyedInput.nextLine();
                
                try
                {
                    tax[i] = Double.parseDouble(userInput);
                    valid = true;
                }
                
                catch (NumberFormatException e)
                {
                    System.out.println("Sorry, that was not valid input.");
                }
            }
        
            for(int i = 0; i < entries; i = i + 1)
            {
                grandtotal[i] = subtotal[i] + tax[i];
            }
            
            while (choice != 4)
            { valid = false;
              while (valid == false)
              {   System.out.println("");
            System.out.println("Select an option");
            System.out.println("1...Output subtotals");
            System.out.println("2...Output taxes");
            System.out.println("3...Output grandtotals");
            System.out.println("4...Exit");
            System.out.println("Enter your choice");
            userInput = keyedInput.nextLine();
            System.out.println("");
            
            try
            {
                choice = Integer.parseInt(userInput);
                valid = true;
            }
            catch (NumberFormatException e)
                {
                    System.out.println("Sorry, that was not valid input.");
                }
              }
        
        switch(choice)
        {
            case 1:
            {
                System.out.println("The subtotal for " + productName[i] + " is" + subtotal[i]);
            }
            case 2:
            {
                System.out.println("The tax for " + productName[i] + " is" + tax[i]);
            }
            case 3:
            {
                System.out.println("The grandtotal for " + productName[i] + " is" + grandtotal[i]);
            }
        }
 
    }
    }
    }
}
    

