import java.util.Random;

public class U2 extends Rocket {
	
//	Constructors
	public U2() {
		this.setCost(120);
		this.setWeight(18000);
		this.setMaxWeight(29000);
		this.setLaunchExp(0.04);
		this.setLandCrash(0.08);
		this.setCargo_carried(0);
		this.setCargo_limit(this.getMaxWeight() - this.getWeight());
	}
	
//	Returns launch explosion probability outcome
	@Override
	public boolean launch() {
		if(new Random().nextDouble() <= 0.04 * (getCargo_carried() / getCargo_limit())) {
			return false;
		} else 
			return true;
	}
	
//	Returns crash landing probability outcome
	@Override
	public boolean land() {
		if(new Random().nextDouble() <= 0.08 *(getCargo_carried() /getCargo_limit())) {
			return false;
			
		} else
			return true;
	}

}
