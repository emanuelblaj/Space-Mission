
public class Item {

	private String name = "" ;
	private int weight = 0 ;
	
	public Item() {
		this.name = "";
		this.weight = 0;
	}
	
	public Item(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	} 
	
}
