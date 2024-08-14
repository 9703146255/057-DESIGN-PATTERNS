package in.thiru.decorator;

public class MainDecorator {
	
	public static void main(String[] args) {
		
			InsurencePolocy carInsurance= new CarInsurencePolocy();
		
	        System.out.println("Base Car Insurance: " + carInsurance.getDescription() +
	                           ", Premium: $" + carInsurance.calculatePremium());

	        // Adding accident coverage
	        carInsurance = new AccidentCoverageDecorator(carInsurance);
	        System.out.println("Car Insurance with Accident Coverage: " + carInsurance.getDescription() +
	                           ", Premium: $" + carInsurance.calculatePremium());

	        // Adding theft coverage
	        carInsurance = new TheftCoverageDecorator(carInsurance);
	        System.out.println("Car Insurance with Theft Coverage: " + carInsurance.getDescription() +
	                           ", Premium: $" + carInsurance.calculatePremium());
		
	}

}
