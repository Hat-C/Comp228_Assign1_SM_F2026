package com.va.week1.assign1;
import java.util.Scanner;
/**
 * @author Shan.M
 * @Since 22nd Sept 2026
 * @code for converting liters to gallons and back
 */
public class LitersToGallons {
	public void LiTGall() {
		String whichMeth;
		double inputNum;
		try(Scanner inp = new Scanner(System.in)) {
			System.out.println("enter\n1 or li for liters to gallons\n2 or g for gallons to liters");
			whichMeth = (inp.next()).toUpperCase().trim();
			switch(whichMeth) {
			case "LI","1": System.out.print("liters "); break;
			case "G","2": System.out.print("gallons "); break;
			default:
				System.out.println("["+whichMeth+"] not recognized");
				throw new Exception("invalid input");
			}
			System.out.print("[number only]: ");
			inputNum = inp.nextDouble();
			inp.close();
			if(whichMeth=="LI"||whichMeth=="1") {
				System.out.println(inputNum+" liters = "+(inputNum*0.264172)+" gallons");
			} else {
				System.out.println(inputNum+" gallons = "+(inputNum*3.785412)+" liters");
			}	
		} catch(ArithmeticException e) {
			System.out.println("incorrect input type");
		} catch(Exception e) {
			System.out.println("program exited");
		}
	}
}
