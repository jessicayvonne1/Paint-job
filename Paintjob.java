
package com.mycompany.chapter4project;

/*
Chapter 4 Project Paint Job

This project computes the cost of the paint, the labor charges, number of 
gallons of paint and the hours of labor required to complete the paint job.
It will also tell the total cost of the paint job.

Program written by: Jessica Wilson
Date written: 1/23/2022
*/

import java.text.NumberFormat;
import java.util.Scanner;


public class Paintjob {

    
    public static void main(String[] args) {
       
        //instantiating the Scanner object
        Scanner input = new Scanner(System.in);
       
       System.out.println("How many square feet will be painted?");
       double wallSpace = input.nextDouble();
       
       System.out.println("What is the price of paint per gallon?");
       double paintPrice = input.nextDouble();
       
       //calculate how much paint is required
      double requiredPaint;
      requiredPaint = wallSpace / 115;
       
       //Prints the wall area to paint/casting the int type to remove the decimal
       System.out.println("Wall area to paint is " + (int)wallSpace + " square feet");
       
       //prints the paint required to the higher integer
       System.out.print("Paint required: " + Math.ceil(requiredPaint)+ " ");
       
     
       // formula for gallons of paint cost
       
       double gallonCost;
       gallonCost = Math.ceil(requiredPaint) * paintPrice;
       NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
       
       System.out.println("Gallons paint cost: " + currencyFormatter.format(gallonCost));
       
       //formula for hours of labor required rounded to the nearest integer
       
       double hoursLabor;
       hoursLabor = Math.round(requiredPaint) * 8;
       System.out.print("Hours Required : " + hoursLabor+" ");
       
       
       //formula for labor charges
       double laborCharges;
       laborCharges = hoursLabor * 20.0;
       System.out.println("Labor Charges : " + currencyFormatter.format(laborCharges));
       
       //Total Paint Job Cost
       double totalCost;
       totalCost = gallonCost + laborCharges;
       System.out.println("Total Paint Job Cost: " + currencyFormatter.format(totalCost));
      
       
       
       
       
       
    }
    
}
