package com.va.week1.assign1;
import java.math.BigDecimal;
/**
 * @author Shan.M
 * @Since 17th Sept 2026
 * @code for converting CAD to USD with the exchange rate it was when I wrote the code originally
 */
import java.util.Scanner;

public class CurrencyChange {
	String caUs;
	BigDecimal numInp;
	BigDecimal CADtUSDrate = new BigDecimal("0.71");
	public void Exchange() {
		try(Scanner inp = new Scanner(System.in)) {
			System.out.println("CAD to USD converter");
			/*System.out.print("cad or usd? ");
			caUs = inp.next().trim().toLowerCase();
			if(caUs!="cad"&&caUs!="usd") {throw new Exception("enter either 'cad' or 'usd'");}*/
			numInp = inp.nextBigDecimal();
			inp.close();
			numInp = numInp.multiply(CADtUSDrate);
			System.out.println("USD: "+numInp);
		} catch(Exception e) {
			
		}
	}
}
