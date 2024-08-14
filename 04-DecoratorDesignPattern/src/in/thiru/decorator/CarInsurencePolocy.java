package in.thiru.decorator;

public class CarInsurencePolocy implements InsurencePolocy {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Basic car Insurence polocy";
	}

	@Override
	public Double calculatePremium() {
		// TODO Auto-generated method stub
		return 10000.00;
	}

}
