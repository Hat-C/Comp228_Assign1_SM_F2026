package com.va.week1.assign1;
import java.util.Scanner;
/**
 * @author Shan.M
 * @Since 17th Sept 2026
 * @code for converting miles to or from kilometres
 */
public class MilesToKms {
	static public double MileTKm(double miles) { return miles*1.609344; }
	static public double KmTMile(double km) { return km*0.6213712; }
	public void MilesKms() {
		String whichMeth;
		double inputNum;
		try(Scanner inp = new Scanner(System.in)) {
			System.out.println("enter\n1 or m for miles to kilometers\n2 or km for kilometers to miles");
			whichMeth = (inp.next()).toUpperCase().trim();
			switch(whichMeth) {
			case "M","1": System.out.print("miles "); break;
			case "KM","2": System.out.print("kilometers "); break;
			default:
				System.out.println("["+whichMeth+"] not recognized");
				throw new Exception("invalid input");
			}
			System.out.print("[number only]: ");
			inputNum = inp.nextDouble();
			inp.close();
			if(whichMeth=="M"||whichMeth=="1") {
				System.out.println(inputNum+" miles = "+MileTKm(inputNum)+" km");
			} else {
				System.out.println(inputNum+" km = "+KmTMile(inputNum)+" miles");
			}
		} catch(ArithmeticException e) {
			System.out.println("incorrect input type");
		} catch(Exception e) {
			System.out.println("program exited");
		}
	}
}
