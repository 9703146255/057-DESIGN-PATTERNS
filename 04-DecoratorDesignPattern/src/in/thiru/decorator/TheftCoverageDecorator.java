package in.thiru.decorator;

public class TheftCoverageDecorator extends InsurencePolocyDecorator{

	public TheftCoverageDecorator(InsurencePolocy insurencePolocy) {
		super(insurencePolocy);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Double calculatePremium() {
		// TODO Auto-generated method stub
		return super.calculatePremium()+2000;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription()+", Added TheftCoverage plan :)";
	}

}
