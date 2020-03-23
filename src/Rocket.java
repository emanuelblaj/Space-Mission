
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

	public void setCargo_carried(double itemWeight) {
		this.cargo_carried += itemWeight;
	}

	public double getCargo_limit() {
		return cargo_limit;
	}

	public void setCargo_limit(double cargoTotal) {
		this.cargo_limit = cargoTotal;
	}

//	Tests to see if rocket can carry more items
	 @Override
	public boolean canCarry(Item item) {
		double itemWeight = item.getWeight();
		if(itemWeight + cargo_carried > cargo_limit) {
			return false;
		} else {
		carry(item);
		return true;
	}
	 }
	 
//	 Adds item to cargo
	 @Override
	public void carry(Item item) {
		cargo_carried += item.getWeight();
	}

	@Override
	public boolean launch() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean land() {
		// TODO Auto-generated method stub
		return true;
	}
}
