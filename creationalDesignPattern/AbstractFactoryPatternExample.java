package creationalDesignPattern;

import java.util.Scanner;

public class AbstractFactoryPatternExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner nu = new Scanner(System.in);
		System.out.print("Enter the Bank name : ");
		String bankName = sc.nextLine();
		System.out.println();
		System.out.print("Enter the type of Loan : ");
		String loanName=sc.nextLine();
		System.out.println();
		AbstractFactory bankFactory=FactoryCreator.getFactory("BANK");
		Bank b=bankFactory.getBank(bankName);
		System.out.println();
		System.out.print("Enter the intreast for "+b.getBankName()+" : ");
		double rate=nu.nextDouble();
		System.out.println();
		System.out.print("Enter the loan amount : ");
		double loanAmount=nu.nextDouble();
		System.out.println();
		System.out.println("Enter the years needed to return loan amount : ");
		int years=nu.nextInt();
		System.out.println();
		System.out.print("You are taking the Loan from "+b.getBankName()+" Bank");
		System.out.println();
		AbstractFactory loanFactory=FactoryCreator.getFactory("Loan");
		Loan l=loanFactory.getLoan(loanName);
		l.getIntrestRate(rate);
		l.calculateLoanPayement(loanAmount, years);
		
		
		
	}

}
