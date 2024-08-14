package in.thiru.decorator;

public class AccidentCoverageDecorator extends InsurencePolocyDecorator {

	public AccidentCoverageDecorator(InsurencePolocy insurencePolocy) {
		super(insurencePolocy);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Double calculatePremium() {
		// TODO Auto-generated method stub
		return super.calculatePremium()+1000.00;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription()+", Added Accidental Coverage";
	}

}
