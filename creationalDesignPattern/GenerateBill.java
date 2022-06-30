package creationalDesignPattern;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
		GetPlanFactory p1 = new GetPlanFactory();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the plan name : ");
		String planName = sc.nextLine();
		System.out.print("Enter the unit : ");
		int unit = sc.nextInt();
		Plan p = p1.getPlan(planName);
		p.getRate();
		p.calculateBill(unit);

	}

}
