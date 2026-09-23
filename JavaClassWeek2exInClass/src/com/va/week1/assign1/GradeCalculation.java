package com.va.week1.assign1;
import java.util.Scanner;
/**
 * @author Shan.M
 * @Since 16th Sept 2026
 * @code for displaying the grade point average
 */
public class GradeCalculation {
	public void GradeCalc() {
		int classCount = 0;
		int classMarks[];
		String classNames[];
		float total = 0, avg;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("How many courses are you taking this Semester? ");
			classCount = scanner.nextInt();
			classMarks = new int[classCount];
			classNames = new String[classCount];
			for (int i = 0; i < classCount; i++) {
				System.out.print("Class name: ");
				classNames[i] = scanner.next();
				System.out.print(classNames[i]+" mark: ");
				classMarks[i] = scanner.nextInt();
				total += classMarks[i];
			}
			scanner.close();
			avg = total / classCount;
			System.out.print("The student Grade is: "+avg+" which is a");
			switch((int)(avg/10-(avg%10))) {
				case 10:
				case 9: System.out.print("n A"); break;
				case 8: System.out.print(" B"); break;
				case 7: System.out.print(" C"); break;
				default: System.out.print(" D"); break;
			}
		} catch (Exception e) {
			
			
		}

		// Calculating average here
		
	}
}
