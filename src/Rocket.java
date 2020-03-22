
public class Rocket implements SpaceShip {
	
	private int cost;
	private int weight;
	private int maxWeight;
	private double launchExp;
	private double landCrash;
	private double cargo_carried;
	private double cargo_limit;
	
public Rocket() {
	this.setCost(0);
	this.setWeight(0);
	this.setMaxWeight(0);
	this.setLaunchExp(0.0);
	this.setLandCrash(0.0);
	this.setCargo_carried(0.0);
	this.setCargo_limit(0.0);
}
	
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public double getLaunchExp() {
		return launchExp;
	}

	public void setLaunchExp(double launchExp) {
		this.launchExp = launchExp;
	}

	public double getLandCrash() {
		return landCrash;
	}

	public void setLandCrash(double landCrash) {
		this.landCrash = landCrash;
	}

	public double getCargo_carried() {
		return cargo_carried;
	}

	public void setCargo_carried(double cargo_carried) {
		this.cargo_carried = cargo_carried;
	}

	public double getCargo_limit() {
		return cargo_limit;
	}

	public void setCargo_limit(double cargo_limit) {
		this.cargo_limit = cargo_limit;
	}

	@Override
	public boolean land() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean launch() {
		// TODO Auto-generated method stub
		return false;
	}
	 @Override
	public boolean canCarry(int weight) {
		// TODO Auto-generated method stub
		return false;
	}
	 @Override
	public void carry(int weight) {
		// TODO Auto-generated method stub
		
	}
}
