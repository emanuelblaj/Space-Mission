
public interface SpaceShip {
	boolean launch();
	boolean land();
	void carry(Item item);
	boolean canCarry(Item item);

}
