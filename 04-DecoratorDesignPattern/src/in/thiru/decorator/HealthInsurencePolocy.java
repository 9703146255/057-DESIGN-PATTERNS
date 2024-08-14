package in.thiru.decorator;

public class HealthInsurencePolocy implements InsurencePolocy {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Basic Health Insurence polocy";
	}

	@Override
	public Double calculatePremium() {
		// TODO Auto-generated method stub
		return 8000.00;
	}

}
