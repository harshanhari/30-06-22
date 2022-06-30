package creationalDesignPattern;

public abstract class Loan {
	double rate;

	abstract void getIntrestRate(double rate);

	public void calculateLoanPayement(double loanamount, int years) {
		int n = years * 12;
		rate = rate / (1200);
		double EMI = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanamount;
		System.out.println("\nYour monthly EMI is " + EMI + " for the amount" + loanamount);
	}
}
