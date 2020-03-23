import java.util.Random;

// U1 rocket
public class U1 extends Rocket {
	
//	Constructor
	public U1() {
		this.setCost(100);
		this.setWeight(10000);
		this.setMaxWeight(18000);
		this.setLaunchExp(0.05);
		this.setLandCrash(0.01);
		this.setCargo_carried(0);
		this.setCargo_limit(this.getMaxWeight() - this.getWeight());
		
	}
	

	
//	Returns launch explosion probability outcome
	@Override
	public boolean launch() {
		if(new Random().nextDouble() <= 0.05 *(getCargo_carried() / getCargo_limit())) {
			return false;
		} else
			return true;
		
	}
	
//	Returns crash landing probability outcome
	@Override
	public boolean land() {
		if(new Random().nextDouble() <= 0.01 *(getCargo_carried() / getCargo_limit())) {
			return false;
		} else
			return true;
	}
}
