package com.va.week1.assign1.Driver;

import java.util.Scanner;

import com.va.week1.assign1.CurrencyChange;
import com.va.week1.assign1.GradeCalculation;
import com.va.week1.assign1.LitersToGallons;
import com.va.week1.assign1.MilesToKms;

public class DriverMain {

	public static void main(String[] args) {
		

	/*
	 * Create objects for classes of Task a-d.	
	 * 
	 * 
	 */
		
	// for example tasks grade calculation goes as below..
		GradeCalculation gc = new GradeCalculation();
		MilesToKms mk = new MilesToKms();
		LitersToGallons lg = new LitersToGallons();
		CurrencyChange cu = new CurrencyChange();
// create objects for all the classes..  and then call the method using switch case.. 

	System.out.println("Enter the choice for operation  1.-GradeCalcuation, 2-MilestoKms, 3-LitersToGallons, 4-CADtoUSD");
	try (Scanner sc = new Scanner(System.in)) {
		int choice=sc.nextInt();
		    switch (choice) {
		      case 1:
		    	System.out.println("Doing Grade Calculation.. ");
		      	gc.GradeCalc();
		        break;
		      case 2:
			        System.out.println("Doing Miles to Kilometres");
			        mk.MilesKms();
			        break;
		      case 3:
			        System.out.println("Doing liters to gallons");
			        lg.LiTGall();
			        break;
		      case 4:
			        System.out.println("Doing CAD to USD");
			        cu.Exchange();
			        break;
			  default:
			        System.out.println("Unrecognized input");
			        break;
		    }
	} catch (Exception e) {
		
		
	}
	}

}
