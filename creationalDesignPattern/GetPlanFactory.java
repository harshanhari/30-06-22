package creationalDesignPattern;

public class GetPlanFactory {
	Plan getPlan(String planName) {
		if (planName.equalsIgnoreCase("Domestic")) {
			return new DomesticPlan();
		} else if (planName.equalsIgnoreCase("Commercial")) {
			return new CommercialPlan();
		} else if (planName.equalsIgnoreCase("Institutional")) {
			return new InstitutionalPlan();
		} else {
			return null;
		}
	}
}
